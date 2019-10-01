/*create table document(id int not null primary key, doctype varchar(20) not null);

create table article(id int not null primary key, 
doctype varchar(20) DEFAULT 'Article', 
title varchar(250), 
content varchar(250) );

create table FAQ(id int not null primary key,
doctype varchar(20) DEFAULT 'FAQ',
question varchar(250),
answer varchar(250));

create table category(id int not null primary key,
categoryname varchar(25), document_id int, FOREIGN KEY(document_id) 
REFERENCES document(id));

create table user_roles(role varchar(25) primary key);

create table user_details(id int primary key , 
username varchar(25) , role varchar(25),
FOREIGN KEY(role) REFERENCES user_roles(role));

create table language(ID int primary key,LANGUAGE_NAME varchar(20));

create table knowledge_base(KNOWLEDGE_ID int primary key, 
KNOWLEDGE_DESC varchar(100),
CATEGORY_ID int,
LANGUAGE_ID int,
USER_ID int, FOREIGN KEY(CATEGORY_ID) REFERENCES category(id),
FOREIGN KEY(LANGUAGE_ID) REFERENCES language(id), 
FOREIGN KEY(USER_ID) REFERENCES user_details(id) );*/
