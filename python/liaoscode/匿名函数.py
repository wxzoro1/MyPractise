a = list(map(lambda x: x * x ,[1,2,3,4,5]))
print(a)

f = lambda x : x*x
print(f(1))

def builda(x,y):
    return lambda x,y: x*x + y
f1 = builda(1,2)#return lambda的时候只能这样引用
a = f1(2,5)
print(a)

