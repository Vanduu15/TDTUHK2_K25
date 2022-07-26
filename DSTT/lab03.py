# -*- coding: utf-8 -*-
"""lab03.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1asU2oziwo0MwyGZn5riubphK7uvxhUF-
"""

#cau1
#a
import numpy as np
x = np.arange(1,6)
A1 = np.tile(x,(5,1))
print("A = ",A1.T)

#b
x=np.arange(1,7)
p=np.repeat(x,5,axis=0)
B=p.reshape(6,5).T
print("B= ",B)

#c
c = np.arange(1,31)
C1 = np.reshape(c,(6,5))
print("C = ",C1)

#d
x=np.arange(1,26)
x=x.reshape(5,5)
print("D=", x)

#cau2
import numpy as np
rand56 = np.random.randint(1, 100, (5,6))
print(rand56)

#cau3
import numpy as np
A = np.arange(1, 10).reshape(3,3)
print(A)
print(np.flip(A, axis = 1))
print(np.fliplr(A))
print(A[:,::-1])

#cau4
import numpy as np
A = np.arange(1, 10).reshape(3,3)
print(A)
print(np.flip(A, axis = 0))
print(A[::-1])
print(np.flipud(A))

#cau5
import numpy as np
Y = np.array([
[1, 2, 16, 31, 22],
[2, 8, 12, 21, 23],
[4, 9, 11, 14, 25],
[3, 6, 10, 16, 34],              
])
print("a) x = ", Y[1,1:4])
print("b) y = ", Y[ :, 2:3 ])
print("c) A = ", Y[ 1:3, 1:4 ])
print("d) B = ", Y[ :, 0:5:2 ])
print("e) C = ", Y[:,::2])
print("f) D = ", Y[ Y>12 ])

#bai6
import numpy as np
A=np.array([[2,4,1],[6,7,2],[3,5,9]])
x1=A[0,:]
Y=A[1:,:]
print(x1)
print(Y)

#bai7
import numpy as np
A=np.array([[2,7,9,7],[3,1,5,6],[8,1,2,5]])
B=A[:,::2]
print(B)
C=A[1::2,:]
print(C)
print(A.T)

#bai8
#option1
import numpy as np
gia = np.array([[2,1,3]]) 
soluong = np.array([[12, 5 , 8], [15, 9 , 12], [10, 14, 10], [16, 7, 9], [12, 10, 15]]) 
soluong_T=soluong.T
doanhthu = gia.dot(soluong.T) 
print(doanhthu)
#option2
import numpy as np
A = np.array([[12, 15, 10, 16, 12], [5, 9, 14, 7, 10], [8, 12, 10, 9, 15]])
A[0, :] *= 2
A[1, :] *= 1
A[-1, :] *= 3
print(sum(A[:, :]))

#cau9
import numpy as np
T=np.array([[0.6,0.7],[0.4,0.3]])
p=np.array([[0.5],[0.5]])
k=np.array([1,2,10,100000])
def luythua(T,a):
    for i in np.arange(1,a,1):
        T=T@T
    return T    
for i in k:
    pk=luythua(T,i)*p
    print(pk)

#bai10
import numpy as np
A=np.array([[-1,4,8],[-9,1,2]])
B=np.array([[5,8],[0,-6],[5,6]])
C=np.array([[-4,1],[6,5]])
D=np.array([[-6,3,1],[8,9,-2],[6,-1,5]])
print("a no accept")
print(B@(C.T))
print(C-C.T)
print(D-D.T)
print(D.T.T)
print(2*C.T)
print(A.T+B)
print((A.T+B).T)
print((2*A.T-5*B).T)
print((-D).T)
print(-(D.T))
print((C@C).T)
print((C.T)@(C.T))

#bai11
import numpy as np
A=np.array([[2,4,1],[6,7,2],[3,5,9]])
if(A.shape[0]==A.shape[1]):
    print("Đây là ma trận vuông")
