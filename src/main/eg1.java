import java.util.*;
public class eg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int m= sc.nextInt();
            a[i]=m+1;
        }
        for (int x:a)
        {
            System.out.println(x);
        }
    }
}
