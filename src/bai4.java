import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số : ");
        System.out.println("hiển thị 20 SNT :");
        int N = 2;

//        if(N <= 1){
//            System.out.println(N + " Không phải SNT");
//        }
//        else if(N == 2 || N == 3){
//            System.out.println(N + " Là SNT");
//        }
//        else {
            for (int i = 0; i < 20;) {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(N); j++){
                    if(N % j == 0){
                        check = false;
                        break;
                    }

                }
                if(check){
                    System.out.println(N + " là SNT");
                    i++;
                }
                else {
//                    System.out.println(N + " k phải SNT");
                }
                N++;

            }
        }
//            }

}