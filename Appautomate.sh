#!/bin/bash
echo '
[Unit]
Description=gunicorn daemon
After=network.target
[Service]
User=root
Group=www-data
WorkingDirectory=/home/ubuntu/chatapplication/
ExecStart=/usr/bin/gunicorn --workers 3 --bind unix:/home/ubuntu/chatapplication/chatapplication.sock chatapplication.wsgi:application
[Install]
WantedBy=multi-user.target' > /etc/systemd/system/gunicorn.service
systemctl daemon-reload
systemctl start gunicorn
systemctl enable gunicorn
echo '
server {
 listen 80;
 server_name _;
 location = /favicon.ico { access_log off; log_not_found off; }
 location /static/ {
     root /home/ubuntu/chatapplication/;
 }
 location / {
     include proxy_params;
     proxy_pass http://unix:/home/ubuntu/chatapplication/chatapplication.sock;
 }
} ' > /etc/nginx/sites-available/chatapplication
sudo ln -s /etc/nginx/sites-available/chatapplication /etc/nginx/sites-enabled
nginx -t
sudo rm /etc/nginx/sites-enabled/default
service nginx restart
