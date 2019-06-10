nums = [1,2,3]
def calc(*numbers):
    sum = 0
    for n in numbers:
        sum = sum + n * n
    return sum
print (calc(1,2))

print(calc(nums[0],nums[1],nums[2]))
print(calc(*nums))
#一个*解决了可变参数输入复杂的问题
