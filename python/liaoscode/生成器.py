#g = (x*x for x in range(10))
'''for n in g:
    print(n)'''
def feb(max):
    n,a,b = 0,0,1
    while n < max:
        yield(b)#生成器
        a,b=b,a+b
        n = n+1
    return 'done'
x = feb(3)
for n in x:
    print(n)



