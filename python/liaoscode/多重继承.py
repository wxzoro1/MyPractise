class Animal(object):
    pass
#大类
class Mammal(Animal):
    pass
class Bird(Animal):
    pass
#各种动物
class Parrot(Bird):
    pass
class Ostrich(Bird):
    pass

class RunnableMixIn(object):
    def run(self):
        print('Running...')
class FlyableMixIn(object):
    def fly(self):
        print('Flying')

class Dog(Mammal,RunnableMixIn):
    pass
class Bat(Bird,FlyableMixIn):
    pass
a = Dog()
a.run()

#Mixin