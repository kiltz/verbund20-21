package features.inout;

import java.io.File;
import java.util.Map.Entry;
import java.util.Properties;

public class Info {

	public static void main(String[] args) {
		// welche Verzeichnisse stehen uns zur Verfügung
		Properties props = System.getProperties();
		// Properties ist eine Map: Key-Value
		for (Entry<Object, Object> e : props.entrySet()) {
			// System.out.println(e.getKey()+": "+e.getValue());
		}
		String p1 = System.getProperty("user.dir");
		String p2 = System.getProperty("user.home");

		System.out.println(p1);
		System.out.println(p2);

		File f = new File(p2);
		System.out.println("Existiert: "+f.exists());
		System.out.println("Ist ein Verzeichnis: "+f.isDirectory());

		String[] dateien = f.list();
		for (int i = 0; i < dateien.length; i++) {
			System.out.println(dateien[i]);
		}
		File f2 = new File(p2 + "/meinVerzeichnis");
		System.out.println("Vor dem Anlegen: "+f2.exists());
		f2.mkdirs();
		System.out.println("Nach dem Anlegen: "+f2.exists());
		f2.delete();

		File fTest = new File("test.txt");
		System.out.println(fTest.length());


	}

}
