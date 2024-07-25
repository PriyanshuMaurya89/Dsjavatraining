import java .util.Scanner;
public class CodingEligibility{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if( age>=32){
            System.out.println( " i am eligible for coding  my name is "  +name+ "and age is " +age);
        }
        else{
            System.out.println( " i am not eligible for the coding");
        }

    }

}
