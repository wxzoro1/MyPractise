'''def log(func):
    def wrapper(*args,**kw):
        print('call %s():'%func.__name__)
        return func(*args,**kw)
    return wrapper
@log
def now():
    print('2018-11-3')
a = now()
print(a)'''
#自定义text
import functools
def log(text):
    def decorator(func):
        @functools.wraps(func)#name 变回now
        def wrapper(*args,**kw):
            print('%s %s():'%(text,func.__name__))
            return func(*args,**kw)
        return wrapper
    return decorator
@log('execute')
def now():
    print('101231')
print(now())
print(now.__name__)    



