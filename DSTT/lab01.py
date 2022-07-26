import numpy as np
#bai1
list =[3,4,5,6,7,8]
#tuple
t =tuple(list)
print(t)
#set
s=set(list)
print(s)
#dict
d=dict()
for a,b in enumerate(list):
  d[a]=b
print(d)

import numpy as np
#bai2
d = {2:"Nhatnheo",7:"here"}
l=[]
for a in d.keys():
    l.append(d[a])
print(l)

import numpy as np
#bai3
d= {1:'cute',2:'beautiful',3:'kind',4:'smart',5:'generous'}
print("Enter x value:")
x=input()
#3a
b=0
for a in d.keys():
    if( x == d[a]):
        b=b+1
print("Time x value occurs:",b)
#3b
k=input()
for a in d.keys():
    if ( x == d[a]):
           d.update({a:k})
           x=k;
           break
print(d)
print("Enter k value:")        
#3c
for a in d.keys():
    if (x== d[a]):
        d.pop(a)
        break
print(d)        
#d
d[a]=x
print(d)

import numpy as np
#bai4
s1={1,5,0,7,0,3}
s2={0,2,0,7,2,0}
#4a
print(s1 & s2)
#4b
print(s1 | s2)
#4c
print("Enter X:")
x=int(input())
s2.update({x})
print(s2)
#4d
s1.remove(x)
print(s1)

import matplotlib.pyplot as plt
import numpy as np
#bai5
list= [1,4,6,22,11,10,3,6]
x =[str(i) for i in np.arange(len(list))]
plt.bar(np.arange(len(list)),list,color='blue')
plt.xticks(np.arange(len(list)),x)
plt.show()

import matplotlib.pyplot as plt
import numpy as np
#bai6
print("Enter unit:")
a=input()
print("Enter distance:")
b=int(input())
if(a=='km'):
    c=1000*b
if(a=='m'):
    c=b
if(a=='cm'):
    c=b/100
if(a=='mm'):
    c=b/1000
print("Unit convert to met is:",c)

import numpy as np
#bai7
print("Enter birthday:")
a=int(input())
print("Enter month of birth (const number):")
b=int(input())
if((a>=21 and a<=31 and b==3) or (a<=19 and a>=1 and b==4)):
   print("Aries")
if((a>=20 and a<=30 and b==4) or (a<=20 and a>=1 and b==5)):
   print("Taurus")
if((a>=21 and a<=31 and b==5) or (a<=21 and a>=1 and b==6)):
   print("Gemini")   
if((a>=22 and a<=30 and b==6) or (a<=22 and a>=1 and b==7)):
   print("Cancer")
if((a>=23 and a<=31 and b==7) or (a<=22 and a>=1 and b==8)):
   print("Leo")
if((a>=23 and a<=31 and b==8) or (a<=22 and a>=1 and b==9)):
   print("Virgo")
if((a>=23 and a<=30 and b==9) or (a<=23 and a>=1 and b==10)):
   print("Lidra")
if((a>=24 and a<=31 and b==10) or (a<=21 and a>=1 and b==11)):
   print("Scorpius")
if((a>=22 and a<=30 and b==11) or (a<=21 and a>=1 and b==12)):
   print("Sagittarius")
if((a>=22 and a<=31 and b==12) or (a<=19 and a>=1 and b==1)):
   print("Capricornus")
if((a>=20 and a<=31 and b==1) or (a<=18 and a>=1 and b==2)):
   print("Aquarius")
if((a>=19 and a<=29 and b==2) or (a<=20 and a>=1 and b==3)):
   print("Pisces")

import numpy as np
#bai8
def sum(num):
    total = 0;
    while (num > 0):
        total = total + num % 10;
        num = int(num / 10);
    return total;
print("Enter day of birth:")
a=int(input())
print("Month of birth:")
b=int(input())
print("Year of birth:")
c=int(input())
#8a
d = {2:"Peaceful, intuitive, wise, compassionate, collaborative"
     ,3:"Funny, creative, charismatic, expressive, social"
     ,4:"Conscientious, grounded, pragmatic, reliable, determined"
     ,5:"Versatile, charismatic, restless, resourceful, communicative"
     ,6:"Nurturing, compassionate, supportive, helpful, perceptive"
     ,7:"Analytical, questioning, intellectual, intuitive, problem-solving"
     ,8:"Driven, ambitious, strong, materialistic, proud, organized, conscientious"
     ,9:"Generous, kind, helpful, (very) creative, patient, passionate"
     ,11:"Intuitive, inspiring, perceptive, open-minded"}
