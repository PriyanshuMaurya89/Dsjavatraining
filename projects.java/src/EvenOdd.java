import java .util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=scanner.nextInt();

        if( num%2==0){
            System.out.println( " number is even");

        }
        else{
            System.out.println(" not even");



        }


    }
}
