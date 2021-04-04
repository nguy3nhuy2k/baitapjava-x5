import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số : ");
        int N = scanner.nextInt();
        if(N <= 1){
            System.out.println(N + " Không phải SNT");
        }
        else if(N == 2 || N == 3){
            System.out.println(N + " Là SNT");
        }
        else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++){
                if(N % i == 0){
                    check = false;
                    break;
                }

            }
            if(check){
                System.out.println(N + " là SNT");
            }
            else {
                System.out.println(N + " k phải SNT");
            }

        }
    }
}