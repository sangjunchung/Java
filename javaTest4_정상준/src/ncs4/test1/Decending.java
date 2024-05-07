package ncs4.test1;

import java.util.*;

public class Decending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer  o2) {
		return o2 - o1;
	}
}
