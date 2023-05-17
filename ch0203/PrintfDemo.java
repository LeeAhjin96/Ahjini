package ch0203;

public class PrintfDemo {
    public static void main(String[] args) {
        int i = 97;
        String s = "Java";
        double f = 3.14f;
        System.out.printf("%d\n", i);
        System.out.printf("%o\n", i);
        System.out.printf("%x\n", i);
        System.out.printf("%c\n", i);
        System.out.printf("%5d\n", i);
        System.out.printf("%05d\n", i);
        System.out.printf("%-5s\n", i);
    }
}
