
//反转数组
public class base2 {
    public static void main(String[] args){
        int[] base= {1,2,4,5,7};
        for (int i : base) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        int[] base1=new int[5];
        base1= base2.reverse(base);
//        倒转
        for (int i : base1) {
            System.out.print(i+" ");
        }
    }
//数组倒转
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0,j=result.length-1; i < arr.length; i++,j--) {
            result[j] = arr[i];
        }
        return result;
    }
}















