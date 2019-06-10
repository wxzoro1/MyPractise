#在不同编程语言之间传递  对象
#json表示的对象就是标准的JavaScript语言的对象
import json
d = dict(name = 'Green', age = 20, score = 60)
print(json.dumps(d))

json_str = '{"name": "Green", "age": 20, "score": 60}'
print(json.loads(json_str))
