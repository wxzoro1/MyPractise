def f1(a,b=0,*args,d,**kw):
    print('a',a,'b',b,'args',args,'d',d,'kw',kw)
f1(1,3,'a','b',d=11,x=223)