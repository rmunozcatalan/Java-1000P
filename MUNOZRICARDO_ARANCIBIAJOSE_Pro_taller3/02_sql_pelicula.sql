SELECT * from rm_ja_pelicula;

DROP TABLE rm_ja_pelicula;

CREATE TABLE rm_ja_pelicula (
  codigo number(11) default NULL PRIMARY KEY,
  precio number(11) default NULL,
  id_categoria number(11) default NULL,
  formato4k varchar(1) default NULL,
  nombre varchar(50) default NULL
);


ALTER TABLE rm_ja_pelicula
ADD CONSTRAINT FK_rm_ja_pelicula_categoria
FOREIGN KEY (id_categoria) REFERENCES rm_ja_categoria(id);

DELETE FROM rm_ja_pelicula;

INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10000,3449,2,'N','congue');
INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10001,8277,1,'N','lobortis risus. ');
INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10002,7170,2,'N','morbi tristique ');
INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10003,4534,1,'S','ante ipsum primis in faucibus');
INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10004,8844,'1','N','lacinia mattis..');
INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10005,3494,'1','S','et magnis dis parturient montes,');
INSERT INTO rm_ja_pelicula (codigo,precio,id_categoria,formato4k,nombre) VALUES (10006,5472,'3','N','augue, eu tempor');