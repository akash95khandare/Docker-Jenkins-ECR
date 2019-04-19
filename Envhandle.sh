#!/bin/bash
cd /home/ubuntu/chatapplication/;pip3 install -r req.txt;pip3 install django;pip3 install channels;pip3 install django-environ;pip3 install gunicorn;
pip3 install mysqlclient;pip3 install virtualenv
echo 'DEBUG=TRUE
# DJANGO_SETTINGS_MODULE=myapp.settings.dev
SECRET_KEY=xux7u0pd8r#k)fbf6+s4!8uksw(e!-y!je($v_j7m1r+g@z32-
DATABASE_URL=mysql://chatapp:chatapp123@chatapp.cmhiaqrzjnrz.us-east-2.rds.amazonaws.com:3306/chatapp
' > /home/ubuntu/chatapplication/chatapplication/.env
