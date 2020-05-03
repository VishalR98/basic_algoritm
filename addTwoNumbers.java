
public class Main {

    public static void main(String[] args) {

        int num1, num2, sum;
        Scanner input = new Scanner(System.in); //Scanner is a class from util package
        System.out.print("Enter a number: ");
        num1 = input.nextInt(); //Store input from user

        System.out.print("Enter another number: ");
        num2 = input.nextInt(); //Store input from user

        sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}






