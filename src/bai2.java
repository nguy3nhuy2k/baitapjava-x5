import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num1 = scanner.nextInt();
        System.out.println("nhập cạnh góc vuông 1");
        int Num2 = scanner.nextInt();
        System.out.println("nhập cạnh góc vuông 2");
        int Num3 = scanner.nextInt();
        System.out.println("nhập cạnh góc vuông 3");
        if (Num3 * Num3 == ((Num1 * Num1) + (Num2 * Num2)) || Num2 * Num2 == ((Num1 * Num1) + (Num3 * Num3)) || Num1 * Num1 == ((Num3 * Num3) + (Num2 * Num2)))
        {
            System.out.println(Num1 + Num2 + Num3 + " là cạnh của TGV");
        }
        else{
            System.out.println(Num1 + Num2 + Num3 + " K là cạnh của TGV");
        }
    }
}

