package ncs.test5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PhoneMapTest {

	public static void main(String[] args) {
		Map<String, Phone> map = new HashMap<>();
		map.put("galaxy S7", new Phone("galaxy S7", 563500, "삼성", 7));
		map.put("iphone 6s", new Phone("iphone 6s", 840000, "애플", 3));
		map.put("G5", new Phone("G5", 563500, "LG", 5));

		System.out.println("맵에 저장된 정보는 다음과 같습니다.");
		for (Map.Entry<String, Phone> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		Properties prop = new Properties();
		for(Map.Entry<String, Phone> e : map.entrySet()) {
			prop.setProperty(e.getKey(), e.getValue().toString());
		}
		
		File file = new File("phone.xml");
		
		if(file.exists()) {
			System.out.println("파일이 이미 생성되어 있습니다.");
		} else {
			try {
				file.createNewFile();
				System.out.println("파일을 생성하였습니다.");
				prop.storeToXML(new FileOutputStream(file), null);
				System.out.println("phone.xml 파일에 성공적으로 저장되었습니다.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
