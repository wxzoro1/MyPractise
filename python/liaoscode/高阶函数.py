#传入参数
def add(x,y,f):
    return f(x)+f(y)
x = add(1,2,abs)
print(x)

