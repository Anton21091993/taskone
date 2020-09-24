package FirstTask_ByteOperations;

public class SecondTask {
    public static void main(String[] args) {
        Integer Reference1= -42;
        Integer Reference2= -15;

        /*Integer Result11 = Reference1 ~ Reference2;
        System.out.println(Result1.toBinaryString(Result1));*   no the possibility/*/

        Integer Result2 = Reference1 & Reference2;
        System.out.println(Result2.toBinaryString(Result2)); //11111111111111111111111111010000

        Integer Result3 = Reference1 &= Reference2;
        System.out.println(Result3.toBinaryString(Result3)); //11111111111111111111111111010000


        Integer Result4 = Reference1 | Reference2;
        System.out.println(Result4.toBinaryString(Result4)); //11111111111111111111111111110001

        Integer Result5 = Reference1 |= Reference2;
        System.out.println(Result5.toBinaryString(Result5)); //11111111111111111111111111110001

        Integer Result6 = Reference1 ^ Reference2;
        System.out.println(Result6.toBinaryString(Result6)); //0

        Integer Result7 = Reference1 ^= Reference2;
        System.out.println(Result7.toBinaryString(Result7)); //0

        Integer Result8 = Reference1 >> Reference2;
        System.out.println(Result8.toBinaryString(Result8)); //0

        Integer Result9 = Reference1 >>= Reference2;
        System.out.println(Result9.toBinaryString(Result9)); //0

        Integer Result10 = Reference1 >>> Reference2;
        System.out.println(Result10.toBinaryString(Result10)); //0


        Integer Result11 = Reference1 << Reference2;
        System.out.println(Result11.toBinaryString(Result11)); //0

        Integer Result12 = Reference1 <<= Reference2;
        System.out.println(Result12.toBinaryString(Result12)); //0

        Integer Result13 = Reference1 >>>= Reference2;
        System.out.println(Result13.toBinaryString(Result13));








    }


}
