/*insert into KNOWLEDGE_BASE(knowledge_id, knowledge_desc) values (1, 'Knowledge 1');
insert into KNOWLEDGE_BASE(knowledge_id, knowledge_desc) values (2, 'Knowledge 2');

insert into CATEGORY(id, category_name, knowledge_id) values (1,'category 1', 1)
insert into CATEGORY(id, category_name, knowledge_id) values (2,'category2', 1)
insert into CATEGORY(id, category_name, knowledge_id) values (3,'category 3', 2)
insert into CATEGORY(id, category_name, knowledge_id) values (4,'category 4', 2)

insert into ARTICLE(id,doc_type, category_id, content, title) values (1,'ARTICLE',1,'content 11','title 11')
insert into ARTICLE(id,doc_type, category_id, content, title) values (2,'ARTICLE',1,'content 22','title 22')
insert into ARTICLE(id,doc_type, category_id, content, title) values (3,'ARTICLE',2,'content 33','title 33')
insert into ARTICLE(id,doc_type, category_id, content, title) values (4,'ARTICLE',3,'content 44','title 44')
insert into ARTICLE(id,doc_type, category_id, content, title) values (5,'ARTICLE',4,'content 55','title 55')

insert into FAQ(id, doc_type, category_id, question, answer) values (1, 'FAQ', 1, 'question 11', 'answer 11')
insert into FAQ(id, doc_type, category_id, question, answer) values (2, 'FAQ', 2, 'question 22', 'answer 22')
insert into FAQ(id, doc_type, category_id, question, answer) values (3, 'FAQ', 3, 'question 33', 'answer 33')
insert into FAQ(id, doc_type, category_id, question, answer) values (4, 'FAQ', 4, 'question 44', 'answer 44')

insert into UTIL_LANGUAGES(id, language_name, knowledge_id) values (1, 'English', '1')
insert into UTIL_LANGUAGES(id, language_name, knowledge_id) values (2, 'Hindi', '1')
insert into UTIL_LANGUAGES(id, language_name, knowledge_id) values (3, 'English', '2')

insert into USER_ROLES(role) values ('customer')
insert into USER_ROLES(role) values ('analyst')
insert into USER_ROLES(role) values ('reviewer')
insert into USER_ROLES(role) values ('author')

insert into USER_DETAILS(id, user_name, user_role, knowledge_id) values (1, 'user1', 'author', 1)
insert into USER_DETAILS(id, user_name, user_role, knowledge_id) values (2, 'user2', 'customer', 2)
insert into USER_DETAILS(id, user_name, user_role, knowledge_id) values (3, 'user3', 'reviewer', 3)
insert into USER_DETAILS(id, user_name, user_role, knowledge_id) values (4, 'user4', 'analyst', 4)

*/
