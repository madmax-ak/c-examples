import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int number = input.nextInt();
        System.out.println("You entered: " + number);
        
        input.close();
    }
}