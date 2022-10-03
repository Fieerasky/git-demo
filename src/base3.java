import java.util.*;
//将输入的字符串转化为int数组
public class base3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] a=str.split("");
        int[] b=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=Integer.parseInt(a[i]);
            b[i]+=1;
            System.out.print(b[i]+" ");
        }
    }
}







