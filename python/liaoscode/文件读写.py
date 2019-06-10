#读文件
f = open ('G:/my code/Users/michael/test.txt','r')
a = f.read()
print(a)
# 防止IOERROR
'''try:
    f = open ('G:/my code/Users/michael/test.txt','r')
    print(f.read())
finally:
    if f:
        f.close()'''
#With语句
with open ('G:/my code/Users/michael/test.txt','r', encoding='gbk') as f:
    for line in f.readlines():
        print(line.strip())         #read(size)

f= open('G:/my code/Users/michael/test.bmp','rb')
print(f.read())
#写文件
with open ('G:/my code/Users/michael/test.txt','w') as f:
    f.write('asd') #这样是删除原来的然后生成新的 用'a'则会调用append


