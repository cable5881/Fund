package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
import sun.misc.BASE64Encoder;

/** 
 * IText操作类 
 * @author shyh 
 * 
 */  
public class WordGenerator {  
	
	private static Configuration configuration = null;  
    private static Map<String, Template> allTemplates = null;  
      
    static {  
        configuration = new Configuration(new Version("2.3.23"));  
        configuration.setDefaultEncoding("utf-8");  
        configuration.setClassForTemplateLoading(WordGenerator.class, "/test");  
        allTemplates = new HashMap<>();   // Java 7 钻石语法  
        try {  
            allTemplates.put("1", configuration.getTemplate("1.ftl"));  
        } catch (IOException e) {  
            e.printStackTrace();  
            throw new RuntimeException(e);  
        }  
    }  
  
    private WordGenerator() {  
        throw new AssertionError();  
    }  
  
    public static File createDoc(Map<?, ?> dataMap, String type) {  
        String name = "temp" + (int) (Math.random() * 100000) + ".doc";  
        File f = new File(name);  
        Template t = allTemplates.get(type);  
        try {  
            // 这个地方不能使用FileWriter因为需要指定编码类型否则生成的Word文档会因为有无法识别的编码而无法打开  
            Writer w = new OutputStreamWriter(new FileOutputStream(f), "utf-8");  
            t.process(dataMap, w);  
            w.close();  
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw new RuntimeException(ex);  
        }  
        return f;  
    } 
    
    public static String getImageString(String filename) throws IOException {  
        InputStream in = null;  
        byte[] data = null;  
        try {  
            in = new FileInputStream(filename);  
            data = new byte[in.available()];  
            in.read(data);  
            in.close();  
        } catch (IOException e) {  
            throw e;  
        } finally {  
            if(in != null) in.close();  
        }  
        BASE64Encoder encoder = new BASE64Encoder();  
        return data != null ? encoder.encode(data) : "";  
   }  
}  


class mainTest {
	public static void main(String[] args) throws Exception{
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("donationName", "华为武汉研究所");
		dataMap.put("projectName", "华为");
		dataMap.put("CN_Amount", new CnUpperCaser("123456.12").getCnString());
		dataMap.put("totalAmount", "123456.12");
		dataMap.put("yearAmount", "12334");
		dataMap.put("month", "9");
		dataMap.put("day", "9");
		dataMap.put("span", "7");
		dataMap.put("donorName", "李奇波");
		dataMap.put("leader", "葛嘉辉");
		dataMap.put("date", "2015-8-20");
		/*String picBase64Code = WordGenerator.getImageString("f:\\1.jpg");
		dataMap.put("pic",picBase64Code);*/
		WordGenerator.createDoc(dataMap, "1");
	}
}
