insert into user_details(id,birth_date,name)
values(10001,current_date(),'Alok');

insert into user_details(id,birth_date,name)
values(10002,current_date(),'Aniket');

insert into user_details(id,birth_date,name)
values(10003,current_date(),'Akriti');

insert into post(id,description,user_id)
values(20001,'Learning rest',10001);

insert into post(id,description,user_id)
values(20002,'Learning microservices',10001);

insert into post(id,description,user_id)
values(20003,'Learning aws',10001);