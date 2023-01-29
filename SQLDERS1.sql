-- yorum satır
-- DDL => inşşat mühendisi (Data Defination Language)
-- DML  => iç mimar

-- DDL Tablolarımızın yapısını belirleyen (Data Manupilation Language)
-- kavramlardır

-- DML ise tablolarımızda bulunan verilerle iligli işlem
-- yapan kavramlardır

-- DDL
----- CREATE -> OLUŞTURMA ALTER -> GÜNCELLEME DROP -> SİLME
-- RENAME ->YENİDEN ADLANDIR , TRUNCATE -> SIFIRLA


--- TABLO OLUŞTURMA

CREATE TABLE calisanlar
(
    id    SERIAL PRIMARY KEY,
    ad    VARCHAR(50),
    soyad VARCHAR(50),
    tc    INT
);


-- VERİ EKLEME

-- TEKLİ
INSERT INTO calisanlar(ad, soyad, tc)
VALUES ('MEHMET NURİ', 'ÖZTÜRK', 1234);

--ÇOKLU
INSERT INTO calisanlar(ad, soyad, tc)
VALUES ('ALİ', 'ÖZTÜRK', 878),
       ('SÜMEYYE', 'ÖZTÜRK', 654),
       ('AYŞE', 'ÖZTÜRK', 321352);



-- VAR OLAN TABLOYA KOLON EKLEME
ALTER  TABLE calisanlar ADD COLUMN dogum_yili INT;

-- VAR OLAN TABLODA KOLON İSMİNİ GÜNCELLEME
ALTER TABLE  calisanlar RENAME COLUMN dogum_yili TO d_yili;

-- VAR OLAN TABLODA BİR KOLONU SİLME
ALTER TABLE calisanlar DROP COLUMN dogum_yili;

-- VAR OLAN TABLONUN ADINI DEĞİŞME
ALTER  TABLE  calisanlar RENAME  TO workers;

--TABLOYU SIFIRLAMA
TRUNCATE  TABLE  calisanlar;

-- TABLOYU SİLME
DROP  TABLE  calisanlar;
