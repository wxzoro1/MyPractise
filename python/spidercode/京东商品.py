import requests
try:
    r = requests.get('https://item.jd.com/100000177786.html')
    r.raise_for_status()
    r.encoding = r.apparent_encoding
    print(r.text[:1000])
except:
    print('fail')