package Input_Output;

import java.io.*;

import java.math.BigInteger;
import java.nio.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
//        Animal animal1 = new Animal("Shahlik");
//        Animal animal2 = new Animal("Pes");
//        Animal animal3 = new Animal("Volk");
//        Animal animal4 = new Animal("Shar");
//        Animal animal5 = new Animal("Shar");
//        Animal animal6 = new Animal("Shar");
//        Animal animal7 = new Animal("Shar");
//        Animal animal8 = new Animal("Shar");
//        Animal[] animals = {animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8};
//
//        byte[] b = serializeAnimalArray(animals);
//        deserializeAnimalArray(b);
//        for (Animal animal : animals) {
//            System.out.println(animal.toString());
//        }

        Circle circle = new Circle(5, 5, 10);
        circle.draw();


    }

    public static byte[] serializeAnimalArray(Animal[] animals) {

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeInt(2);
            oos.writeObject(animals);
            for (Animal animal : animals) {
                oos.writeObject(animal);
                StringBuilder stringBuilder = new StringBuilder();

            }
            return bos.toByteArray();

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
        return null;

    }


    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(data); ObjectInputStream outputStream = new ObjectInputStream(bis)) {
            int size = outputStream.readInt();
            if (size < 0) {
                throw new IllegalArgumentException("размер массива отрицательный");
            }
            Animal[] animals = new Animal[size];

            for (int i = 0; i < size; i++) {
                Object objects = outputStream.readObject();
                if (! (objects instanceof Animal)) {
                    throw new IllegalArgumentException("Это не животное");
                }

                animals [i] = (Animal) objects;
            }
            return animals;

        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            throw new IllegalArgumentException("массив не десериализован");

        }

    }

    public static Animal[] deserializeAnimalArray1(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {

            int size = ois.readInt();

            if (size < 0) {
                throw new IllegalArgumentException("размер массива отрицательный");
            }
            Animal [] animals = new Animal[size];

            for (int i = 0; i < size; i++) {
                Object obj = ois.readObject();
                if (! (obj instanceof  Animal)) {
                    throw new IllegalArgumentException("это не животное");
                }
                animals [i] = (Animal) obj;
            }
            return animals;

        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            throw new IllegalArgumentException("массив не десериализован");
        }
    }


}


//// Работа сосканером
//Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//
//double x = 0;
//        while (scanner.hasNext()) {
//
//        if (scanner.hasNextDouble()) {
//x += Double.parseDouble(scanner.next());
//
//        } else {
//        scanner.next();
//            }
//                    }
//                    System.out.printf("%.6f", x);
//        scanner.close();


//        double x = 0.0;
//        String reg = "^(?:[-+0-9]\\d*|0)?(?:\\.\\d+)?$";
//        Pattern pattern = Pattern.compile(reg);
//        Matcher matcher;
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n\n,");
//        String line = scanner.next();
//        scanner.close();
//        Scanner sc = new Scanner(line);
//
//
//        while (sc.hasNext()) {
//                String s = sc.next();
//                matcher = pattern.matcher(String.valueOf(s));
//                if (matcher.find()) {
//                    x += Double.parseDouble(matcher.group());
//                }
//        }
//        System.out.printf("%.6f", x);




