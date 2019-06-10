from datetime import datetime,timedelta,timezone
now = datetime.now()
print(now)
print(type(now))

dt = datetime(2015,4,19,12,11,11)
print(dt)
#timestamp
dt = datetime(2018,2,21,23,11,22)
a = dt.timestamp()
print(a)
print(datetime.fromtimestamp(a))#本地时间
print(datetime.utcfromtimestamp(a))#UTC时间
#str转datetime
cday = datetime.strptime('2015-6-1 18:59:00', '%Y-%m-%d %H:%M:%S')#固定的
print(cday)
#datetime转str
print(now.strftime('%a, %b %d %H:%M'))
#datatime加减
print(now + timedelta(hours = 10))
print(now - timedelta(days = 1))
print(now + timedelta(days = 1, hours = 10))
#本地时间转UTC
tz_utc_8 = timezone(timedelta(hours = 8))#创建+8时区
print(now)
dt = now.replace(tzinfo = tz_utc_8)#强制为+8时区 若运行成功则说明猜测时区正确
print(dt)
#时区转换
utc_dt = datetime.utcnow().replace(tzinfo=timezone.utc)#强制时区为0
print(utc_dt)
#将转换时间为北京
beijing_dt = utc_dt.astimezone(timezone(timedelta(hours=8)))
print(beijing_dt)
#东京
tokyo_dt = utc_dt.astimezone(timezone(timedelta(hours=9)))
print(tokyo_dt)
#北京转东京
tokyo_dt2 = beijing_dt.astimezone(timezone(timedelta(hours=9)))
print(tokyo_dt2)
#要知道datetime时区 然后强制 作为基准
#时区转换不必从utc 0 开始 从北京直接可转东京，(强制后即可)




