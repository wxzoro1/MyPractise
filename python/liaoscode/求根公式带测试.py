import math
def quadratic(a,b,c):
    x = b**2-4*a*c
    n1 = (-b + math.sqrt(x))/(2*a)
    n2 = (-b - math.sqrt(x))/(2*a)
    return n1,n2
print(quadratic(2,3,1)) #由此可见 return 返回值为tuple
#写一个测试 
# if quadratic(2, 3, 1) != (-0.5, -1.0):
#   print('测试失败')
# elif quadratic(1, 3, -4) != (1.0, -4.0):
#   print('测试失败')
#else:
#   print('测试成功')