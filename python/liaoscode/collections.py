from collections import namedtuple,deque,defaultdict,OrderedDict
Point =namedtuple('Point',['x','y'])#定义限制元祖，并通过属性引用而非索引引用tuple
p = Point(1,2)
print(p.x,p.y)
print(isinstance(p,Point),
isinstance(p,tuple))
Circle = namedtuple('Circle',['x','y','z'])
#deque双向列表
q = deque(['a','b','c'])
q.append('x')
q.appendleft('y')
print(q)
#defaultdict
dd = defaultdict(lambda:'N/A')
dd['key1']  = 'abc'
print(dd['key1'])
print(dd['key2'])
#ordereddict
d = dict([('a',1),('b',2),('c',3)])
print(d)
od = OrderedDict([('a',1),('b',2),('c',3)])
print(od)
