import numpy as np
import sympy as sp
from sympy import *
import matplotlib.pyplot as plt

#cau7
def Sxy(p,l,m):
  S = np.array([[1,0],[0,m]])
  Sp = S.dot(p)
  return Sp

p1 = np.array([1,1])
p2 = np.array([-1,1])
p3 = np.array([-1,-1])
p4 = np.array([1,-1])

#caua:
l = m = 2
q1 = Sxy(p4,l,m)
q2= Sxy(p2,l,m)
q3 = Sxy(p3,l,m)
q4 = Sxy(p4,l,m)
print(p1, "=>", q1)
print(p2, "=>", q2)
print(p3, "=>", q3)
print(p4, "=>", q4)

#Cau b:
l = m = 0.5
q1 = Sxy(p4,l,m)
q2= Sxy(p2,l,m)
q3 = Sxy(p3,l,m)
q4 = Sxy(p4,l,m)
print(p1, "=>", q1)
print(p2, "=>", q2)
print(p3, "=>", q3)
print(p4, "=>", q4)

#cauc:
l = 1
m = -1
q1 = Sxy(p4,l,m)
q2= Sxy(p2,l,m)
q3 = Sxy(p3,l,m)
q4 = Sxy(p4,l,m)
print(p1, "=>", q1)
print(p2, "=>", q2)
print(p3, "=>", q3)
print(p4, "=>", q4)

#caud:
l = -1
m = 1
q1 = Sxy(p4,l,m)
q2= Sxy(p2,l,m)
q3 = Sxy(p3,l,m)
q4 = Sxy(p4,l,m)
print(p1, "=>", q1)
print(p2, "=>", q2)
print(p3, "=>", q3)
print(p4, "=>", q4)

N = np.array([
    [-1.0,-0.5,-0.5, 0.0, 0.0, 1.0, 1.0, 1.7, 1.0, 0.8, 0.8, 0.5, 0.5,-1.0,-1.7,-1.0,-1.0],
    [ 0.0, 0.0, 0.8, 0.8, 0.0, 0.0, 1.0, 1.0, 2.0, 2.0, 2.5, 2.5, 2.0, 2.0, 1.0, 1.0, 0.0]
    ])
Nx = N[0,:]
Ny = N[1,:]

fig = plt.figure(figsize = (10,5))
plt.plot(Nx,Ny,'ro-')
plt.grid(alpha =.6, linestyle ='--')

#cau9
# Cau 9a)
T = np.array([
    [2],
    [4]
    ])
TN = T+N
TNx = TN[0,:]
TNy = TN[1,:]

# Cau 9b)
theta=m.pi/3
R = np.array([ [m.cos(theta),-m.sin(theta)],
                [m.sin(theta),m.cos(theta)]
             ])
RN = R@N
RNx = RN[0,:]
RNy = RN[1,:]

# Cau 9c)
S = np.array([[2, 0],
              [0, 3]
              ])
SN = S@N
SNx = SN[0,:]
SNy = SN[1,:]

# Cau 9d)
sh = np.array([[1.0,0.5],
               [-1.5,1.0]
               ])
sN = sh@N
sNx = sN[0,:]
sNy = sN[1,:]

plt.show()