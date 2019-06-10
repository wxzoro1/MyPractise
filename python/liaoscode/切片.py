L = ['Michael', 'Sarah', 'Tracy', 'Bob', 'Jack']
#古老方法
'''r = []
n = 3
for i in range(n):
    r.append(L[i])
print(r)'''
#正常切片
print(L[0:4])
print(L[:4])
print(L[-2:])
print(L[-2:-1])
print(L[-1::-1])