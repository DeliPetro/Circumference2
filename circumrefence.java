import java.util.Scanner;

public class circumrefence {

     public static void main(String[] args){

        System.out.println("Please give me a radius to calculate circumference");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double circumference = 2*radius*pi;
        System.out.println("Circumference is: " + circumference);




    }
    
}
