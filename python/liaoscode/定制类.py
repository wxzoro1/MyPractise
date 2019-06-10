#用户和开发者看着方便些 __repr__ __str__
'''class Student(object):
    def __init__(self,name):
        self.name = name
    def __str__(self):
        return 'Student object (name : %s)' % self.name
    __repr__ = __str__
s = Student('Geogre')
print(s)'''
#可迭代 __iter__
'''class Fib(object):

    def __init__ (self):
        self.a, self.b = 0 , 1
    def __iter__ (self):
        return self
    
    def __next__(self):
        self.a, self.b = self.b, self.a+self.b
        if self.a > 100000:
            raise StopIteration()
        return self.a

for n in Fib():
    print(n)'''
#像list __getitem__
'''class Fib(object):
    def __getitem__(self,n):
        a,b = 1,1
        for x in range(n):  
            a, b = b , a + b
        return a
f = Fib()
print(f[0])
print()'''

'''class Fib(object):
    def __getitem__(self,n):
        if isinstance(n,int):
            a, b = 1, 1
            for x in range(n):
                a, b = b, a + b
            return a
        if isinstance(n,slice):
            start = n.start
            stop = n.stop
            if start is None:
                start = 0
            a, b = 1,1
            L = []
            for x in range(stop):
                if x>= start:
                    L.append(a)
                a, b = b, a + b
            return L
f = Fib()
a = f[0:5]
print(a) #没有对step做处理 也没有对负数做处理 __setitem__ __delitem__'''
#getattr 解决调用不存在 默认返回None
'''class Student(object):
    def __init__ (self):
        self.name ='Geogre'
    def __getattr__(self,attr):
        if attr == 'score':
            return 99
        if attr == 'age':
            return lambda:25 #返回函数
        raise AttributeError ('\'Student\' has no no attribute \'%s\'' % attr)
s = Student()
print(s.name)
print(s.score)
print(s.age())#调用函数
print(s.parent)
#api 调用不懂'''
#实例可以有自己的属性和方法
class Student(object):
    def __init__(self,name):
        self.name = name
    def __call__(self):
        print('My name is %s.' % self.name)
s = Student('Geogre')
print(s())
t = Student('Tont')
print(t())
#callable 判断可调用对象
print(callable(Student('Cherryu')),
callable(max),
callable([1,2,3]),
callable(None),
callable('str'))
