'''class Student(object):#类名开头通常大写
    pass
bart = Student()
bart.name ='Green'
print(bart.name)'''

'''class Student (object):
    def __init__(self,name,score):
        self.name = name
        self.score = score
bart = Student('Green',100)
print(bart.name,bart.score)
def print_score(std):
    print('%s:%s' %(std.name,std.score))
print_score(bart)'''


class Student (object):
    def __init__(self,name,score):
        self.name = name
        self.score = score
    def print_score(self):
        print('%s:%s'%(self.name,self.score))
    def get_grade(self):
        if self.score>90:
            return 'A'
        elif self.score>=60:
            return 'B'
        else:
            return 'C'
bart = Student('Green',18)
bart.print_score()
a = bart.get_grade()
print(a)
