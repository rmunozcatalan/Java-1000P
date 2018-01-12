--------------------------------------------------------
-- Archivo creado  - viernes-enero-12-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CATEGORIA
--------------------------------------------------------

  CREATE TABLE "CATEGORIA" ("ID" NUMBER, "DESCRIPCION" VARCHAR2(50));
--------------------------------------------------------
--  DDL for Index CATEGORIA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "CATEGORIA_PK" ON "CATEGORIA" ("ID");
--------------------------------------------------------
--  Constraints for Table CATEGORIA
--------------------------------------------------------

  ALTER TABLE "CATEGORIA" ADD CONSTRAINT "CATEGORIA_PK" PRIMARY KEY ("ID") ENABLE
  ALTER TABLE "CATEGORIA" MODIFY ("ID" NOT NULL ENABLE)
  ALTER TABLE "CATEGORIA" MODIFY ("DESCRIPCION" NOT NULL ENABLE)
