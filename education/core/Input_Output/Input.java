package Input_Output;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * способ закрытия файла (1. Традиционный).
 * способ закрытия файла (2. с использованием конструкции try-with-resources.).
 */

public class Input {

    public static void main(String[] args) throws IOException {

        byte[] original = {48, 49, 50, 51};
        OutputStream output = new FileOutputStream("src/Input_Output/input.txt");
        InputStream inputStream = new ByteArrayInputStream(original);
        //Input.print(inputStream, output);
        Charset charset = Charset.forName("ASCII");
        System.out.println(readAsString(inputStream, charset));


//   1
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C://SomeDir//notes.txt");

            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {

            try {

                if (fin != null)
                    fin.close();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }

    // 2 способ с использованием конструкции try-with-resources.
    public void vtoroySposobZacritijaFila() {
        try (FileInputStream fin = new FileInputStream("C://SomeDir//notes.txt");
             FileOutputStream fos = new FileOutputStream("C://SomeDir//Hello2.txt")) // пример использования несколько потоков,
        // которые после выполнения нужно закрыть
        {
            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        while (inputStream.available() > 0) {
            sum += (byte) inputStream.read();
        }
        inputStream.close();
        return sum;


        //твой код здесь
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int a = 0;
        while (inputStream.available() > 0) {
            a = inputStream.read();
            if (a % 2 == 0) {
                outputStream.write((" " + a).getBytes());
            }
        }
        outputStream.flush();
        inputStream.close();

        //твой код здесь
    }


    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String s = null;
        while (inputStream.available() > 0) {
            s = new String(inputStream.readAllBytes(), charset);
        }
        inputStream.close();

        return s;
    }




}





























