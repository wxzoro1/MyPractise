import random, time, queue
from multiprocessing.managers import BaseManager
#发送任务的队列
task_queue = queue.Queue()
#接受任务的队列
result_queue = queue.Queue()
def return_task_queue():
    global task_queue
    return task_queue
def return_result_queue():
    global result_queue
    return result_queue

class QueueManager(BaseManager):
    pass
if __name__ == '__main__':
    QueueManager.register('get_task_queue', callable = return_task_queue)
    QueueManager.register('get_result_queue', callable = return_result_queue)   
    manager = QueueManager(address = ('127.0.0.1', 5002), authkey=b'abc')
    manager.start()
    task = manager.get_task_queue()
    result = manager.get_result_queue()
    for i in range(10):
        n = random.randint(0, 10000)
        print('Put task %d...' % n )
        task.put(n)
    print('Try get results...')
    for i in range(10):
        r = result.get(timeout=30)
        print('Result : %s' % r)
    manager.shutdown()
    print('master exit.')
