import requests
from bs4 import BeautifulSoup
url = 'https://www.2345.com/?kxxb881210'
r = requests.get(url)
demo = r.text
soup = BeautifulSoup(demo,'html.parser')
#print(soup.prettify())
print(soup.title)#标题
tag = soup.a #a标签
print(tag)
print(soup.a.name)
print(soup.a.parent.name)
print(soup.a.parent.parent.name)

print(tag.attrs)#标签属性
print(tag.attrs['class'])
print(tag.attrs['href'])
print(type(tag.attrs))#字典类型
print(type(tag))

print(soup.a.string) #<>之间的字符串<>
print(soup.p.string)
print(type(soup.p.string))#<>跨越</b>标签<> 

newsoup = BeautifulSoup('<b><!--This is a comment--></b><p>This is not a comment</p>','html.parser')
print(newsoup.b.string)
print(type(newsoup.b.string))#判断注释标签
print(newsoup.p.string)
print(type(newsoup.p.string))#判断注释标签
#标签树的下行遍历 contents children descendants
print(soup.head)
print(soup.head.contents)
print(soup.body.contents)
print(len(soup.body.contents))
print(soup.body.contents[1])
for child in soup.body.children:
    print(child)
for descendants in soup.body.descendants:
    print(descendants)
    

