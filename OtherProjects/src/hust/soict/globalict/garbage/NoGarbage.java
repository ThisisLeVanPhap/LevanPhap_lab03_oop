package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filePath = "test.txt"; // Đường dẫn đến tệp lớn
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            String content = new String(bytes);

            StringBuilder result = new StringBuilder();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                result.append(content);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}