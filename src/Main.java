import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;

        int[] arr = {1,4,8,0,10};

        Scanner scan = new Scanner(System.in);

        for(int i =0;i>5;i++){
            arr[i] = scan.nextInt();
        }

        temp = arr[2];

        arr[2] = arr[4];

        arr[4] = temp;

        for(int value : arr){
            System.out.print(" "+value);
        }


    }
}