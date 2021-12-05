insert into hotel(id, name, price) values(1, 'Lux Hotel', 10000);
insert into hotel(id, name, price) values(2, '5* Hotel', 5000);
insert into hotel(id, name, price) values(3, '4* Hotel', 2500);
insert into hotel(id, name, price) values(4, '3* Hotel', 1000);

insert into tour(id, name, price) values(1, 'Resort in Turkey', 10000);
insert into tour(id, name, price) values(2, 'Resort in Bulgari', 150000);
insert into tour(id, name, price) values(3, 'Resort in Egypt', 20000);
insert into tour(id, name, price) values(4, 'Ski Resort in Minsk', 13000);
insert into tour(id, name, price) values(5, 'Tour of the Sights of Europe', 25000);
insert into tour(id, name, price) values(6, 'Golf in the USA', 32000);
insert into tour(id, name, price) values(7, 'Health and Wellness Center in Warsaw', 20000);
insert into tour(id, name, price) values(8, 'Ecological Expedition to Africa', 40000);
insert into tour(id, name, price) values(9, 'Excursion to the Religious Sites of Europe', 30000);

insert into client(id, username, password, name, phone_number) values(1, 'admin', '$2a$10$5sPIpxHJAoHMcMAm8yIWsunO48hc5ou3Sp1fqYE6wILyHr.p2rHV2', 'Admin', '+375259876543');
insert into role(id, client_id, name) values(1, 1, 'ROLE_ADMIN');
insert into client(id, username, password, name, phone_number) values(2, 'user1', '$2a$10$nuUdVn8ngphUMk5JbAsBVeVUsr8qqJczBS6q5OWS70zVSdeXXlEe6', 'User 1', '+375251234556');
insert into role(id, client_id, name) values(2, 2, 'ROLE_USER');
insert into client(id, username, password, name, phone_number) values(3, 'user2', '$2a$10$nuUdVn8ngphUMk5JbAsBVeVUsr8qqJczBS6q5OWS70zVSdeXXlEe6', 'User 2', '+375257654321');
insert into role(id, client_id, name) values(3, 3, 'ROLE_USER');
insert into client(id, username, password, name, phone_number) values(4, 'user3', '$2a$10$nuUdVn8ngphUMk5JbAsBVeVUsr8qqJczBS6q5OWS70zVSdeXXlEe6', 'User 3', '+375255647382');
insert into role(id, client_id, name) values(4, 4, 'ROLE_USER');
