package junseok.oh;

public class Main {

    private static volatile int a = 0;
    private static Integer[] b = new Integer[9999];

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) b[i] = 0;
        final long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
