import java.util.Iterator;

public class HW4P2bSamudrala {
	public static void main(String[]a) {
		int[]array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i;
			if(i % 2 ==0) {
				array[i] +=3;
			}
			else {
				array[i]-=5;
			}
		}
		SortedList list = new SortedList(array);
		Iterator<Integer>it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
