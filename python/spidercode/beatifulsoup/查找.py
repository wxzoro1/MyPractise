#find.all
import requests
from bs4 import BeautifulSoup
url = 'https://www.python123.io/ws/demo.html'
r = requests.get(url)
demo = r.text
soup = BeautifulSoup(demo,'html.parser')
#name 名称检索
print(soup.find_all('a'))#搜索a标签
print(soup.find_all(['a','b']))#搜索a和b标签
for tag in soup.find_all(True):#所有标签
    print(tag.name)
import re
for tag in soup.find_all(re.compile('b')):
    print(tag.name)
#attrs 属性值检索
print(soup.find_all('p','course'))#属性精确查找
print(soup.find_all(id = 'link1'))
print(soup.find_all(id = 'link'))
print(soup.find_all(id = re.compile('link')))#正则模糊查找
#recursive 是否对子孙全部检索 默认True
print(soup.find_all('a'))
print(soup.find_all('a', recursive =False))#儿子结点层面没有a标签 a标签在soup根节点的子孙结点标签
#string <>...</>中字符串区域的检索字符串
print(soup)
print(soup.find_all(string = 'Basic Python'))#精确
print(soup.find_all(string = re.compile('python')))#模糊
#简写<tag>(..)==<tag>.find_all(..)
#7个扩展方法扩展方法 一个返回结果 字符串 多个返回结果 列表 






