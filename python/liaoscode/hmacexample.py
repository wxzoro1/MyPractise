#专门加盐
import hmac
message = b'My game is nba2k19' # str -> bytes
key = b'tmac'
h = hmac.new(key,message,digestmod = 'MD5') #消息很长 h.update(msg)
print(h.hexdigest())