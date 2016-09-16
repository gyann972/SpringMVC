drop table task;
drop table todo_list;
drop table usr;

drop sequence seq_usr;
drop sequence seq_todo_list;
drop sequence seq_task;

create table usr (
	id int primary key, 
	login varchar(60) not null,
	firstname varchar(60) not null,
	lastname varchar(60) not null,
	password varchar(60) not null
);

create sequence seq_usr;

create table todo_list (
	id int primary key, 
	id_usr int,
	label varchar(60),
	status int,   -- 0 = actif,  1 = archive, 2 = delete
	constraint fk_todo_list_usr foreign key (id_usr) references usr(id)
);

create sequence seq_todo_list;

create table task  (
	id int primary key,
	id_list int,
	target_date timestamp, 
	title varchar(300), 
	content varchar(3000),
	done_date timestamp, -- if done = null
	constraint fk_task_list foreign key (id_list) references todo_list(id)
);

create sequence seq_task;

