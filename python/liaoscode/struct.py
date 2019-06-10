#基理不是很懂
import struct
#二进制到字符串 32位无符号整数 -> 4字节
a = struct.pack('>I', 10240000)
print(a)
b = struct.unpack('>IH', b'\xf0\xf0\xf0\xf0\x80\x80') #->4字节 2字节无符号整数
print(b)
#BMP位图
s = b'\x42\x4d\x38\x8c\x0a\x00\x00\x00\x00\x00\x36\x00\x00\x00\x28\x00\x00\x00\x80\x02\x00\x00\x68\x01\x00\x00\x01\x00\x18\x00'
c = struct.unpack('<ccIIIIIIHH', s)
print(c) #windows位图 640*360 颜色24