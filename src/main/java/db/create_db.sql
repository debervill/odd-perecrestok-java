create table if not exists students(
  id integer primary key autoincrement not null,
  fio text not null,
  zahcetka text,
  groups text
);

create table if not exists kaetgoryDor(
  id integer primary key autoincrement not null,
  namekat integer,
  minshir real,
  maxshir real,
  maxpolos integer,
  minpolos integer
);

create table if not exists zadanie(
  id integer primary key autoincrement not null,
  kategoriavert integer,
  kolvopolosvert integer,
  kategoriahoriz integer,
  kolvopoplos integer,
  sostavlegk integer,
  sostavgruz integer,
  sostavavtobus integer,
  sostavpoezd integer,
  typeperekr integer,
  n1 integer,
  n11 integer,
  n12 integer,
  np1 integer,
  n2 integer,
  n21 integer,
  n22 integer,
  np2 integer,
  n3 integer,
  n31 integer,
  n32 integer,
  np3 integer,
  n4 integer,
  n41 integer,
  n42 integer,
  np4 integer,
  student_id integer not null,
  foreign key (student_id) references students(id)
);

create table if not exists sessions(
  id integer primary key autoincrement not null,
  dates datetime,
  sudents_id integer not null,
  foreign key (sudents_id) references students(id)
);

create table if not exists raschet(
  id integer primary key autoincrement not null,
  shirhorizont real,
  shirvert real,
  n1  real,
  n11 real,
  n1pr real,
  n2 real,
  n21 real,
  n2pr real,
  n3 real,
  n31 real,
  n3pr real,
  n4 real,
  n41 real,
  n42 real,
  n4pr real,
  student_id integer not null,
  foreign key (student_id) references students(id)

);

create table if not exists sostavtrpotoka(
  id integer primary key autoincrement not null,
  minlegk integer,
  mingruz integer,
  minautobus integer,
  minautopoezd integer,
  maxlegk integer,
  maxgruz integer,
  maxautobus integer,
  maxautopoezd integer
);

create table if not exists koefprived(
  id integer primary key autoincrement not null,
  klegk real,
  kgruzr real,
  kautobus real,
  kautopoezd real
);
