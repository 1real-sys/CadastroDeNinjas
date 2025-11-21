-- V2: Migrations para adicionar a coluna 'ranking' na tabela 'tb_cadastro'

ALTER TABLE tb_cadastro
ADD COLUMN ranking VARCHAR(255);