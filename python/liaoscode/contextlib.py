#with 原理
'''class Query(object):
    def __init__(self,name):
        self.name = name
    def __enter__(self):
        print('Begin')
        return self
    def __exit__(self, exc_type, exc_value, traceback):
        if exc_type:
            print('Error')
        else:
            print('End')
    def query(self):
        print('Query info about %s...' % self.name)
with Query('Green') as q:
    q.query()'''
'''#@contextmanager
from contextlib import contextmanager

class Query(object):
    def __init__(self,name):
        self.name = name
    def query(self):
        print('Query info about %s...' % self.name)
@contextmanager
    def create_quary(name):
        print('Begin')
        q = Query(name)
        yield q
        print('End')
with create_quary('Bob') as q:
    q.query()'''
#代码执行前自动执行特定代码
from contextlib import contextmanager,closing
from urllib.request import urlopen
'''@contextmanager
def tag(name):
    print("<%s>" % name)
    yield
    print("</%s>" % name)
with tag("h1"):
    print('Begin')
    print('End')'''

with closing(urlopen('https://www.python.org')) as page:
    for line in page:
        print(line)
 
#closing 原理 把任意对象变成上下文对象 并适合with
'''@ contextmanager
def closing(thing):
    try:
        yield thing
    finally:
        thing.close()'''