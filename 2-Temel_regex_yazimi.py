import re
metin = "merhsaba Yasin"
# sadece sırayla eşlesenleri arar buyuk kucuk haff ayrımı yapılır
a = re.search("merhaba", metin)
print(bool((a)))  # boolean donusebilir None ise false olur

metin = "aaşaş"
# ayni sekil ayni olursa eslesir . hersei aldigi icin \ kacma isareti konur
a = re.search("a-\.", metin)
print(bool((a)))
metin = "(4555)"
a = re.search("\(", metin)  # bu ifadeyi aradigimiz belirtilir
print(bool((a)))
metin = "perl,python ve ruby yüksek seviyeli dillerdir."
# !match metodu en bastan bakıyor search ise her tarafa yani match  ile eşleşmez
a = re.search("python", metin)
print(a)
liste = ["elma", "armut", "kebap"]
for i in liste:
    nesne = re.search("kebap", i)
    if nesne:
        print(nesne.group())
metin = """Guido Van Rossum Python'ı geliştirmeye 1990 yılında başlamış... Yani
aslında Python için nispeten yeni bir dil denebilir. Ancak Python'un çok uzun
bir geçmişi olmasa da, bu dil öteki dillere kıyasla kolay olması, hızlı olması,
ayrı bir derleyici programa ihtiyaç duymaması ve bunun gibi pek çok nedenden
ötürü çoğu kimsenin gözdesi haline gelmiştir. Ayrıca Google'ın da Python'a özel
bir önem ve değer verdiğini, çok iyi derecede python bilenlere iş olanağı
sunduğunu da hemen söyleyelim. Mesela bundan kısa bir süre önce Python'ın
yaratıcısı Guido Van Rossum Google'de işe başladı..."""
a = re.findall("Python|python", metin)  # liste dondurur
print(a)
liste = ["özcan", "mehmet", "süleyman", "selim",
         "kemal", "özkan", "esra", "dündar", "esin",
         "esma", "özhan", "özlem"]
for i in liste:
    if re.search("öz[chk]an", i):  # eslestiyse girer bloga
        print(i)  # ve yazdiri
print()
for i in liste:
    n = re.search("öz[chk]an", i)
    if n:  # ikinci yol
        print(n.group())  # ve yazdirir
    """
    [] ifadesi icine harf karekter alarak sıra belrtmezsiniz içindekilerden biri varsa eşleşir
    [1asd] buda 1 olan veya a olan veya s gibi yada hepsi iki falan eşleşir
    [1-9A-Za-z] - karekteri aralık belirtir 1 ve 9 arası A ile Z aarsı alfabe a z arası alfabe
!not - karekterş aralik belirttiği için ya sonda ya basta bulunmlaı
    """
    a = ["23BH56", "TY76Z", "4Y7UZ", "TYUDZ", "34534"]
for i in a:
    if re.search("[0-9]", i):
        print(i)  # sayilar eslestimi girer basina + koysaydık 1 veya daha fazla arardıi
print()
for i in a:
    if re.search("[0-9]{2}", i):
        print(i)  # buda 3 veya daha fazla olanları aradı
print()
for i in a:
    if re.search("[0-9]{2}", i):
        print(i)  # buda sadece 2 aralikta aradi tc de 11 karekterde kullanavilir
print()
for i in a:
    if re.search("[A-Z]+[1-9]", i):  # burda karekter en az 1 tane ve sonrasi sayi aradi
        print(i)
print()
for i in a:
    # burda karekter en az 1 tane ve sonrasi sayi aradi
    if re.search("[A-Z]{2}[1-9]", i):
        print(i)
print()
