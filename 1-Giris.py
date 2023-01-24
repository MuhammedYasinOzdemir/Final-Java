import re


def m(a):
    if(a):
        print("Dogru")
    else:
        print("Yanlis")


#!Match bastan arar search herhangi yerden
# ? $ isareti son ^bastan bakıyor
# Search fonksiyonu
txt = "Ankara'da yağmur yağıyor"
x = re.search("^Ankara.*yağıyor$", txt)  # girilen metne arama yapilir
m(x)
# findall() Fonksiyonu
txt = "Bir Gece, Bir Gündüz."  # tum eslesmelere içeren liste dondurur
x = re.findall("\w+", txt)  # kelimleri alir boyle liste donduru
print(x)
# split() Fonksiyonu
txt = "Beni anlamadın ya, ben ona yanıyorum."
x = re.split("\s", txt)  # girilen karektere gore bolum liste dondurur
print(x)
txt = "Beni anlamadın ya, ben ona yanıyorum."
x = re.split("\s", txt, 2)  # sadece iki tan ealir
print(x)
# sub() fonksiyonu
txt = "Bugün kavun yedim."
# eslesen ifadeleri değiştirir format aranan,yeni,metin
x = re.sub("kavun", "karpuz", txt)
print(x)
# Match
txt = "Beni bul, beni onlara verme."
x = re.search("bul", txt)
print(x)  # <re.Match object; span=(5, 8), match='bul'> cıktı boyle olur bulmazsa none dondurur
print(x.span())  # aralıgı verir
print(x.group())  # bulunana degeri verir
