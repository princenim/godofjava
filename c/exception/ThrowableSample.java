package c.exception;

/**
 * @author hazel
 */
public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample throwableSample = new ThrowableSample();
        throwableSample.throwable();

    }

    public void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t) { //throwable
            System.out.println(t.getMessage()); //null
            System.out.println(t.toString());
            t.printStackTrace(); //상세한 에러를 보여줌.

        }
    }
}
