print(type(123),
type('str'),
type(None),
type(abs),
type(12)==type(123))

import types
def fn():
    pass
print(type(fn)==types.FunctionType,
type(abs) == types.BuiltinFunctionType,
type(lambda x:x) == types.LambdaType,
type((x for x in range (10))==types.GeneratorType))

'''a = Animal()
d = Dog()
h = Husky()
print(isinstance(h,Husky))'''
print(isinstance('sdsd',str))
print(dir('abc'))

class MyCat(object):
    def __len__(self):
        return 100
cat = MyCat()
print(len(cat))

class MyObject(object):
    def __init__(self):
        self.x = 9
    def power(self):
        return self.x * self.x
obj = MyObject()
print(hasattr(obj,'x'))
print(obj.x)
setattr(obj,'y',19)
print(getattr(obj,'y'))
print(obj.y)
print(getattr(obj,'z',404))
print(hasattr(obj,'power'))
fn = getattr(obj,'power')
print(fn())

