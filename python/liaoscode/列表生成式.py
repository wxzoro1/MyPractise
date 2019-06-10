L = []
for x in range(11):
    L.append(x*x)
print(L)
a = [x*x for x in range (11) if x % 2 != 0]
print (a)
b = [c*d for c in range(1,3) for d in range(4,6)] #range后面范围不包含
print (b)
d = {'x': 'A', 'y': 'B', 'z': 'C' }
for x,y in d.items():
    print(x,'=',y)
#字典转化列表的两种方法
b = list(d.items())
print(b)
w = [x+'='+y for x,y in d.items()]
print(w)
#全部首字母大写
L = ['hello', 'world', 'ibm', 'apple']
F = [s.title() for s in L]                 #capitalize()
print(F)
#全部第二个字母大写 2018/10/16
L = ['hello', 'world', 'ibm', 'apple']
D = [s[0] for s in L]
E = [s[1].upper() for s in L]
F = [s[2:] for s in L]
G = [(s[0]+s[1].upper()+s[2:]) for s in L]
print(D)
print(E)
print(F)
print(G)






