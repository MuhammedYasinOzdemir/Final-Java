from urllib.request import urlopen
import re
# . Nokta her elemani temsil eder . karekteri alinmasi için \. yapilmali
liste = ["özcan demir", "mehmet", "süleyman",
         "selim", "kemal", "özkan nuri", "esra", "dündar",
         "esin", "esma", "özhan kamil", "özlem"]
# mesela es ile baslayanlar için [rmi] olur ama bir çok olabilir o yuzden butun karekter temsili . kullanilabilir ama tek sayi gibi faktörler aşagidaki konularda ç butun karekterleri kapsar
for i in liste:
    if re.search("es.a", i):  # ama sonu belirtildiği için esini almaz mesela
        print(i)
print(*re.findall("es.a", str(liste)))  # buda ikinci yol
print()  # mesela sonu met le bitenler alincak
for i in liste:
    if re.search(".met", i):
        print(re.search(".met", i).group())  # ! hmet alir
        # ?ama mehmet alir * ya hic yada birden fazla + da konulbilr ama direk met ise almaz
        print(re.search(".*met", i).group())
        print(i)
# * Karekteri ya hep ya hiç
yeniliste = ["st", "sat", "saat", "saaat", "falanca"]
print()
for i in yeniliste:
    if re.search("s.*t", i):  # s t arasi bir sey de olabilir olmayabilirde iki durumuda alir
        print(i)

# * ve . karekteri ile math metodu kırılabilir ama en performanslısıs search metodu kırma yolu is ".*met" mesela yazmak
# + Karekteri en az 1 ve fazlası
print()
for i in yeniliste:
    if re.search("s.+t", i):
        print(i)  # s t arasi en az bir karekter olanlari alir st alınmaz
print()
# ? isareti olursa güzel olur olmassa da olur

for i in yeniliste:
    if re.search("sa?t", i):  # burda önceki karetere bakar o karekter olsun veya olmasın yazzar yani st ile sat yazılır #!sadece a a bakılır burda
        print(i)
print()
metin = """Uluslararası hukuk, uluslar arası ilişkiler altında bir
disiplindir. Uluslararası ilişkilerin hukuksal boyutunu bilimsel bir
disiplin içinde inceler. Devletlerarası hukuk da denir. Ancak uluslar
arası ilişkilere yeni aktörlerin girişi bu dalı sadece devletlerarası
olmaktan çıkarmıştır."""
print(*re.findall("[Uu]luslar ?arası", metin)
      )  # burda ? once bosluk karekteri var ister bosluk olsun ister arada bosluk olmayanları alır ek olarak[Uu] buyuk harfle kucuk harflerle baslaması durumuna göre değerlendirlmiş
# {} küme parentezi eşlesmeden kac tane isteniliyorsa yazilir
for i in yeniliste:
    if re.search("sa{3}", i):  # sadece 3 tane olani
        print(i)
print()
for i in yeniliste:
    if re.search("sa{0,3}", i):  # 0 ile 3 arasi #! ikiside dahil
        print(i)
print()
for i in yeniliste:
    if re.search("sa{3,}", i):  # 3 ve sonrasi
        print(i)
print()
# ^ Sapka karekteri baslangici vurgular
a = ['23BH56', 'TY76Z', '4Y7UZ', 'TYUDZ',
     '34534', '1agAY54']
for i in a:  # !.* yoksa sadece uyanları alir varsa ama elemanin tamami
    # burda basta veya sonda mi diye bakilmadi oncesi varmi vs
    nesne = re.search("[A-Z]+[1-9].*", i)
    if nesne:
        print(nesne.group())
print()
# ?1gorev
for i in a:
    # baslancigi uyani alir match metodu islevnini yapara cıktı TY76Z
    nesne = re.search("^[A-Z]+[1-9].*", i)
    if nesne:
        print(nesne.group())
# ? 2 gorev hariçlik anlamı tasır
for i in a:
    # buda [ ]parentezin basina ^ karekteri yazildiğinda için girilene harici alir
    nesne = re.match("[0-9A-Z][^a-z]+", i)
    if nesne:
        print(nesne.group())
    """Burada şu ölçütlere sahip bir öğe arıyoruz:

Aradığımız öğe bir sayı veya büyük harf ile başlamalı

En baştaki sayı veya büyük harften sonra küçük harf GELMEMELİ (Bu ölçütü “^” işareti sağlıyor)

Üstelik bu “küçük harf gelmeme durumu” bir veya daha fazla sayıda tekrar etmeli… Yani baştaki sayı veya büyük harften sonra kaç tane olursa olsun asla küçük harf gelmemeli (Bu ölçütü de “+” işareti sağlıyor”)

Bu ölçütlere uymayan tek öğe “1agAY54” olacaktır. Dolayısıyla bu öğe çıktıda görünmeyecek…
    """
# $ Dolar isareti
# nasıl biteceğini belirtir
liste = ["at", "katkı", "fakat", "atkı", "rahat",
         "mat", "yat", "sat", "satılık", "katılım"]

for i in liste:
    if re.search("at$", i):
        print(i)  # at ile bitenleri alir ama satılık almaz cunku devamı var
# | Dik çizgi yada
liste = ["at", "katkı", "fakat", "atkı", "rahat",
         "mat", "yat", "sat", "satılık", "katılım"]
print()
for i in liste:
    if re.search("^at|at$", i):  # buda ya bası at ile başlayan ayada sonu at olanları alır
        print(i)
# () Parentez gruplmaya yara

url = "https://web.archive.org/web/20121025012131/http://www.istihza.com/py2/icindekiler_python.html"
f = urlopen(url)

# parentezle gruplandı sırasıyla 1 den baslıyor
regex = 'href="(.+html)">.+</a>'

for i in f:
    nesne = re.search(regex, str(i, 'utf-8'))
    if nesne:
        print(nesne.group(1))  # !group(0) elemanın kendisini hepsini verir yani
print(re.search("a+(.*)", "aaba").groups())
#!burda + oldugu için aaaaaaaaba gitsin ama son a dan sonrasına bakar
