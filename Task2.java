import java.util.*;  
class Task2 
{  
public static void main(String[] args)  
{  
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter a string: ");  
    String str= sc.nextLine();              //reads string   
    
    try (Scanner stscr2 = new Scanner(System.in)) {
        System.out.print("Enter a second string: ");  
        String str2= stscr2.nextLine();  
        
        if (str.equals(str2)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");             
        }
    }
}  
}  }