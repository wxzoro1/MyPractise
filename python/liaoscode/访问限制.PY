class Student (object):
    def __init__(self,name,score):
        self.__name = name
        self.__score = score
    def print_score(self):
        print('%s:%s'%(self.__name,self.__score))
    def get_name(self):
        return self.__name
    def get_score(self):
        return self.__score
    def set_score(self,score):
        if 0<= score <=100:
            self.__score = score
        else:
            raise ValueError('Bad score')

bart = Student('green',61)#此时可以通过Bart.name直接改变score 但加入setscore可以进行筛选
a = bart.get_score()
print(a)
bart.__score = 99#错误设置
print(bart.__score)
bart.set_score(10)#!!! set 这样使用
print(bart.get_score())
print(bart._Student__score)