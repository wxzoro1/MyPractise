import tornado.ioloop
import tornado.web

class MainHandler(tornado.web.RequestHandler):
    def get(self,x):

        if x == None:
            x = 9 
        else:
            x = int(x)
        y = int(self.get_argument('n',10))
        if  0<y<10:
            x = y
        html = '''
        <html>
        <body>
        '''
        if  0 < x < 10:
            for a in range(1,x+1):
                for b in range (1,a+1):
                    if a*b>=10:
                        html += '<td>' + str("%d*%d=%-100d" % (a,b,a*b)) + '&nbsp;' + '</td>'              
                    else:
                        html += '<td>' + str("%d*%d=%-100d" % (a,b,a*b)) + '&nbsp;&nbsp;' + '</td>'
                html += '</br>'
            html += '''      
        </body>
        </html>'''
        self.write(html)

application = tornado.web.Application([
    (r"/([0-9])?", MainHandler)
    ], debug=True)

if __name__ == "__main__":
    application.listen(8888)
    tornado.ioloop.IOLoop.instance().start()

