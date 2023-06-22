import java.util.Date;
public class Orange extends Fruit{
	public Orange(){
        name = "Orange";
	}
	public Orange(Date d){
        name = "Orange";
        date = d;
    }
    public void prepare(){
    	System.out.println("Peel the orange");
    }
}
