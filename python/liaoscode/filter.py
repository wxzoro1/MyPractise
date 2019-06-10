def is_odd(n):  
    return n%2 == 1
c = list(filter(is_odd,[2,23,1,4,14,412,353]))
print(c)
def not_empty(x):
    return x and x.strip()
d = list(filter(not_empty,['a','','asdasd','23']))
print(d)
def _odd_iter():
    n = 1
    while True:
        n = n+2
        yield n
def not_divisible(n):
    return lambda x: x % n > 0 
def primes():
    yield 2
    it  = _odd_iter()
    while True:
        n = next(it)
        yield n
        it = filter(not_divisible(n),it)
for n in primes():
    if n<100:
        print(n)
    else:
        break
