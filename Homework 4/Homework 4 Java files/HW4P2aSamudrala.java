import java.util.*;
public class HW4P2aSamudrala {
	public static void main(String[]args) {
		ArrayList<Fruit>fruits = new ArrayList<Fruit>();
		long num = 204587433443L;
		String[] names = {"berry","banana","cherry","chicory","peach"};
		for(int i = 0; i < 5; i++) {
			fruits.add(new Fruit(names[i],new Date(num)));
			if(i % 2 ==0) {
				num -= 1000;
			}
			else {
				num+=100000;
			}
		}
		Collections.sort(fruits);
		for(Fruit f : fruits) {
			System.out.print(f.name + " ");
			f.ripeTime();
		}
		
	}
}
