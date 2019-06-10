import base64
a = base64.b64encode(b'binary\x00string')
print(a)
b = base64.b64decode(b'YmluYXJ5AHN0cmluZw==')
print(b)
#把+和/分别变成-和_: +和/在url中不能直接作为参数
print(base64.b64encode(b'i\xb7\x1d\xfb\xef\xff'))
print(base64.urlsafe_b64encode(b'i\xb7\x1d\xfb\xef\xff'))
print(base64.urlsafe_b64decode(b'abcd--__'))
print(base64.urlsafe_b64decode(b'abcd++//'))
#可以自定义字母顺序，但不可以用来加密 适用于cookies 数字签名 编码去掉= 解码加上凑好4的倍数的=
