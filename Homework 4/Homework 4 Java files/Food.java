public class Food {
    public String name;
    public Food(){
    	name = "Random";
    }
    public Food(String name){
        this.name = name;
    }
    public void prepare(){
    	System.out.println("Prepare the " + name);
    }
}
