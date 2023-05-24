package ch09;

public class TryCatch2Demo {
    public static void main(String[] args) {
        int dividend = 10;
        try {
            int divisor = Integer.parseInt(args[0]);
            System.out.println(dividend / divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("원소 존재 x");
        } catch (NumberFormatException e) {
            System.out.println("숫자 x");
        } catch (ArithmeticException e) {
            System.out.println("0 나누기 x");
        } finally {
            System.out.println("항상");
        }
        System.out.println("끝");
    }
}
