CREATE TABLE accounts
(
    id         SERIAL PRIMARY KEY,
    user_name  VARCHAR(30) UNIQUE NOT NULL, -- UNIQUE TC NO GIBI CALISIR NOT NULL BU KOLONUN BOS GECİLEMEZ OLDUGUNU BELİRTİR
    password   VARCHAR(30)        NOT NULL,
    email      VARCHAR(30) UNIQUE NOT NULL,
    created_on TIMESTAMP          NOT NULL
);

INSERT INTO accounts(user_name, password, email, created_on)
VALUES ('mnozturk', 'deneme', 'info@mehmetnuri.net', current_timestamp),
       ('ali', 'deneme', 'ali@mehmetnuri.net', current_timestamp),
       ('veli', 'deneme', 'veli@mehmetnuri.net', current_timestamp),
       ('kerem', 'deneme', 'kerem@mehmetnuri.net', current_timestamp);


-- SORGULAMALAR

SELECT *
FROM accounts; -- TABLONUN BÜTÜN KOLONLARI İLE BİRLİKTE GETİR
SELECT user_name, email
FROM accounts; -- TABLONUN SADECE BELİRLİ KOLONLARINI GETİR
SELECT user_name
FROM accounts;
-- TABLONUN SADECE SEÇTİĞİM KOLONLARINI GETİR

-- WHERE

-- ARİTMETİKSEL KARŞILAŞTIRMA
SELECT *
FROM accounts
WHERE id = 1; -- ID DEĞERİ 1 E EŞİT OLAN KAYDI GETİR
SELECT *
FROM accounts
WHERE id > 1; -- ID DEĞERİ 1'DEN BÜYÜK OLAN KAYITLARI GETİR
SELECT *
FROM accounts
WHERE id < 3; -- ID DEĞERİ 3'TEN KÜÇÜK OLAN KAYITLARI GETİR
SELECT *
FROM accounts
WHERE id <= 3; -- ID DEĞERİ 3'TEN KÜÇÜK VE 3' E EŞİT OLAN KAYITLARI GETİR
SELECT *
FROM accounts
WHERE id >= 3; -- ID DEĞERİ 3'TEN BÜYÜK VE 3' E EŞİT OLAN KAYITLARI GETİR
SELECT *
FROM accounts
WHERE id != 3; -- ID DEĞERİ 3'E EŞİT OLMAYAN KAYITLARI GETİR
SELECT *
FROM accounts
WHERE id <> 3; -- ID DEĞERİ 3'E EŞİT OLMAYAN KAYITLARI GETİR
SELECT *
FROM accounts
WHERE id IS NOT NULL; -- ID DEĞERİ BOŞ OLMAYAN KAYITLARI GETİR


SELECT *
FROM accounts
WHERE id BETWEEN 2 AND 4; -- ID DEĞERİ 2 İLE 4 ARASINDA OLAN KAYITLARI GETİRİR. 2 VE 4 Ü DAHİL EDER
SELECT *
FROM accounts
WHERE id IN (1, 3, 6);
-- ID DEĞERİ 1,3,6 OLAN KAYITLARI GETİRİR;


--- METİNSEL SORGULAR
SELECT *
FROM accounts
WHERE user_name = 'mnozturk'; -- TAM EŞLEME İLE BUL YÖNTEMİ
SELECT *
FROM accounts
WHERE accounts.email LIKE '%net'; -- email KOLONUNDA SONU net İLE BİTEN KAYITLARI GETİRİR
SELECT *
FROM accounts
WHERE accounts.email LIKE 'ali%'; -- email KOLONUNDA BAŞI ali İLE BAŞLAYAN KAYITLARI GETİRİR
SELECT *
FROM accounts
WHERE accounts.email LIKE '%net%';
-- email KOLONUNDA net GEÇEN KAYITLARI GETİRİR

-- SIRALAMA
SELECT *
FROM accounts
ORDER BY id; -- KAYITLARI ID KOLONUNA GÖRE KÜÇÜKTEN BÜYÜĞE SIRALA
SELECT *
FROM accounts
ORDER BY id DESC; -- KAYITLARI ID KOLONUNA GÖRE BÜYÜKTEN KÜÇÜĞE SIRALA

SELECT *
FROM accounts
ORDER BY user_name; -- KAYITLARI user_name ALANINA GÖRE A-Z YE DOĞRU SIRALAR
SELECT *
FROM accounts
ORDER BY user_name DESC;
-- KAYITLARI user_name ALANINA GÖRE Z-A YA DOĞRU SIRALAR


