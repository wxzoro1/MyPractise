'''s = Student()
s.score = 123 #可以任意修改'''
'''class Student(object):
    def get_score(self):
        return self.__score
    def set_score(self,value):
        if not isinstance(value,int):
            raise ValueError('Score must be integer！')
        if value < 0 or value > 100:
            raise ValueError('Score must between 0 ~ 100!')
        self.__score = value
s = Student()
s.set_score(31)
print(s.get_score())
s.set_score(11)
s.score = 12
print(s.get_score())'''

'''class Student(object):
    @property
    def score(self):
        return self._score
    @score.setter
    def score(self,value):
        if not isinstance(value,int):
            raise ValueError('Score must be integer！')
        if value < 0 or value >100:
            raise ValueError('Score must between 0 ~ 100!')
        self._score = value
    
s = Student()
s.score = 13
print(s.score)'''

class Student(object):
    @property
    def birth(self):
        return self._birth
    
    @birth.setter
    def birth(self,value):
        self._birth = value     #可读写属性
    
    @property
    def age(self):
        return 2018-self._birth #只读属性
s = Student()
s.birth = 1997        #关于这个引用仍要重复看
print(s.age)