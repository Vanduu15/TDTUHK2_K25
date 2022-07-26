from matplotlib import pyplot as plt
from math import *
import numpy as np

#cau1
A = np.array([[2,2],[2,3]])
b = np.array([[4],[6]])
def solve(A,b):
    return np.linalg.solve(A.T@A,A.T@b)
print(solve(A,b))

#cau2
A = np.array([[0,0,1],[0,1,1],[1,2,1],[1,0,1],[4,1,1],[4,2,1]])
b = np.array([[0.5],[1.6],[2.8],[0.8],[5.1],[5.9]])
def solve(A,b):
    return np.linalg.solve(A.T@A,A.T@b)
print(solve(A,b))

#cau3
def solve(A,b):
    return np.linalg.solve(A.T@A,A.T@b)
# a
A = np.array([[0,1],[1,1],[2,1],[3,1]])
b = np.array([[1],[1],[2],[3]])
print(solve(A,b))
# b
A = np.array([[1,1],[2,1],[4,1],[5,1]])
b = np.array([[0],[1],[2],[3]])
print(solve(A,b))
# c
A = np.array([[-1,1],[0,1],[1,1],[2,1]])
b = np.array([[0],[1],[2],[4]])
print(solve(A,b))
# d
A = np.array([[2,1],[3,1],[5,1],[6,1]])
b = np.array([[3],[2],[1],[0]])
print(solve(A,b))

#cau4
def solve(A,b):
    return np.linalg.solve(A.T@A,A.T@b)
A = np.array([[2000,1],[6000,1],[20000,1],[30000,1],[40000,1]])
b = np.array([[20],[18],[10],[6],[2]])
print(solve(A,b))
DT = np.array([[2000, 20],[6000, 18],[20000, 10],[30000, 6],[40000, 1]])
x, y = DT.T

plt.scatter(x,y)
x1,y1=solve(A,b)
plt.scatter(x1,y1,color='blue')
plt.show()

#cau5
def solve(A,b):
    return np.linalg.solve(A.T@A,A.T@b)
A = np.array([[cos(1),sin(1)],[cos(2),sin(2)],[cos(3),sin(3)]])
b = np.array([[7.9],[5.4],[-9]])
print(solve(A,b))

#cau6
def solve(A,b):
    return np.linalg.solve(A.T@A,A.T@b)
A = np.array([[1,2.1],[2,3.5],[3,4.2],[4,3.1],[5,4.4],[6,6.8]])
b = np.array([[2.1],[3.5],[4.2],[3.1],[4.4],[6.8]])
print(solve(A,b))

DT =[ [1,2.1],[2,3.5],[3,4.2],[4,3.1],[5,4.4],[6,6.8]]
x,y=zip(*DT)
plt.scatter(x,y)
plt.show()

