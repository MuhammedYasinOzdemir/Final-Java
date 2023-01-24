import re
# gruplama () gore ayiriyor
# group() metodu
kardiz = "python bir programlama dilidir"
nesne = re.search("(python) (bir) (programlama) (dilidir)", kardiz)
print(nesne.group(0))  # tamami alinir
print(nesne.group(1))  # pythonu alır
print(nesne.group(2))  # bir alır
print(nesne.group(3))  # programlama alır
print(nesne.group(4))  # dilidir alınır
print(nesne.group())  # 0 ile aynı işlevi yapar tamamını alır

# groups() metodu grupları demet halinde sunar
print(nesne.groups())

# Özel Diziler
a = ["5 Ocak", "27Mart", "4 Ekim", "Nisan 3"]
for i in a:
    # \s özek karekterdir boslugn yerini tutar
    nesne = re.search("[0-9]\\s[A-Za-z]+", i)
    if nesne:
        print(nesne.group())

# Ondalık Sayıların Yerini Tutan Özel Dizi: \d
a = ["5 Ocak", "27Mart", "4 Ekim", "Nisan 3"]
for i in a:
    nesne = re.search("\d\s[A-Za-z]+", i)
    if nesne:
        print(nesne.group())
# Alfanümerik Karakterlerin Yerini Tutan Özel Dizi: \w
a = "abc123_$%+"
print(re.search("\w*", a).group())
"""Gördüğünüz gibi;

“\s” özel dizisi boşluk karakterlerini avlıyor

“\d” özel dizisi ondalık sayıları avlıyor

“\w” özel dizisi alfanümerik karakterleri ve “_” karakterini avlıyor

Dedik ki, bir de bunların büyük harfli versiyonları vardır. İşte bu büyük harfli versiyonlar da yukarıdaki dizilerin yaptığı işin tam tersini yapar. Yani:

“\S” özel dizisi boşluk olmayan karakterleri avlar

“\D” özel dizisi ondalık sayı olmayan karakterleri avlar. Yani “[^0-9]” ile eşdeğerdir.

“\W” özel dizisi alfanümerik olmayan karakterleri ve “_” olmayan karakterleri avlar. Yani [^A-Za-z0-9_] ile eşdeğerdir.
"""
a = ["5 Ocak", "27Mart", "4 Ekim", "Nisan 3"]
for i in a:
    # \d sayi \S bosluk olmayan \w+ alfabetikler 27Mart cıktı
    nesne = re.search("\d+\S\w+", i)
    if nesne:
        print(nesne.group())
