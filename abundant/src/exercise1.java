public class exercise1 {
    public static void main(String args[]){

        int n = 10000;
        int all_abundent[] = new int[n];

        for(int i = 0;i <= n;i++){
            int[] all_divisor= divisor(i);
            int a = abundent(all_divisor,i);

            if(a > 0){
                System.out.println(a);
            }
        }
    }
    public static int[] divisor(int n){

        int all_divisor[] = new int[n];

        for (int i = 1; i < all_divisor.length; i++) {
            if (n % i == 0) {
                all_divisor[i-1]=i;
            }
        }

        return all_divisor;
    }
    public static int abundent(int[] arr, int n){
        int sum = 0;
        int abundent_num = 0;
        int all_abundent[] = new int[10000];

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        if(sum > n && n%2 != 0){

           abundent_num = n;

        }

        return abundent_num;
    }
}
