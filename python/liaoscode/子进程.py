'''import subprocess

print('$ nslookup www.python.org')
r = subprocess.call(['nslookup','www.python.org'])
print('Exit code:','r')
#子进程需要输入
print('$ nslookup')
p = subprocess.Popen(['nslookup'],stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
output, err = p.communicate(b'set q=mx\npython.org\nexit\n')
print(output.decode('gb18030'))#注意txt解码方式
print('Exit code:', p.returncode)'''
#communicate
from multiprocessing import Process, Queue
import os,time,random
#写进程
def write(q):
    print('Process to write:%s.'% (os.getpid()))
    for value in ['A','B','C']:
        print('Put %s to queue...'% value)
        q.put(value)
        time.sleep(random.random())
#读进程
def read(q):
    print('Process to read:%s.'%(os.getpid()))
    while True:
        value = q.get(True)
        print('Get %s from queue...'% value)
if __name__=='__main__':
    q = Queue()
    pw = Process(target=write, args=(q,))
    pr = Process(target=read, args=(q,))
    pw.start()
    pr.start()
    pw.join()
    pr.terminal() #死循环强行终止

