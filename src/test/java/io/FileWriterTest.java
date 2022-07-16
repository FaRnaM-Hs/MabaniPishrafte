package io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {

    public static final String FILE_NAME = "text.txt";

    @Test
    void should_write_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             FileInputStream fileInputStream = new FileInputStream(FILE_NAME)) {

            fileOutputStream.write("Hello World".getBytes(StandardCharsets.UTF_8));

            int read;
            StringBuilder helloWord = new StringBuilder();
            while ((read = fileInputStream.read()) != -1) {
                helloWord.append((char) read);
            }

            Assertions.assertThat(helloWord.toString()).isEqualTo("Hello World");
        } catch (IOException e) {
            System.out.println("Unknown problem has occurred in text.txt!");
            e.printStackTrace();
        }
    }
}
