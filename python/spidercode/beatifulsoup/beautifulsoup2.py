import requests
from bs4 import BeautifulSoup
url = 'https://www.python123.io/ws/demo.html'
r = requests.get(url)
demo = r.text
soup = BeautifulSoup(demo,'html.parser')
print(soup.title.parent)
print(soup.html.parent)
print(soup.parent)
#标签树的上行遍历 parent parents
for parent in soup.a.parents:
    if parent is None:
        print(parent)
    else: 
        print(parent.name)
#标签树的平行遍历(父子点不同 不能遍历) next_sibling previous_sibling next_siblings previous_siblings 未必均是标签类型 n—string也是结点
print(soup.a.next_sibling)#'and'
print(soup.a.next_sibling.next_sibling)
print(soup.a.previous_sibling)
print(soup.a.previous_sibling.previous_sibling)
for sibling in soup.a.next_siblings:
    print(sibling)
for sibling in soup.a.previous_siblings:
    print(sibling)
 
