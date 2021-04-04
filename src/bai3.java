import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so nguyen");
        int a = scanner.nextInt();
        if(a%3 == 0){
            System.out.println("FIZZ");
        } else if(a % 5 == 0){
            System.out.println("BUZZ");
        } else if(a % 3 == 0 && a % 5==0){
            System.out.println("FIZZBUZZ");
        } else {
            System.out.println(a + " là số");
        }
    }
}
