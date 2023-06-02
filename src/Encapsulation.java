public class Encapsulation {

   private String name = "Rafel";

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }

}
class PrintName{

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setName("Shakil");
        String myName = obj.getName();
        System.out.println(myName);
    }
}


