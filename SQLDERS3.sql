--- Yazar
--  Yayın Evi
--  Kitap
--  Kategori

-- kategoriler tablosunu oluşturuyoruz
CREATE TABLE kategoriler
(
    id       SERIAL PRIMARY KEY,
    adi      VARCHAR(100),
    aciklama VARCHAR(500)
);

-- yayinevleri tablosunu oluşturuyoruz
CREATE TABLE yayin_evleri
(
    id         SERIAL PRIMARY KEY,
    adi        VARCHAR(100),
    vergi_no   VARCHAR(100),
    acik_adres VARCHAR(100)
);

--yazarlar tablosunu oluşturuyoruz
CREATE TABLE yazarlar
(
    id     SERIAL PRIMARY KEY,
    adi    VARCHAR(100) NOT NULL,
    soyadi VARCHAR(100) NOT NULL
);

--kitaplar tablosunu oluşturuyoruz

CREATE TABLE kitaplar
(
    id           SERIAL PRIMARY KEY,
    adi          VARCHAR(200) NOT NULL,
    basim_yili   INT          NOT NULL,
    id_categori  INT,
    id_yazar     INT,
    id_yayin_evi INT,

    CONSTRAINT FK_KITAP_YAZAR
        FOREIGN KEY (id_yazar)
            REFERENCES yazarlar (id),

    CONSTRAINT FK_KITAP_KATEGORI
        FOREIGN KEY (id_categori)
            REFERENCES kategoriler (id),

    CONSTRAINT FK_KITAP_YAYIN_EVI
        FOREIGN KEY (id_yayin_evi)
            REFERENCES yayin_evleri (id)

);


-- ÖRNEK VERİLER EKLEME

INSERT INTO kategoriler(adi)
VALUES ('BİLİM KURGU'),
       ('ROMAN'),
       ('DÜNYA KLASİKLERİ');


INSERT INTO yayin_evleri(adi)
VALUES ('PAPATYA'),
       ('PEGASUS'),
       ('ABAKÜS'),
       ('PUSULA');


INSERT INTO yazarlar(adi, soyadi)
VALUES ('MEHMET NURİ', 'ÖZTÜRK'),
       ('AHMET CAN', 'DEMİR'),
       ('GÜLPERİM', 'ARSAK'),
       ('KAAN', 'GÜRCÜ'),
       ('ORHUN', 'OFLAZ');


INSERT INTO kitaplar(adi, basim_yili, id_categori, id_yazar, id_yayin_evi)
VALUES ('TOMURCUKLAR', 2023, 1, 1, 1),
       ('PITIRCIKLAR', 2000, 2, 1, 1),
       ('EKŞİ ELMALAR', 2013, 2, 2, 3);


--- SORGULAMALAR

-- KATEGORİSİ BİLİNEN KİTAPLARI KATEGORİ ADI İLE BİRLİKTE
-- LİSTELEYİN

SELECT kitap.adi, kategori.adi
FROM kitaplar as kitap
         LEFT JOIN kategoriler kategori ON kitap.id_categori = kategori.id
WHERE kategori.id = 2;

--- YAZAR ID Sİ BİLİNEN KİTAPLARI ADLARI İLE BİRLİKTE LİSTELEYİN

SELECT kitap.adi, concat(yazar.adi, ' ', yazar.soyadi) AS YAZAR_AD_SOYAD
FROM kitaplar AS kitap
         LEFT JOIN yazarlar yazar ON kitap.id_yazar = yazar.id
WHERE yazar.id = 1;


-- YAZAR ID Sİ BİLİNEN KİTAPLARI YAZAR AD SOYAD KİTAP ADI, BASIM YILI VE KATEGORİ ADI İLE
-- LİSTELEYİN

SELECT concat(yazar.adi, ' ', yazar.soyadi) as yazar_ad_soyad,
       kitap.adi,
       kitap.basim_yili,
       kategori.adi
FROM kitaplar AS kitap
         LEFT JOIN yazarlar yazar ON kitap.id_yazar = yazar.id
         LEFT JOIN kategoriler kategori ON kitap.id_categori = kategori.id
WHERE yazar.id = 1;

---  YAYINEVİ ID Sİ BİLİNEN KİTAPLARI LİSTELEYİN
SELECT kitap.adi, yayin_evi.adi
FROM kitaplar AS kitap
         LEFT JOIN yayin_evleri yayin_evi on kitap.id_yayin_evi = yayin_evi.id
where yayin_evi.id = 1;

-- yazar adına göre kitapları listeleyin
SELECT kitap.adi, yazar.adi
FROM kitaplar AS kitap
         LEFT JOIN yazarlar yazar ON kitap.id_yazar = yazar.id
WHERE yazar.adi LIKE '%MEH%';


--- yazarın hangi yayın evleri ile çalıştığını listeleyin
-- DISTINCT TEKRAR EDEN VERİLERDE SADECE İLK KAYDI GETİRİR
SELECT distinct(yayin_evi.adi)
FROM yazarlar AS yazar
         LEFT JOIN kitaplar k on yazar.id = k.id_yazar
         LEFT JOIN yayin_evleri yayin_evi ON k.id_yayin_evi = yayin_evi.id
WHERE yazar.id = 1;

SELECT kitap.adi, yayin_evi.adi, yayin_evi.id
FROM kitaplar AS kitap
         LEFT JOIN yayin_evleri yayin_evi on kitap.id_yayin_evi = yayin_evi.id
group by kitap.adi, yayin_evi.adi, yayin_evi.id;


--LIMIT BÜYYÜK VERİ BULUNAN TABLOLARDA GELEN VERİYİ SAYFALAYARAK ALMAMIZI SAĞLAR
SELECT *
FROM kitaplar
LIMIT 100; --  SADECE 100 KAYDI GETİRİR

SELECT *
FROM kitaplar
LIMIT 100 OFFSET 1; --  OFFSET GELEN KAYLARDA KAÇ KAYDIN ATLANACAĞINI BELİRTİR.


SELECT *
FROM kitaplar
ORDER BY id
    FETCH FIRST 5 ROW ONLY;
