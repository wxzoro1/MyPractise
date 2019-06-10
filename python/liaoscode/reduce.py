from functools import reduce
'''def f(x,y):
    return x+y
x = reduce(f,[1,23,3])
print(x)'''
#相当于sum
'''def f(x,y):
    return x*10+y
x = reduce(f,[2,4,6,8,10])
print(x)'''
#转换序列
'''digits = {'0': 0, '1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9}
def comeon(s):
    def charint(s):
        return digits[s]
    def f(x,y):
        return x*10+y
    return reduce(f,map(charint,s))
a = comeon('123123123')
print(a)'''
#int化
digits = {'0': 0, '1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9}
def charint(s):
    return digits[s]
def comeon(s):
    return reduce(lambda x,y:x*10+y,map(charint,s))
a = comeon('128391237123')
c = map(charint,'128391237123')
d = list(c)
print(d)
print(a)
#lambda 简化



