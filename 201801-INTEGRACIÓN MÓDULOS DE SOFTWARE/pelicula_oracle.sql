--------------------------------------------------------
-- Archivo creado  - viernes-enero-12-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PELICULA
--------------------------------------------------------

  CREATE TABLE "PELICULA" ("CODIGO" NUMBER, "PRECIO" NUMBER, "ID_CATEGORIA" NUMBER, "FORMATO" VARCHAR2(1), "NOMBRE" VARCHAR2(50));
--------------------------------------------------------
--  DDL for Index PELICULA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PELICULA_PK" ON "PELICULA" ("CODIGO");
--------------------------------------------------------
--  Constraints for Table PELICULA
--------------------------------------------------------

  ALTER TABLE "PELICULA" ADD CONSTRAINT "PELICULA_PK" PRIMARY KEY ("CODIGO") ENABLE
  ALTER TABLE "PELICULA" MODIFY ("NOMBRE" NOT NULL ENABLE)
  ALTER TABLE "PELICULA" MODIFY ("FORMATO" NOT NULL ENABLE)
  ALTER TABLE "PELICULA" MODIFY ("ID_CATEGORIA" NOT NULL ENABLE)
  ALTER TABLE "PELICULA" MODIFY ("PRECIO" NOT NULL ENABLE)
  ALTER TABLE "PELICULA" MODIFY ("CODIGO" NOT NULL ENABLE)
