import java.util.Scanner;

import java.util.*;
public class base5 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] a=new int[5];
            int n=sc.nextInt();
            for (int i = 0; i <n ; i++) {
                int m= sc.nextInt();
                a[i]=m;
            }
            for (int x:a)
            {
                System.out.println(x);
            }
        }

}
