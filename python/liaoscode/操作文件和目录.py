import os
print(os.name)
print(os.environ.get('PATH'))
print(os.path.abspath('.'))
print(os.path.join('Users/michael','testdir'))
#os.mkdir('Users/michael/testdir')
#os.rmdir('Users/michael/testdir')
#拆分和合成路径要用 os.path.join 和 os.path.split 可随操作系统而变/ \
#os.path.splitext 直接得到文件扩展名
#重命名
'''os.rename('Users/michael/test.txt','test.py')
#删除
os.remove('test.py')'''
#shutil提供copyfile()
import shutil
#列出当前目录下的所有目录
a = [x for x in os.listdir('.') if os.path.isdir(x)]
print(a)
#列出当下目录所有py文件
b = [x for x in os.listdir('.') if os.path.isfile(x) and os.path.splitext(x)[1]=='.py']
print(b)