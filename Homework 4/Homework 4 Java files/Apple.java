import java.util.Date;
public class Apple extends Fruit{
	public Apple(){
        name = "Apple";
	}
	public Apple(Date d) {
    	name = "Apple";
    	date = d;
    }
    public void prepare(){
    	System.out.println("Core the apple");
    }
}
