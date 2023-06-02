public class Abstraction extends Myname {


    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Abstraction obj2 = new Abstraction();
        obj2.printName();
        obj2.age();
    }
}

abstract class Myname implements Age{
    String name = "Shakil";
   public abstract void printName();

   public void age(){
       System.out.println("24");
   }
}

interface Age{
    public void age();
}
