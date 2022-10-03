import java.util.Scanner;
//多组输入
public class basc_code {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);// cin是自己定义的，这个是任意的
        int test = cin.nextInt();
        while (test>0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
            test--;
        }
    }
}