package cn.edu360.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SortUtils {

	public static void getTop3(HashMap<String, List<OrderBean>> hashMap) {
		Set<Entry<String, List<OrderBean>>> entrySet = hashMap.entrySet();
		for (Entry<String, List<OrderBean>> entry : entrySet) {
			List<OrderBean> list = entry.getValue();
			Collections.sort(list, new Comparator<OrderBean>() {

				@Override
				public int compare(OrderBean o1, OrderBean o2) {
					return o2.getMoney()-o1.getMoney()>0?1:-1;
				}
			});
		}
	}

}
