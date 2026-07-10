-- V2: Migrations para adicionar a coluna de rank

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);