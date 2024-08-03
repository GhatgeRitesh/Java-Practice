package String_Problems;

public class countBitChangedtoMakeNtoKinbianry {
    public static void main(String[] args) {
        System.out.println("proram to count no. of bits changed to covert the number n to k in binary");
        int n=14; int k=13;
        count(n,k);
    }
    public static void count(int n,int k){
        if(n==k){
            System.out.println("0");
            return;
        }
        String bn=Integer.toBinaryString(n);
        String bk=Integer.toBinaryString(k);
        if(bn.length()<bk.length()){
            System.out.println("-1");
            return;
        }
        int i=bn.length()-1;
        int j=bk.length()-1;
        int count=0;
        while(i>=0 && j>0)
        {
            char cn=bn.charAt(i);char ck=bk.charAt(j);
            if(cn!=ck) {
                if (cn == '1') {
                    count++;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        while(i>=0)
        {
            count+=(bn.charAt(i--)=='1'?1:0);
        }
        System.out.println(count);
    }
}
