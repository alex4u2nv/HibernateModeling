insert into BarEntity ( id, secIdString, barString ) values ( 1, "ABC", "CBA"), (2, "DEF", "FED"), ( 3, "GHI", "IHG");
 --next id integer
insert into identitytable (entity_table, id) values ("BarEntity", 4);

insert into FooEntity ( idLong, idString, fooString) values (1, "FOO-ABC-1", "CBA"), (2, "FOO-DEF-1", "FED"), (3, "FOO-GHI-1", "IHG");
--next id integer
insert into identitytable (entity_table, id) values ("FooEntity", 4); 

insert into MooEntity (id, mooString, barId, barSecIdString) values (1, "ABC", 1, "ABC" ), (2, "DEF",2, "DEF"), ( 3, "GHI",3, "GHI");
--next id integer
insert into identitytable (entity_table, id) values ("MooEntity", 4); 