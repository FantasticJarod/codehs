import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);      
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        
        System.out.println("How tall are you?");
        int height = scanner.nextInt();
        
        if (age > 8 && height > 41) {
            System.out.println("Welcome aboard!");
        } else {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
