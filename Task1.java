import java.util.Scanner;
 
public class Task1 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
                System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        if (a < b); {
            System.out.println("a меньше b");
        } if (a > b) {
            System.out.println("a больше b");
        } 	if (a == b) {
            System.out.println("a равно b");
        }
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.printf("a: %s  b: %d  \n", a, b);
        in.close();
    }

}