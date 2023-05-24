package ch09;
// TryCatch1Demo 한번 더 해보기
public class TryCatch5Demo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        try {
            System.out.println("Last" + array[3]);
            System.out.println("First" + array[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hoo");
        }
        System.out.println("ha");
    }
}
