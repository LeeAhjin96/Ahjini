package ch09;

public class TryCatch1Demo {
    public static void main(String[] args) {

        int[] array = {0, 1, 2};
        try {
            System.out.println("Last => " + array[3]);
            System.out.println("First =>" + array[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not Exist");
        }
        System.out.println("OMG");
    }
}