-- MANTIKSAL DURUMLAR

-- VE İŞLEMİ İLE SORGULAMA
SELECT *
FROM accounts
WHERE id = 2
  AND email LIKE '%net%';
SELECT *
FROM accounts
WHERE id = 2
  AND email LIKE '%net%'
  AND password = 'deneme';

-- VEYA İŞLEMİ İLE SORGULAMA
SELECT *
FROM accounts
WHERE id = 2
   OR email LIKE '%net%';
SELECT *
FROM accounts
WHERE id = 2
   OR (email LIKE '%net%' AND password = 'deneme');


SELECT *
FROM accounts
WHERE id = 6
   or email LIKE '%net%'
ORDER BY id DESC;


--- KAYIT GÜNCELLEME
UPDATE accounts
SET password = '12345'
WHERE id IN (4, 3);

-- SİLME
DELETE
FROM accounts
WHERE id = 6;


CREATE TABLE iller
(
    id         SERIAL PRIMARY KEY,
    il_adi     VARCHAR(60),
    plaka_kodu INT
);

CREATE TABLE ilceler
(
    id       SERIAL PRIMARY KEY,
    ilce_adi VARCHAR(100),
    id_il    INT,

    CONSTRAINT FK_IL_ILCE
        FOREIGN KEY (id_il)
            REFERENCES iller (id)
);


INSERT INTO iller(il_adi, plaka_kodu)
VALUES ('İSTANBUL', 34);

INSERT INTO ilceler(ilce_adi, id_il)
VALUES ('Ataşehir', 1);


SELECT il.il_adi, ilce.ilce_adi
FROM ilceler AS ilce
         LEFT JOIN iller il on ilce.id_il = il.id
where il.plaka_kodu = 44;


SELECT ilce.ilce_adi, il.il_adi, il.plaka_kodu
FROM ilceler AS ilce
         LEFT JOIN iller il on ilce.id_il = il.id
WHERE il.plaka_kodu = 34;


SELECT concat(ilce.ilce_adi, ' ', il.il_adi) AS ilce_il, il.plaka_kodu
FROM ilceler AS ilce
         LEFT JOIN iller il on ilce.id_il = il.id
WHERE il.plaka_kodu = 34;

SELECT concat(elma.ilce_adi, ' ', armut.il_adi) AS ilce_il, armut.plaka_kodu
FROM ilceler AS elma
         LEFT JOIN iller armut on elma.id_il = armut.id
WHERE armut.id = 1;


SELECT ilce.ilce_adi, il.il_adi, il.plaka_kodu
FROM ilceler AS ilce
         LEFT JOIN iller il on ilce.id_il = il.id;


SELECT ilce.ilce_adi, il.il_adi, il.plaka_kodu
FROM ilceler AS ilce
         RIGHT JOIN iller il on ilce.id_il = il.id
WHERE ilce.ilce_adi IS NOT NULL;

SELECT i.il_adi, ilce.ilce_adi
FROM ilceler AS ilce
         INNER JOIN iller i on i.id = ilce.id_il;

SELECT *
FROM ilceler as ilce
         FULL OUTER JOIN iller i on i.id = ilce.id_il
ORDER BY i.plaka_kodu DESC;


CREATE TABLE calisanlar
(
    id          SERIAL PRIMARY KEY,
    ad          VARCHAR,
    soyad       VARCHAR,
    id_yonetici INT,

    FOREIGN KEY (id_yonetici) REFERENCES calisanlar (id)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO calisanlar(AD, SOYAD, ID_YONETICI)
VALUES ('Kemal', 'Bayraktar', null),
       ('Hakan', 'Can', 1),
       ('Murat', 'Şok', 1),
       ('Mehmet Nuri', 'Öztürk', null),
       ('Berat', 'Ural', 4),
       ('İsmail', 'Şahin', 4),
       ('Musa', 'Karaş', 4),
       ('Ercan', 'Kuş', null),
       ('Burak', 'Yanık', 8);

SELECT calisan.ad, calisan.soyad, concat(c.ad, ' ', c.soyad) AS yonetici
FROM calisanlar as calisan
         INNER JOIN calisanlar c ON calisan.id_yonetici = c.id
where calisan.id_yonetici = 4;



