drop table if exists klijent cascade;
drop table if exists kredit cascade;
drop table if exists tip_racuna cascade;
drop table if exists racun cascade;

drop sequence if exists klijent_seq;
drop sequence if exists kredit_seq;
drop sequence if exists tip_racuna_seq;
drop sequence if exists racun_seq;

create table kredit (
	id integer not null,
	naziv varchar (100) not null,
	oznaka varchar (20) not null,
	opis varchar (500) 
);

create table tip_racuna (
	id integer not null,
	naziv varchar(100) not null,
	oznaka varchar (20) not null,
	opis varchar (500)
);

create table klijent (
	id integer not null,
	ime varchar (50) not null,
	prezime varchar (50) not null,
	broj_lk integer not null,
	kredit integer not null
);

create table racun (
	id integer not null,
	naziv varchar (100) not null,
	oznaka varchar (20) not null,
	opis varchar (500),
	tip_racuna integer not null,
	klijent integer not null);
	
alter table kredit add constraint pk_kredit_id primary key (id);
alter table tip_racuna add constraint pk_tip_racuna_id
primary key (id);
alter table klijent add constraint pk_klijent_id primary key (id);
alter table racun add constraint pk_racun_id primary key (id);

alter table klijent add constraint fk_klijent_kredit foreign key (kredit)
references kredit (id);
alter table racun add constraint fk_racun_tip_rac foreign key (tip_racuna)
references tip_racuna (id);
alter table racun add constraint fk_racun_klijent foreign key (klijent) 
references klijent (id);

create index IDXFK_Klijent_kredit on klijent (kredit);
create index INXFK_racun_tip_rac on racun (tip_racuna);
create index INXFK_racun_klijent on racun (klijent);


create sequence kredit_seq
increment by 1;
create sequence klijent_seq
increment by 1;
create sequence tip_racuna_seq
increment by 1;
create sequence racun_seq
increment by 1;

