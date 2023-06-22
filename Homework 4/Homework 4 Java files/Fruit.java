import java.util.Date;
public class Fruit extends Food implements Comparable<Fruit>{
    public Date date;
    public Fruit(){
    }
    public Fruit(String name, Date Date){
        this.name = name;
        this.date = Date;
    }
    public void ripeTime() {
    	System.out.println("You can eat it on " + date.toString());
    }
    public void setDate(Date d) {
    	this.date = d;
    }
    public int compareTo(Fruit f) {
    	return date.compareTo(f.date);
    }

}
