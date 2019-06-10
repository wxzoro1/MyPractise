class Animal(object):
    def run(self):
        print('Animal is running...') 
class Dog(Animal):
    def run(self):
        print('Dog is running...')
class Cat(Animal):
    def run(self):
        print('Cat is running...')
class Tortoise(Animal):
    def run(self):
        print('Tortoise is running slowly...')
class Timer(object):
    def run(self):
        print('Start...')


dog = Dog()
dog.run()
cat = Cat()
cat.run()#看执行顺序

a = list()
b = Animal()
c = Dog()
isinstance(a,list)

def run_twice(animal):
    animal.run()
    animal.run()
run_twice(Animal())
run_twice(Dog())
run_twice(Tortoise())
run_twice(Timer())#object 不用animal类也可 鸭子类型