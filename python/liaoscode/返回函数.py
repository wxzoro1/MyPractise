#返回函数不要引用循环变量
#下面是一定引用循环变量方法
def count():
    def f(j):
        def g():
            return j*j
        return g
    fs = []
    for i in range(1, 4):
        fs.append(f(i)) # f(i)立刻被执行，因此i的当前值被传入f()
    return fs
f1,f2,f3 = count()#如果只给一个f1会出现错误，有几个 给几个
print(f1(),f2(),f3())