else:
    print("Đây 0 là ma trận vuông")
if(np.allclose(A,A.T)):
    print("Đây là ma trận đối xứng")
else:
    print("Ma trận 0 đối xứng")
if(np.allclose(A.T,np.linalg.inv(A))):
    print("Ma trận đối xứng xiên")
else:
    print("Ma trận 0 đối xứng xiên")
print(np.triu(A))
print(np.tril(A))

#cau12
import numpy as np
A=np.array([[6,0,0,5],[1,7,2,-5],[2,0,0,0],[8,3,1,8]])
print(np.linalg.det(A))
B=np.array([[1,-2,5,2],[0,0,3,0],[2,-6,-7,5],[5,0,4,4]])
print(np.linalg.det(B))
C=np.array([[3,5,-8,4],[0,-2,3,-7],[0,0,1,5],[0,0,0,2]])
print(np.linalg.det(C))
E=np.array([[4,0,-7,3,-5],[0,0,2,0,0],[7,3,-6,4,-8],[5,0,5,2,-3],[0,0,9,-1,2]])
print(np.linalg.det(E))
F=np.array([[6,3,2,4,0],[9,0,-4,1,0],[8,-5,6,7,1],[3,0,0,0,0],[4,2,3,2,0]])
print(np.linalg.det(F))

#cau13
import numpy as np
A=np.array([[4,0,-7,3,-5],[0,0,2,0,0],[7,3,-6,4,-8],[5,0,5,2,-3],[0,0,9,-1,2]])
B=np.array([[6,3,2,4,0],[9,0,-4,1,0],[8,-5,6,7,1],[3,0,0,0,0],[4,2,3,2,0]])
print(np.linalg.det(A)+np.linalg.det(B))
if(np.linalg.det(A+B)==np.linalg.det(A)+np.linalg.det(B)):
    print("det(A+B)=detA+detB")
else:
    print("0 bằng")
A=np.array([[0,2,0,0],[3,-6,4,-8],[0,5,2,-3],[0,9,-1,2]])
B=np.array([[0,-4,1,0],[-5,6,7,1],[0,0,0,0],[2,3,2,0]])
if(np.linalg.det(A+B)==np.linalg.det(A)+np.linalg.det(B)):
    print("det(A+B)=detA+detB")
else:
    print("0 bằng")
A=np.array([[-6,4,-8],[5,2,-3],[9,-1,2]])
B=np.array([[6,7,1],[0,0,0],[3,2,0]])
if(np.linalg.det(A+B)==np.linalg.det(A)+np.linalg.det(B)):
    print("det(A+B)=detA+detB")
else:
    print("0 bằng")
A=np.array([[2,-3],[-1,2]])
B=np.array([[0,0],[2,0]])
if(np.linalg.det(A+B)==np.linalg.det(A)+np.linalg.det(B)):
    print("det(A+B)=detA+detB")
else:
    print("0 bằng")

#cau14
import numpy as np
for i in np.arange(1,4,1):
    A=np.random.randint(1,10,size=(3,3))
    B=np.random.randint(1,10,size=(3,3))
    print(A)
    print(B)
    if(np.isclose(np.linalg.det(A@B),np.linalg.det(A)*np.linalg.det(B),rtol=1e-05,atol=1e-08,equal_nan=False)):
        print("det(A*B)=det(A)*det(B)")
        print()
    else:
        print("0 bằng")
        print()

#cau15
import numpy as np
A=np.array([[2,3,5/2],[-3/4,2,1/4],[1/4,1/2,2]])
B=np.array([[1,-1/2,3/4],[3/2,1/2,-2],[1/4,1,1/2]])
print(np.linalg.inv(A))
print(np.linalg.inv(B))
print(np.linalg.inv(A@B))
print(np.linalg.inv(B@A))
print(np.linalg.inv(A).T)
print(np.linalg.inv(A.T))