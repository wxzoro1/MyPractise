import requests
import os
url = 'http://ubmcmm.baidustatic.com/media/v1/0f000ZjaV0Hbb1uWirPKsf.jpg'
root = 'D://pics//'
path = root + url.split('/')[-1]#保留原来文件名

try:
    if not os.path.exists(root):
        os.mkdir(root)
    if not os.path.exists(path):
        r = requests.get(url)
        with open(path,'wb') as f:
            f.write(r.content)
            print('success')
    else:
        print('It already exists')
except:
    print('fail')