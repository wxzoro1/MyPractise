import itertools
'''natuals = itertools.count(1)#无限迭代器
for x in natuals:
    print(x)'''
'''cs = itertools.cycle('ABC') #无限重复
for x in cs:
    print(x)'''
'''ns = itertools.repeat('nba',2)#重复可限制次数
for x in ns：
    print(x)'''
#takewhile
natuals = itertools.count(2)
ns = itertools.takewhile(lambda x: x<=10,natuals)
list(ns)
#连接迭代器 形成更大的迭代器
for c in itertools.chain('abc','xyz'):
    print(c)
#相邻的放在一起
'''for key, group in itertools.groupby('aaasdsdaasdsd'):
    print(key,list(group))'''
for key, group in itertools.groupby('aaasdsdaASDsd', lambda x: x.upper()):#无视大小写
    print(key,list(group))



