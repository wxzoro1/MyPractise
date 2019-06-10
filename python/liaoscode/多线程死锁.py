import time, threading
balance = 0
def change_it(n):
    global balance
    balance = balance + n
    balance = balance - n
def run_random(n):
    for i in range (1101210):#规模小看不出来
        change_it(n)

t1 = threading.Thread(target=run_random, args=(1,))
t2 = threading.Thread(target=run_random, args=(2,))
t1.start()
t2.start()
t1.join()
t2.join()
print(balance)
