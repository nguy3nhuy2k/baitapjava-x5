import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("nhập ST1 :");
        double b = scanner.nextDouble();
        System.out.println("nhập ST2 :");
        double c = scanner.nextDouble();
        System.out.println("nhập ST2 :");
        double delta = b*b - 4*a*c ;
        if(a == 0){
            if(b == 0){
                System.out.println("pt vô nghiệm");
            }
            else {
                System.out.println("pt có 2 nghiêm :" + c/b + (-c/b));
            }
        }
        else if(delta < 0){
            System.out.println("pt vô nghiệm");
        }
        else if(delta == 0){
            System.out.println("pt có nghiệm kép" + (-b/2*a));
        }
        else {
            System.out.println("pt có 2 nghiệm phân biệt :" + "x1 =" + (-b +Math.sqrt(delta)/2*a) + "x2 =" + (-b - Math.sqrt(delta)/2*a));
        }
    }
}
