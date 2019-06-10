def cal(*number):
    sum = 0
    for n in number:
        sum += n*n
    return sum
a = cal(1,2,3)
print(a)