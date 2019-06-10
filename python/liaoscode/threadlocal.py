'''def process_student(name):
    std = student(name)
    do_task_1(std)
    do_task_2(std)
def do_task_1(std):
    do_subtask_1(std)
    do_subtask_2(std)
def do_task_2(std):
    do_subtask_2(std)
    do_subtask_2(std)
#消除了std在每层都出现的问题 
global_dict = {}
def std_thread(name):
    std = student(name)
    global_dict[threading.current_thread()] = std
    do_task_1
    do_task_2
def do_task_1():
    std = global_dict[thraeding.current_thread()]
def do_task_2():
    std = global_dict[threading.current_thread()]'''
#threadlocal 一个线程在各个函数间传递参数的方法
import threading
local_school = threading.local()
def process_student():
    std = local_school.student
    print('Hello, %s (in %s )'% (std, threading.current_thread().name))
def process_thread(name):
    local_school.student = name
    process_student()
t1 = threading.Thread(target= process_thread, args=('GRASD',), name=('Thread-A'))# args是名字 name是线程名
t2 = threading.Thread(target= process_thread, args=('SADA',), name=('Thread-B'))
t1.start()
t2.start()
t1.join()
t2.join()
