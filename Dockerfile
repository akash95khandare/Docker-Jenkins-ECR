FROM python:3.6.7
MAINTAINER akash30khandare@gmail.com

RUN apt-get upgrade -y

RUN apt-get -y update && apt-get install -y python3-pip && apt-get install -y default-libmysqlclient-dev
RUN pip install --upgrade pip 
RUN pip3 install django && pip3 install virtualenv && pip3 install django-environ && pip3 install mysqlclient \
 					&& pip3 install psycopg2-binary && pip3 install psycopg2 && pip3 install gunicorn && pip3 install channels
COPY ./chatapplication /chatapplication
WORKDIR /chatapplication
RUN pip3 install -r req.txt  
ENV DATABASE_TYPE=mysql
ENV DATABASE_NAME=chatapp2
ENV USER_NAME=chatapp
ENV PASSWORD=chatapp123
ENV HOST_NAME=chatapp-1.cmhiaqrzjnrz.us-east-2.rds.amazonaws.com
ENV PORT=3306
CMD python3 manage.py migrate

EXPOSE 8000

CMD gunicorn --bind 0.0.0.0:8000 chatapplication.wsgi:application
