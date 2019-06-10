import re
a = re.search(r'\d+','asjdlasdkjas15222360467alsjxmcznvqi')
print(a)
b = re.match(r'^(\d{3})\-(\d{3,8})$','012-12345')#-前加不加\一样
print(b)
print(b.group(0))
print(b.group(1))
print(b.group(2))
c = 'a b      c'.split(' ')
print(c)
d = re.split(r'[\s+\,\:]+','a ,,,,b,,,,,,,   ::::   c')
print(d)
t = '16:52:22'#识别合法时间，但无法防止不规范 得结合程序判断
print(re.match(r'^(0[0-2]|1[0-9]|2[0-3]|[0-9])\:(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|[0-9]|)\:(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|[0-9]|)',t))
#贪婪匹配+
e = re.match(r'^(\d+)(0*)$','10100312321000').groups()
print(e)
f = re.match(r'^(\d+?)(0*)$','101000312321000').groups()#非贪婪匹配+？           不懂
print(f)
g = re.match(r'^(0*?)(\d+)','0001').groups()
print(g)
h = re.match(r'^(0*)(\d+)','0001').groups()
print(h)


