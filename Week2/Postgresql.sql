create database PJPpractice;
\l
\c pjppractice;
\dt
Create table test ( id integer, fname character(30));	
 alter table test add lname character(30);
alter table test rename lname to last_name;
 alter table test add primary key (id);
alter table test drop column last_name;
alter table test rename to test1;
