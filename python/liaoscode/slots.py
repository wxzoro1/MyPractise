'''class Student(object):
    pass
s = Student()
s.name = 'Green' #给实例绑定属性
print(s.name)
def set_age(self,age): 
    self.age = age
from types import MethodType
s.set_age = MethodType(set_age,s) #给实例绑定方法
s.set_age(12)
print(s.age)
s2 = Student()
s2.set_age(23)#对其他实例不起作用
def set_score(self,score):
    self.score = score
student.set_score = set_score#给所有实例绑定方法
s.set_score(100)
print(s.score)
s2.set_score(50)
print(s2.score)'''
#限制实例添加属性
class Student(object):
    __slots__ = ('name','age')
s = Student()
s.name = 'Green'
s.age = 11 
#s.score = 12       #限制属性
#print(s.score)
class GraduateStudent(Student):
    pass
s1 = GraduateStudent()
s1.score = 123
print(s1.score)