package j2se.core.io.property;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {

	private static Object value;
	private static Object key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Map map = new HashMap(); Iterator iterator =
		 * map.entrySet().iterator(); while (iterator.hasNext()){
		 * 
		 * Entry entry = (Entry) iterator.next(); entry.getKey();
		 * entry.getValue(); }
		 */

		// use above method is better
		/*
		 * Map map = new HashMap(); Iterator iterator = map.keySet().iterator();
		 * while (iterator.hasNext()) {
		 * 
		 * Object key = iterator.next(); Object value = map.get(key); }
		 */

		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(key, value);
		for (Entry<Object, Object> entry : map.entrySet()) {

			key = entry.getKey();
			value = entry.getValue();

		}

	}

}
