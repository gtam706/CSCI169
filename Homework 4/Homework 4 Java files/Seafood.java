public class Seafood extends Food{
    public Seafood(){

    }
    public Seafood(String name){
        this.name = name;
    }
    public void prepare(){
        System.out.println("Peel the " + name);
    }
}
