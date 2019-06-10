#在内存中读写
#写StringIO str
from io import StringIO
f = StringIO()
f.write('hello')
5
f.write('')
1
f.write('world')
6   
print(f.getvalue())  #获得写入的str
#读StringIO
f = StringIO('Hello!\nHi!\nGoodbye!')
while True:
    s = f.readline()
    if s == '':
        break
    print(s.strip())
#BytesIO 二进制
from io import BytesIO
f1 = BytesIO(b'\xe4\xb8\xad\xe6\x96\x87')
print(f1.read())



