'''from hello import Hello
h = Hello()
h.hello()
print(type(Hello))
print(type(h))

def fn(self, name='world'):
    print('Hello,%s.'%name)
Hello = type('Hello',(object,),dict(hello=fn)) #type 创建Hello class 1.class名2.支持多重继承3.函数绑定 
h = Hello
h.hello()
print(tyoe(Hello))
print(type(h))'''

class ListMetaclass(type):
    def __new__(cls,name,bases,attrs):
        attrs['add'] = lambda self, value: self.append(value)
        return type.__new__(cls,name,bases,attrs)
class MyList(list,metaclass=ListMetaclass):
    pass
L = MyList()
print(L.add(2))
print(L)  #ORM 不清楚Metaclassd

