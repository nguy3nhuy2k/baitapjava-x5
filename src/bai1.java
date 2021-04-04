import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so :");
        int Num = scanner.nextInt();
        if(Num > 0){
            System.out.println(Num + " là số nguyên dương");
        }
        else
            {
                System.out.println(Num + " khong phai so nguyen duong");
        }
    }
}
