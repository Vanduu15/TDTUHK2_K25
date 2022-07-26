import numpy as np 

def req1(A):
    max_sum = {i : sum(A[:, i]) for i in range(len(A))}
    return [key for key, value in max_sum.items() if value == min(max_sum.values())]
	
def fibon(n):
    a = 0
    b = 1
    while(b < n):
        c = a+b
        a = b
        b = c
    if b == n or a == n:
        return True
    if b > n:
        return False
def req2(A):
    diag_list = np.diag(A)
    fibon_list = [i for i in diag_list if fibon(i) == True]
    if len(fibon_list) == 0: return None
    return max(fibon_list)

def prime_number(n):
    if n < 2: return False
    for i in range(2, n):   
        if i % n == 0: return False
    return True
def req3(matrix):
    temp = np.copy(matrix)
    temp = temp.flatten()
    hasPrimeElement = []
    for i in temp:
        if prime_number(i) == True:
            hasPrimeElement.append(i)
    if len(hasPrimeElement) == 0:
        matrix[matrix > 0] = 1000
        return matrix
    value, counts = np.unique(np.array(hasPrimeElement), return_counts=True)
    frequency = {}
    for i in range(len(value)):
        frequency[value[i]] = counts[i]
    res= []
    for k, v in frequency.items():
        if v == max(frequency.values()):
            res.append(k)
    matrix[np.where(matrix<0)] = res[0]
    return matrix
 
def req4(A, threshold):
	return None
