/**
 * 
 */
package j2se.core.io.property;

import java.util.Map;
import java.util.Map.Entry;

/**
 * @author yandon 环境变量使用范例
 * 
 */
public class Environment {

	public static void main(String[] args) {

		Map<String, String> env = System.getenv();

		for (Entry<String, String> entry : env.entrySet()) {

			System.out.println("Key :" + entry.getKey() + "\t");
			System.out.println("Value :" + entry.getValue());
		}

		System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));

	}

}
