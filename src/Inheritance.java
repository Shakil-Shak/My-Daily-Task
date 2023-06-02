public class Inheritance extends Sum {

    public static void main(String[] args) {

        Inheritance obj = new Inheritance();

        System.out.println(obj.a+ obj.b);
        System.out.println(obj.c- obj.d);
    }
}
class Sum extends Sub{
    int a=10;
    int b=20;
}
class Sub{
    int c=30;
    int d = 17;
}
