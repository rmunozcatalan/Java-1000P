
DROP TABLE rm_ja_categoria;

CREATE TABLE rm_ja_categoria (
  id number(11) default NULL PRIMARY KEY,
  descripcion varchar(50) default NULL
);

INSERT INTO rm_ja_categoria (id,descripcion) VALUES (1,'Fantasía');
INSERT INTO rm_ja_categoria (id,descripcion) VALUES (2,'Terror');
INSERT INTO rm_ja_categoria (id,descripcion) VALUES (3,'Infantil');
