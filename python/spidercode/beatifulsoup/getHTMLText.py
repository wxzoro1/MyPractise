import requests
def getHTMLText(url):
    try:
        
        r = requests.get(url,timeout = 30)
        r.raise_for_status()
        r.encoding = r.apparent_encoding
    except:
        return "产生异常"
        