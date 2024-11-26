package hust.soict.globalict.garbage;

public class ConcatenationInLoops {
    private static final int ITERATIONS = 100_000;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}