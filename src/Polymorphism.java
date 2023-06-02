public class Polymorphism extends Name {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void printName(){
        System.out.println("My name is Shakil");
    }

    public static void main(String[] args) {

        Polymorphism obj1 = new Polymorphism();
        Name obj2 = new Polymorphism();

        obj1.sum(3,6,9);
        obj1.sum(4,7);
        obj2.printName();
    }
}

class Name{
    void printName(){
        System.out.println("My name is Rafel");
    }
}

