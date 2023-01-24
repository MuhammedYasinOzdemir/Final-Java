import re
with open("C:\\Users\\User\\Desktop\\pyhton\\Final\\Regex\\adres.txt", "r") as file:
    txt = file.readlines()

for i in txt:
    liste = re.search("(\w+)\s:\s(\w+)\s(\d+)", i)
    print("İsim :{} \nİlçe:{}\nNumara:{}".format(
        liste.group(1), liste.group(2), liste.group(3)))
try:
    tc = input("Tc giriniz:")
    if not(bool(re.search("\d{11}$", tc))):
        raise ValueError("Tc yanlış")
except ValueError as e:
    print(e)

try:
    mail = input("mail giriniz:")
    if not(bool(re.search("[A-Za-z._]@[A-Za-z]\.\w+", mail))):
        raise ValueError("mail yanlış")
except ValueError as e:
    print(e)

while (True):
    try:
        tel = input("tel giriniz:")
        if(tel == "q"):
            break
        if not(bool(re.search("9?0?\s?(\d{10})|(\d{3}\s\d{2}\s\d{2})$", tel))):
            raise ValueError("tel yanlış")
    except ValueError as e:
        print(e)
