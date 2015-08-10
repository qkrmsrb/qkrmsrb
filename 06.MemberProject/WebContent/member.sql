drop table member;

create table member(
  id		varchar2(10) primary key,
  pwd		varchar2(10),
  name		varchar2(20),
  age		number(3,0),
  gender	varchar2(6),
  addr		varchar2(100),
  regdate	date default sysdate  
);