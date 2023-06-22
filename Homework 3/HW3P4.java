import java.util.Date;
import java.util.ArrayList;
public class HW3P4
{   public static void main(String args[])
    {
        Date d = new Date(2000000000);
        Food gum = new Food("gum");
        Food las = new Food("lasagna");
        Fruit pom  = new Fruit("pomegranate",d);
        Fruit app = new Apple(d);
        Orange o = new Orange(d);
        Shrimp sh = new Shrimp();
        Seafood p = new Prawn();
        Seafood l = new Seafood("lobster");
        sh.prepare();
        app.prepare();
        pom.prepare();
        o.prepare();
        gum.prepare();
        p.prepare();
        l.prepare();
        las.prepare();
        las = app;
        las.prepare();
        o.ripeTime();
        pom.ripeTime();
        
        ArrayList<Object>objects = new ArrayList<>();
        objects.add("Food");
        objects.add("Orange");
        objects.add("Fruit");
        objects.add("Papaya");
        objects.add(3932728);
        ArrayList<Food>food = listConverter(objects);
        for(int i = 0; i < food.size();i++) {
        	System.out.println(food.get(i).name);
        }
    }
	public static ArrayList<Food> listConverter(ArrayList<Object>list) {
		ArrayList<Food>foods = new ArrayList<Food>();
		String storage = "";
		Date stor;
		int pointer = -1;
		for(int i = 0; i < list.size();i++) {
			if(list.get(i) instanceof Integer) {
				stor = new Date((int)list.get(i));
				((Fruit) foods.get(pointer)).setDate(stor);
			}
			else {
				storage = (String)list.get(i);
			}
			if(storage.compareTo("Food") == 0) {
				foods.add(new Food());
				pointer++;
			}
			else if(storage.compareTo("Fruit") == 0) {
				foods.add(new Fruit());
				pointer++;
			}
			else if(storage.compareTo("Orange") == 0) {
				foods.add(new Orange());
				pointer++;
			}
			else if(storage.compareTo("Apple") == 0) {
				foods.add(new Apple());
				pointer++;
			}
			else {
				foods.get(pointer).name = storage;
			}
		}
		return foods;	
	}
}