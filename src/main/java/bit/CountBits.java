package bit;

//count number of bits in a number

public class CountBits {

    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        while(num > 0) {
            count++;
            num = num >> 1;
            System.out.println(num);
        }
        System.out.println("answer is " + count);

    }

}
