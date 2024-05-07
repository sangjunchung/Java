package ncs4.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		File file = new File("data.xml");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			FileOutputStream fos = new FileOutputStream(file);
			p.storeToXML(fos, null);
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileOpen(Properties p) {
		File file = new File("data.xml");

		try {
			FileInputStream fis = new FileInputStream(file);
			p.loadFromXML(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("1", new Fruit("apple", 1200, 3).toString());
		prop.setProperty("2", new Fruit("banana", 2500, 2).toString());
		prop.setProperty("3", new Fruit("grape", 4500, 5).toString());
		prop.setProperty("4", new Fruit("orange", 800, 10).toString());
		prop.setProperty("5", new Fruit("melon", 5000, 2).toString());

		fileSave(prop);

		fileOpen(prop);

		Fruit[] fruit = new Fruit[prop.size()];

		for (int i = 0; i < prop.size(); i++) {
			String[] strAr = prop.getProperty(Integer.toString(i + 1)).split(",");
			fruit[i] = new Fruit(strAr[0], Integer.parseInt(strAr[1]), Integer.parseInt(strAr[2]));
		}

		for (int i = 0; i < fruit.length; i++) {
			System.out.println((i + 1) + " = " + fruit[i].toString());
		}
	}
}
