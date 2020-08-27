insert into kredit (id, naziv, oznaka, opis)
values (nextval('kredit_seq'), 'Gotovinski kredit', 'GK', 'Kredit namenjen svima kojima treba veci iznos gotovine');
insert into kredit (id, naziv, oznaka, opis)
values (nextval('kredit_seq'), 'Hipotekarni kredit', 'HK', 'Kredit za izgradnju i rekonstrukciju nepokretnosti');
insert into kredit (id, naziv, oznaka, opis)
values (nextval('kredit_seq'), 'Studentski kredit', 'StudK', 'Kredit namanjen studentima');
insert into kredit (id, naziv, oznaka, opis)
values (nextval('kredit_seq'), 'Potrosacki kredit', 'PK', 'Kredit namenjen za tacno zeljenje robe ili usluge');
insert into kredit (id, naziv, oznaka, opis)
values (nextval('kredit_seq'), 'Stambeni kredit', 'SK', 'Kredit namenjen svima koji zele novi dom');
insert into kredit (id, naziv, oznaka, opis)
values (nextval('kredit_seq'), 'Auto kredit', 'AK', 'Kredit namenjen svima koji zele da kupe novi automobil');

insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Dusan', 'Gacesa', 455555, 6);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Dragan', 'Martic', 457845, 6);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Mirjana', 'Pavlica', 578945, 6);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Marko', 'Markovic', 479855, 6);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Slavisa', 'Miric', 214587, 6);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Milica', 'Popov', 123456, 6);

insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Tamara', 'Grcic', 457896, 5);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Milan', 'Markovic', 456712, 5);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Luka', 'Lozo', 578945, 5);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Marko', 'Mileusnic', 479822, 5);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Katarina', 'Vulovic', 211111, 5);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Jovana', 'Djordjevic', 786542, 5);

insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Sofija', 'Grijak', 457812, 4);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Jovana', 'Manojlovic', 612547, 4);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Bojana', 'Kecman', 945126, 4);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Petar', 'Gavrilovic', 124587, 4);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Milan', 'Vujic', 412654, 4);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Nadja', 'Lotina', 111444, 4);

insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Dejana', 'Gajic', 555444, 3);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Tijana', 'Sljuka', 578451, 3);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Nebojsa', 'Golic', 741524, 3);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Zarije', 'Gojkovic', 695823, 3);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Slavisa', 'Katic', 852136, 3);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Mina', 'Vrbaski', 789456, 3);

insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Anabela', 'Bukva', 451698, 2);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Lejla', 'Kalajdzic', 447845, 2);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Mica', 'Pavic', 454545, 2);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Zorica', 'Maricic', 666555, 2);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Teodora', 'Turkulov', 589555, 2);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Maja', 'Zunic', 302502, 2);

insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Dusan', 'Gusic', 501563, 1);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Luka', 'Jovic', 463333, 1);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Ivana', 'Spanovic', 704755, 1);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Ana', 'Jovanovic', 302302, 1);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Jelena', 'Dokic', 805860, 1);
insert into klijent (id, ime, prezime, broj_lk, kredit)
values (nextval('klijent_seq'), 'Novak', 'Djokovic', 102103, 1);

insert into tip_racuna ( id, naziv, oznaka, opis )
values (nextval('tip_racuna_seq'), 'Tekuci racun', 'TR', 'Tekući račun je račun koji se koristi za izvršavanje platnih transakcija – uplata, prenos i isplata novčanih sredstava');
insert into tip_racuna ( id, naziv, oznaka, opis )
values (nextval('tip_racuna_seq'), 'Ziro racun', 'ZR', 'žiro račun koristi se za primanje honorara ili naknada od povremenog posla');
insert into tip_racuna (id, naziv, oznaka, opis)
values (nextval('tip_racuna_seq'), 'Devizni racun', 'DZ', 'Devizni racun koristi se za smestanje deviza');

insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br111', 'BB','' , 1, 2);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br112', 'BB', '', 1, 1);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br113', 'BB', '', 1, 3);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br1114', 'BB', '', 1, 10);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br115', 'BB', '', 1, 12);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br116', 'BB', '', 1, 9);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br117', 'BB', '', 1, 15);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br118', 'BB', '', 1, 17);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br119', 'BB', '', 1, 4);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br120', 'BB', '', 1, 8);

insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br121', 'BB','' , 2, 1);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br122', 'BB', '', 2, 23);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br123', 'BB', '', 2, 11);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br124', 'BB', '', 2, 6);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br125', 'BB', '', 2, 21);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br126', 'BB', '', 2, 14);

insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br127', 'BB','' , 3, 17);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br128', 'BB', '', 3, 20);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br129', 'BB', '', 3, 21);
insert into racun (id, naziv, oznaka, opis, tip_racuna, klijent)
values (nextval('racun_seq'), 'Br130', 'BB', '', 3, 27);