path=sum(a)+sum(b)+sum(c)
if(path > 11):
    path=sum(path)
print("Your life path is:",path)
for i in d.keys():
    if(path == i):
        print("Meaning:",d[i])
        break
    
#8b
print("what is this year?:")
d=int(input())
PersonalYear=sum(a)+sum(b)+sum(d)
if(PersonalYear >9):
    PersonalYear=sum(PersonalYear)
print("Your person year number:", PersonalYear)
d2 = {1:"A New Beginning In Your Life"
      ,2:"Development, cooperation, and waiting"
      ,3:"Social expansion and creative successes"
      ,4:"Hard work and slow, but steady progress"
      ,5:"Feeling Loose and Free"
      ,6:"Love, Family, Home and Responsibility"
      ,7:"A time for analysis and understanding"
      ,8:"Attainment and capital gains"
      ,9:"Reflection and Reaching Out"}
for k in d2.keys():
    if(PersonalYear == k):
        print("Meaning:",d2[k])
        break
#8c
print("Enter full name:")
ten_old=input()
ten=ten_old.upper()
destiny=0;
for i in np.arange(0,len(ten)):
    if(ten[i] == 'A' or ten[i] == 'J' or ten[i] == 'S'):
        value=1
    elif(ten[i] == 'B' or ten[i] == 'K' or ten[i] == 'T'):
        value=2
    elif(ten[i] == 'C' or ten[i] == 'L' or ten[i] == 'U'):
        value=3
    elif(ten[i] == 'D' or ten[i] == 'M' or ten[i] == 'V'):
        value=4
    elif(ten[i] == 'E' or ten[i] == 'N' or ten[i] == 'W'):
        value=5
    elif(ten[i] == 'F' or ten[i] == 'O' or ten[i] == 'X'):
        value=6   
    elif(ten[i] == 'G' or ten[i] == 'P' or ten[i] == 'Y'):
        value=7
    elif(ten[i] == 'H' or ten[i] == 'Q' or ten[i] == 'Z'):
        value=8
    elif(ten[i] == 'I' or ten[i] == 'R'):
        value=9
    else:
        value=0
    destiny=destiny + value
if(destiny != 11 and destiny !=22 and destiny >9):
    destiny=sum(destiny)
print("Your destiny number:",destiny)    
#8d
print("Enter your name:")
name_old=input()
name=name_old.upper()
soul=0;
for i in np.arange(0,len(name)):
    if(name[i]=='A' or name[i]=='Ă' or name[i]=='Â'):
        value=1
    elif(name[i]=='E' or name[i]=='Ê'):
        value=5
    elif(name[i]=='I'):
        value=9
    elif(name[i]=='O' or name[i]=='Ô' or name[i]=='Ơ'):
        value=6
    elif(name[i]=='U' or name[i]=='Ư'):
        value=3
    elif(name[i]=='Y' and name[i-1] !='U' and name[i+1]!='U' and name[i-1]!='Ư' and name[i+1]!='Ư'):
        value=7
    else:
        value=0
    soul=soul+value
if(soul >11):
    soul=sum(soul)
print("Your soul number is:",soul)   
#8e
impression=0;
for i in np.arange(0,len(name)):
    if(name[i] == 'J' or name[i] == 'S'):
        value=1
    elif(name[i] == 'B' or name[i] == 'K' or name[i] == 'T'):
        value=2
    elif(name[i] == 'C' or name[i] == 'L'):
        value=3
    elif(name[i] == 'D' or name[i] == 'M' or name[i] == 'V'):
        value=4
    elif(name[i] == 'N' or name[i] == 'W'):
        value=5
    elif(name[i] == 'F' or name[i] == 'X'):
        value=6   
    elif(name[i] == 'G' or name[i] == 'P'):
        value=7
    elif(name[i] == 'H' or name[i] == 'Q' or name[i] == 'Z'):
        value=8
    elif(name[i] == 'R'):
        value=9
    elif((name[i] == 'Y' and name[i-1]=='U') or (name[i] == 'Y' and name[i+1] == 'U') or (name[i] == 'Y' and name[i-1]=='Ư') or (name[i] == 'Y' and name[i+1]=='Ư') ):
        value=9
    else:
        value=0   
    impression=impression+value    
if(impression>11):
    impression=sum(impression)
print("Your impession number is:",impression)