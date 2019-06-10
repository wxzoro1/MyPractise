import requests
kv = {'user-agent':'Mozilla/5.0'}
url = 'https://www.amazon.cn/dp/B0083DP0CY/ref=cngwdyfloorv2_recs_0/458-1499205-5032627?pf_rd_m=A1AJ19PSB66TGU&pf_rd_s=desktop-2&pf_rd_r=AS7DZ4TTT2NZZ6E1K6B5&pf_rd_r=AS7DZ4TTT2NZZ6E1K6B5&pf_rd_t=36701&pf_rd_p=d0690322-dfc8-4e93-ac2c-8e2eeacbc49e&pf_rd_p=d0690322-dfc8-4e93-ac2c-8e2eeacbc49e&pf_rd_i=desktop'
try:
    r = requests.get(url,headers = kv)
    r.raise_for_status()
    r.encoding = r.apparent_encoding
    print(r.text[1000:2000])
except:
    print('fail')