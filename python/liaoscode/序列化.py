d = dict(name='Green', age=20, score=60)
import pickle
pickle.dumps(d)#把对象序列化并写入文件

f = open('dump.txt','wb')
pickle.dump(d,f) #对象序列化写入file like object
f.close()

f = open('dump.txt','rb')
d = pickle.load(f) #从file like object 反序列化出对象
f.close()
print(d)
