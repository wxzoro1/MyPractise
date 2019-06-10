import requests
kv  = {'wd':'python'} #https://www.baidu.com/s?wd关键词接口
try:
    r = requests.get('http://www.baidu.com/s', params=kv)
    r.raise_for_status()
    print(r.request.url)
    print(len(r.text))
except:
    print('fail')
