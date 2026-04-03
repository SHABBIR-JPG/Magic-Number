package shabbir.com;

public class SetBits {
    static void main(String[] args) {
        int n=4528;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count=0;
        while (n>0){
            n=n&(n-1);
            count++;
        }
        return count;

    }
}
