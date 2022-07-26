# -*- coding: utf-8 -*-
"""lap02.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/12I0g3TzfDjykI2YOLhKDbe04YdnpIQFJ
"""

import numpy as np
#bai1
x = [1, 3, 5, 2, 9]
print(x)
print(len(x))

y = [-1, 3, 15, 27, 29]
print(y)
print(len(y))

import numpy as np 
import math
#bai2
n=5

#a
b = np.arange(12, 12+n*2, 2)
print('b = ',b)

#b
c = np.arange(31, 31+n*2, 2)
print('c = ',c) 

#c
x = np.arange(-n,n+1,1)
print('x = ',x)

#d
y = np.arange(n,-n-1,-1)
print("y = ",y)

#e
z=np.arange(10,10-n*2,-2)
print("z = ",z)

#f
w=[]
for i in range(n):
  w.append(2**i)
print("w = ",w)

#g
d = [1,1]
for i in range(2,n):
  d.append(d[-1] + d[-2])
d_final = [1.0/d[i] for i in range(len(d))]
print("d = ", d_final)

#h
print('h')
i=[]
for num in range(2,101):
    if all(num%k!=0 for k in range(2,int(math.sqrt(num))+1)):
       i.append(1/num)
print(i)

#i
print('i')
a=[]
a.append(1)
for i in np.arange(1,n+1,1):
    a.append(a[i-1]+i+1)
print(a)   

#j
print("j")
m=[]
k=10
for i in np.arange(-1,n-1,1):
    if(i==-1):
        m.append(1/(2))        
    elif(i==0):
        m.append(1/(5))       
    else:
        m.append(1/k)
        k=k+3+(i+1)*2
print(m) 

#k
print("k")
p=[]
for i in range(0,12):
  p.append(i/(i+1))
print(p)

#l
print('l')
o=[]
for i in range(97,122):
  o.append(chr(i)) 
print(o)

#m
print('m')
s=[]
for i in range(65,90,3):
  s.append(chr(i))
print(s)

import numpy as np
#bai3
x = np.logspace(1,2,3,4,5)
print("x = ", np.logspace(2.0, 3.0, num=5, dtype = int))

import numpy as np
#bai4
x = [1, 2, 3]
y = [98, 12, 33]
z = [x + y]
print(z)

import numpy as np
#bai5
x = np.array([1,2,3])
y = np.array([4,5,6])
z = np.array([[1,2,3],
             [4,5,6]])
print(z)

import numpy as np
#bai6
x = np.array([0, 2, 4, 6, 8, 10, 12, 14, 16])

#a
x_6firsts = x[0:6]
print(x_6firsts)

#b
x_5lasts = x[4:len(x)]
print(x_5lasts)

#c
x_0 = x[[0,3,8]]
print(x_0)

#d
x_1 = x[[0,2,4,6]]
print(x_1)

#e
x_le = x[1:len(x):2]
print(x_le)

#f
x_chan = x[2:len(x):2]
print(x_chan)

import numpy as np
#bai7
x=[3,11,-9,-131,-1,1,-11,91,-6,407,-12,-11,12,153,371]

#a
print("a) {}" .format(max(x)))

#b
print("b) {}" .format(min(x)))

#c
z=list()
for i in x:
  if(i>10):
    z.append(i)
print("c) {}".format(z))

#d
x.reverse()
print("d) {}".format(x))

#e
x.sort()
print("e) {}".format(x))

#f
x.reverse()
print("f) {}".format(x))

#g
count=0
for i in range(0,len(x)):
  for j in range(1,len(x)):
    if(x[i]+x[j]==0):
      count+=1
print("g) {}".format(count))

#h  
count=0
for i in np.arange(0,len(x),1):
    for j in np.arange(i,len(x),1):
        if x[i] == x[j]:
            count=count+1
print("h) {}".format(count))

#i
y=[]
for i in range(0,len(x)):
  y.append(x[i]+x[len(x)-i-1])
print("i) {}".format(y))

#j
w=[]
for i in x:
  count=0
  sum=0
  if i>0:  
    temp=i
    while temp!=0:
      count+=1
      temp=temp//10
    temp=i
    while temp!=0:
      n=temp%10
      temp=temp//10
      sum+=n**count
    if sum==i:
      w.append(i)
print("j) {}".format(w))

#k
y=set(x)
for i in x:
  if(i<0):
    y.discard(i)
y=list(y)
y.sort()
y.reverse()
print("k) {}".format(y))


#l
sum=0
for i in x:
  sum+=i
median=sum/len(x)
print("l) {}".format(median))

#m
sum=0
for i in x:
  if(i<median):
    sum+=i
print("m) {}".format(sum))

#n

for i in x:
  if(i<0):
   y.append(abs(i))
print("n) {}".format(y))