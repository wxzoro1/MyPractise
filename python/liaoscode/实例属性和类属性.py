class Student(object):
    
    def __init__(self,name):
        self.name = name
s = Student('Bob')
s.score = 90

class Student(object):
    name = 'Student'
s = Student()
print(s.name)
print(Student.name)
s.name = 'Green'
print(s.name)
print(Student.name)#实例属性将屏蔽类属性
del s.name
print(s.name)