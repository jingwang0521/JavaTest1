package main.java.com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class implElse implements interFace {

	public Map<Integer, List> sortNum(List<Integer> list) {
		Map<Integer, List> map = new HashMap<>();
		for (Integer i : list) {
			boolean flag = true;
			int key = i / 10;
			for (Map.Entry entry : map.entrySet()) {
				int temp = (int) entry.getKey();
				if (temp == key) {
					List list1 = map.get(entry.getKey());
					if (!list1.contains(new Integer(i))) {
						list1.add(i);
					}
					flag = false;
				}
			}
			if (flag == true) {
				List list1 = new ArrayList();
				list1.add(i);
				map.put(key, list1);
			}
		}
		return map;
	}
}


