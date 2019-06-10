'''def foo()：
    r = some_funtion()
    if r ==(-1):
        return (-1)
    return r
def bar():
    r = foo()
    if r==(-1):
        print('Error')
    else:
        pass            #一层层去找函数 直到输出错误信息'''

'''try:
    print('try...')
    r = 10/2
    print('result:',r)  #引起错误 此步不再执行
except ZeroDivisionError as e:
    print('except:',e)
except ValueError as v:
    print('except:',v)
else:
    print('No Error')
finally:
    print('finally...')
print('END')'''
# 错误提示也是类 
'''try:
    foo()
except ValueError as v:
    print('ValueError')
except UnicodeError as u:
    print('UnicodeError')'''

def foo(s):
    return 10/int(2)
def bar(s):
    return foo(s)*2
    
def main(s):
    try:
        a = bar(s)
    except Exception as e:
        print('Error:',e)
    finally:
        print(a)#?输出结果 print(main(2)) 生成None print()返回None
print(bar(2))
main(3)
