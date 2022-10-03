import java.util.*;

public class base1 {
//    二维数组的输入
        public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int m=sc.nextInt();
          int[][]arr=new int[n][m];
          sc.nextLine();//吸掉回车
            for (int i = 0; i <m ; i++) {
                for (int j = 0; j <n ; j++) {
                    int num=sc.nextInt();
                    arr[i][j]=num;
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j <n ; j++) {
                    System.out.print(arr[i][j]+' ');
                }
                System.out.println();
            }
    }


}
