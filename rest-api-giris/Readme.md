# API Nedir ?

API'ler, iki yazılım bileşeninin belirli tanımlar ve protokoller aracılığıyla birbiriyle iletişim kurmasına olanak tanıyan
mekanizmalardır. Örneğin, meteoroloji müdürlüğünün yazılım sistemi, günlük hava durumu verilerini içerir. Telefonunuzdaki 
hava durumu uygulaması, API'ler aracılığıyla bu sistemle "konuşur" ve telefonunuzda size günlük hava durumu güncellemelerini gösterir.

## API'nin açılımı nedir?
API'nin açılımı olan Application Programming Interface, Uygulama Programlama Arabirimi anlamına gelir. API'ler bağlamında
Uygulama sözcüğü, ayrı bir işlevi bulunan her türlü yazılımı ifade eder. Arabirim, iki uygulama arasındaki hizmet sözleşmesi
gibi düşünülebilir. Bu sözleşme, ikisinin istekler ve yanıtlar kullanarak birbiriyle nasıl iletişim kuracağını tanımlar.
İlişkili API belgeleri, geliştiricilerin bu istek ve yanıtları nasıl yapılandırması gerektiğine dair bilgiler içerir.

## API'ler nasıl çalışır?
API mimarisi genellikle istemci ve sunucu bakımından açıklanır. İsteği gönderen uygulamaya istemci, yanıtı gönderen
uygulamaya ise sunucu adı verilir. Yani hava durumu örneğinde, müdürlüğün hava durumu veritabanı bir sunucu iken,
mobil uygulama ise bir istemcidir.

Ne zaman ve nasıl oluşturulduklarına dayalı olarak API'ler dört farklı şekilde çalışabilir.

### SOAP API'leri 
Bu API'ler, Basit Nesne Erişimi Protokolünü kullanır. İstemci ve sunucu, XML aracılığıyla mesaj alışverişi yapar.
Bu, diğerlerine kıyasla pek esnek olmayan ve artık popülerliğini yitiren bir API'dir.

### RPC API'leri
Bu API'lere, Uzak Prosedür Çağrıları adı verilir. İstemci, önce sunucu üzerinde bir işlevi (yani prosedür) tamamlar ve 
ardından sunucu da çıktıyı istemciye gönderir.

## REST API'lerinin avantajları nelerdir?

REST API'lerinin sunduğu dört temel avantaj vardır:

### 1. Entegrasyon 
API'ler, yeni uygulamaların mevcut yazılım sistemlerine entegre edilmesi için kullanılır. Her bir işlevi sıfırdan
yazmaya gerek duyulmadığından geliştirme hızı artar. Mevcut kodlardan yararlanmaya devam etmek için API'leri 
kullanabilirsiniz

### 2. İnovasyon

Yeni bir uygulamanın gelişi, bütün bir sektörü değişime zorlayabilir. İşletmelerin hızlı yanıt vermesi ve yenilikçi
hizmetlerin hızlı dağıtımını desteklemesi gerekir. Bunu, tüm kodu yeniden yazmak yerine API düzeyinde değişiklikler
yaparak gerçekleştirebilirler.

### 3. Genişleme

API'ler, müşterilerinin ihtiyaçlarını birden fazla platformda karşılamak isteyen işletmelere benzersiz bir fırsat sunar.
Örneğin, haritalar API'si harita bilgileri entegrasyonunun web siteleri, Android, iOS vb. aracılığıyla yapılabilmesini sağlar.
Her işletme, ücretsiz veya ücretli API'leri kullanarak kendi dahili veritabanlarına benzer şekilde erişim verebilir.

### 4. Bakım kolaylığı
API, iki sistem arasında bir ağ geçidi vazifesi görür. Her bir sistem, API'nin etkilenmemesi için dahili değişiklikler
yapma gereği duyar. Bu sayede, taraflardan birinin gelecekte yapacağı kod değişiklikleri, diğer tarafı etkilemez.