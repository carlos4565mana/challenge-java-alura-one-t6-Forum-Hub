INSERT INTO USERS( name,email, password) VALUES('Carlos', 'carlos@email.com', '123456');
INSERT INTO USERS( name,email, password) VALUES('Cesar', 'cesar@email.com', '123456');
INSERT INTO USERS( name,email, password) VALUES('Alana', 'alana@email.com', '123456');
INSERT INTO USERS( name,email, password) VALUES('Daiane', 'daiane@email.com', '123456');

INSERT INTO COURSE(category, name) VALUES('Programacao','React');
INSERT INTO COURSE(category, name ) VALUES('Linguas','Ingles');
INSERT INTO COURSE(category, name) VALUES('Banco de Dados','Postgres');
INSERT INTO COURSE(category, name) VALUES('Programacao','Java');


INSERT INTO TOPIC(title, message, created_at, status, user_id, course_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', ' NOT_ANSWERED', 1, 3);
INSERT INTO TOPIC(title, message, created_at, status, user_id, course_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', ' NOT_ANSWERED', 2, 2);
INSERT INTO TOPIC(title, message, created_at, status, user_id, course_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', ' NOT_ANSWERED', 3, 3);
INSERT INTO TOPIC(title, message, created_at, status, user_id, course_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', ' NOT_ANSWERED', 1, 1);
