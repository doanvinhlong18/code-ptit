import java.util.Scanner;
public class uocsonguyentolonnhat {
    public static long tong_uoc(long n){
        long tong_uoc=0;
        for(int i=2; i<=Math.sqrt(n); i++){
            while(n%i==0){
                tong_uoc=i;
                n/=i;
            }
        }
        if(n!=1) tong_uoc=n;
        return tong_uoc;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            System.out.println(tong_uoc(n));
        }
    }
}
