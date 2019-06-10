import time, threading
lock = threading.Lock()
balance = 0
def change_it(n):
    global balance
    balance = balance + n
    balance = balance - n
def run_random(n):
    
    for i in range (1101210):#规模小看不出来
        lock.acquire()#获得锁
        try:
            change_it(n)
        finally:
            lock.release()#释放锁

t1 = threading.Thread(target=run_random, args=(1,))
t2 = threading.Thread(target=run_random, args=(2,))
t1.start()
t2.start()
t1.join()
t2.join()
print(balance)