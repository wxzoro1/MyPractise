import json
class Student(object):
    def __init__(self,name,age,score):
        self.name = name
        self.age  = age
        self.score= score
s = Student('Green',20,60)

def student2dict(std):
    return {
        'name' : std.name,
        'age'  : std.age,
        'score': std.score
    }
print(json.dumps(s,default = lambda obj:obj.__dict__))#定义__slots__得特殊捕捉函数 大多数class对象都有__dict__
                                                      #default = student2dict也可