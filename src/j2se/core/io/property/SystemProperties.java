/**
 * 
 */
package j2se.core.io.property;

import java.util.Map.Entry;
import java.util.Properties;

/**
 * @author yandon 系统属性使用范例
 */
public class SystemProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = System.getProperties();

		for (Entry<Object, Object> entry : prop.entrySet()) {

			System.out.println("Key :" + entry.getKey() + "\t");
			System.out.println("Value :" + entry.getValue());
		}

		String version = prop.getProperty("java.vm.info");
		System.out.println(version);

	}

}
