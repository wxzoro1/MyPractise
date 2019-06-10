#调用栈
'''def foo(s):
    return 10 / int(s)
def bar(s):
    return foo(s)*2
def main():
    bar('0')
main()'''
#记录错误
'''import logging
def foo(s):
    return 10/int(s)
def bar(s):
    return foo(s)*2
def main():
    try:
        bar('0')
    except Exception as e:
        logging.exception(e)
main()
print('END')'''
#抛出错误
'''class FooError(ValueError):
    pass
def foo(s):
    n = int(s)
    if n==0:
        raise FooError('invaild value:%s'%s)
    return 10/n
foo('0')'''
#捕获并抛出
def foo(s):
    n = int(s)
    if n==0:
        raise ValueError('invaild value:%s'%s)
    return 10/n
def bar():
    try:
        foo('0')
    except ValueError as e:
        print('ValueError!')
        raise
bar()
#错误也可转换类型



