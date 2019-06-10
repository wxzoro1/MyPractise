package The_seventh.Exercise;

import java.io. *;
import java.net. *;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;


public class Stock {	//练习题 3
	 public static void saveHtml(String url) {
	        try {
	            File stock = new File("stock.html");
	            InputStream is;
	            FileOutputStream fos = new FileOutputStream(stock);
	            URL temp = new URL(url);
	            URLConnection uc = temp.openConnection();
	            uc.addRequestProperty(
	                    "User-Agent",
	                    "Mozilla/5.0 "
	                            + "(iPad; U; CPU OS 4_3_3 like Mac OS X; en-us) "
	                            + "AppleWebKit/533.17.9"
	                            + " (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5");
	            is = temp.openStream();
	            BufferedInputStream bis = new BufferedInputStream(is);
	            BufferedOutputStream bos = new BufferedOutputStream(fos);
	            int length;
	            byte[] bytes = new byte[1024 * 20];
	            while ((length = bis.read(bytes, 0, bytes.length)) != -1) {
	                fos.write(bytes, 0, length);
	            }
	            bos.close();
	            fos.close();
	            bis.close();
	            is.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public static void getLocalHtml(String path) {
//	        File file = new File(path);
//	        try {
//	            Document doc = Jsoup.parse(file, "UTF-8");
//	            Elements contents = doc.getElementsByClass("_close");
//	            System.out.println("鼎捷软件现价："+contents.text()); 
//			} catch (IOException e) {
//			    e.printStackTrace();
//			}
	 }
	    
	 public static void main(String[] args) {
	        String url = "https://gupiao.baidu.com/stock/sz300378.html";        
	        saveHtml(url);
	        getLocalHtml("stock.html");
	 }
}
