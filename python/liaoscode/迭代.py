d = {'a': 1, 'b': 2, 'c': 3}
for x in d:
    print(x)
#判断可迭代对象
'''from collections import Iterable
print(isinstance({11,112},Iterable))
isinstance(11,Iterable)
isinstance([11,112],Iterable)'''
# 如果需要下表排序字典需要先进行字典转化为列表嵌套元祖
b = list(d.items())
for i,items in enumerate(b):
    print(i,items)
