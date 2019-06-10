import threading,multiprocessing
def loop():
    x = 0
    while True:
        x = x + 1
print(multiprocessing.cpu_count())
for i in range(multiprocessing.cpu_count()):#有GIL锁 不能全部利用8核
    t = threading.Thread(target=loop)
    t.start()