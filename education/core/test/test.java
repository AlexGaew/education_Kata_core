package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Class;
import Cordinates.Map;
import org.jetbrains.annotations.NotNull;

public class test {
    public static void main(String[] args) {
//        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Генерал"};
//        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие:" +
//                " к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
//                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
//                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
//                };
//        test t = new test();
//        test.printTextPerRole(roles, textLines);
//        Operations po = Operations.SUM;
//        po.action(2, 4);
       // System.out.println(isPalindrome("Eva, Can I Stab Bats In A Cave?"));
        int [] a = {1,3,5,6,9,11,24};
        getSubArrayBetween( a,4,10);


    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        List<Integer> list = new ArrayList<>();
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= start && numbers[i] <= end) {
                    list.add(numbers[i]);
                }
            }
            if (!list.isEmpty()) {
                int[] rez = new int[list.size()];
                for (int i = 0; i < rez.length; i++) {
                    rez[i] = list.get(i);
                }
                return rez;
            }
        }
        return new int[0];

    }







//        public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
//        StringBuilder b = new StringBuilder();
//        List<Integer> list = new ArrayList<>();
//        if (numbers.length > 1) {
//            for (int i = 0; i < numbers.length; i++) {
//                if (numbers[i] >= start && numbers[i] <= end) {
//
//                    b.append(numbers[i]);
//                    if (numbers[i] != end) {
//                        b.append(",");
//                    }
//                }
//            }
//            String a = b.toString();
//            if (!a.isEmpty()) {
//                String[] f = a.split(",");
//                int[] rez = new int[f.length];
//                for (int i = 0; i < rez.length; i++) {
//                    rez[i] = Integer.parseInt(f[i]);
//
//                }
//                return rez;
//            }
//        }
//        return new int[0];
//
//    }

    public static boolean isPalindrome(String text) {

        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return (text.contentEquals(sb));

    }



    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sbRoles = new StringBuilder();
        for (String role : roles) {
            sbRoles.append(role).append(":").append('\n');
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role + ":")) {
                    sbRoles.append(j + 1).append(")").append(textLines[j].substring(role.length() + 1)).append('\n');
                }

                if (j == textLines.length - 1) {
                    sbRoles.append('\n');

                }
            }

        }
        String sb = sbRoles.toString();
        System.out.println(sb);
        return sb;
    }




}

//        for (int i = 0; i < roles.length; i++) {
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].startsWith(roles[i])) {
//                    sbText.append(j + 1).append(") ").append(textLines[j].replace(roles[i] + ":", "")).append('\n');
//                }
//                if (j == textLines.length - 1) {
//                    sbText.insert(sbText.length(), roles[i]).append("\n");
//
//                    sbText.append('\n');
//                }
//            }
//        }
//        String s = sbText.toString();
//        for (int i = 0; i < roles.length; i++) {
//            s = s.concat(roles[i] + " ");
//        }
//        System.out.println(sbText);


//Твой код здесь

//[3,5,20,8,7,3,100]


//    public static boolean regulyarVirag(String email) {
//        return Pattern.matches("^[a-zA-Z0-9._%+-]+@outlook.com$", email) || Pattern.matches("^[a-zA-Z0-9._%+-]+@gmail.com$", email);
//    }
//    import java.util.regex.*;
//
//    public class EmailValidator {
//
//        public static boolean isValid(String email) {
//            return email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$");
//        }
//
//        public static void main(String[] args) {
//            String testEmail = "user@example.com";
//            System.out.println("Valid: " + isValid(testEmail));
//        }
//    }

//
//
//    public static boolean isPalindrome(String text) {
//        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
//        char[] chars = text.toCharArray();
//        char[] chars1 = new char[text.length()];
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == chars[text.length() - 1 - i]) {
//                chars1[i] = chars[text.length() - 1 - i];
//            }
//        }
//        String string = new String(chars1);
//        return text.equals(string);
//    }


//    public void parseAndPrintNumber(String str) {
//        int xz = Integer.parseInt(str);
//        System.out.println(xz/2);
//
//    }


//    public static void printOddNumbers(int @NotNull [] arr) {
//        StringBuilder builder = new StringBuilder();
//        if(arr.length == 0) {
//            System.out.println("Arrays = 0");
//        } else {
//            for (int j : arr) {
//                if (j % 2 != 0) {
//                    builder.append(",").append(j);
//                }
//            }
//            System.out.println(builder.delete(0,1));
//
//        }
//    }


//    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
//        int[] result = new int[firstArray.length + secondArray.length];
//        int count = 0;
//        for (int i = 0; i < firstArray.length; i++) {
//            result[i] = firstArray[i];
//            count += 1;
//        }
//        for (int j = 0; j < secondArray.length; j++) {
//            result[count + j] = secondArray[j];
//        }
//        Arrays.sort(result);
//        return result;
//
//        //Твой код тут
//    }


//    public static int[] getArrayMiddle(int[] numbers) {
//        if (numbers == null || numbers.length < 2) {
//            return numbers;
//        } else {
//            if (numbers.length % 2 == 0) {
//                int[] middleArray = new int[2];
//                int middle = numbers.length / 2;
//                middleArray = Arrays.copyOfRange(numbers, middle - 1, middle + 1);
//                return middleArray;
//            } else {
//                int middle = (numbers.length - 1) / 2;
//                int[] middleArray = new int[1];
//                middleArray = Arrays.copyOfRange(numbers, middle, middle + 1);
//                return middleArray;
//
//            }
//        }
//
//    }

//}


//    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
//        int[] mergedArray = new int[firstArray.length + secondArray.length];
//        int count = 0;
//        for (int i = 0; i < firstArray.length; i++) {
//            mergedArray[i] = firstArray[i];
//            count += 1;
//        }
//        for (int j = 0; j < secondArray.length; j++) {
//            mergedArray[count + j] = secondArray[j];
//        }
//        int buffer = 0;
//        for (int i = 0; i < mergedArray.length; i++) {
//            for (int j = 0; j < mergedArray.length - 1; j++) {
//                if (mergedArray[j] >= mergedArray[j + 1]) {
//                    buffer = mergedArray[j];
//                    mergedArray[j] = mergedArray[j + 1];
//                    mergedArray[j + 1] = buffer;
//                }
//            }
//        }
//        return mergedArray;   //твой код тут
//    }
//}


//    public static int[] inverseArray(int[] numbers) {
//        int[] result = new int[numbers.length];
//        if (numbers.length != 0) {
//            for (int i = numbers.length - 1; i >= 0; i--) {
//                result[(numbers.length-1) - i] = numbers[i];
//            }
//
//        }
//        return result;
//    }


//твой код тут


//    public static int[] getArrayMiddle(int[] numbers) {
//        int[] chetArray = new int[2];
//        int[] neChetArray = new int[1];
//        if (numbers.length != 0) {
//            if (numbers.length % 2 == 0) {
//                if (numbers.length == 2) {
//                    return numbers;
//                }
//                int middleIndex = numbers.length / 2;
//                chetArray[0] = numbers[middleIndex - 1];
//                chetArray[1] = numbers[middleIndex];
//
//            } else {
//                if (numbers.length == 1) {
//                    return numbers;
//                }
//                int middleIndex = (numbers.length - 1) / 2;
//                neChetArray[0] = numbers[middleIndex];
//
//                return neChetArray;
//            }
//            return chetArray;
//        }
//        return new int[0];
//
//    }


//твой код тут


//    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
//        StringBuilder b = new StringBuilder();
//        if (numbers.length > 1) {
//            for (int i = 0; i < numbers.length; i++) {
//                if (numbers[i] >= start && numbers[i] <= end) {
//
//                    b.append(numbers[i]);
//                    if (numbers[i] != end) {
//                        b.append(",");
//                    }
//                }
//            }
//            String a = b.toString();
//            if (!a.isEmpty()) {
//                String[] f = a.split(",");
//                int[] rez = new int[f.length];
//                for (int i = 0; i < rez.length; i++) {
//                    rez[i] = Integer.parseInt(f[i]);
//
//                }
//                return rez;
//            }
//        }
//        return new int[0];
//
//    }
//}


// "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday".

//    public static void printArray(int[] numbers) {
//        StringBuilder b = new StringBuilder();
//        if (numbers.length == 0) {
//            b.append('[');
//            b.append(']');
//        } else {
//
//
//            b.append('[');
//            for (int i = 0; ; i++) {
//                b.append(numbers[i]);
//                if (i == numbers.length - 1) {
//                    b.append(']');
//                    break;
//                }
//                b.append(", ");
//            }
//
//        }
//        System.out.println(b);
//    }


//Твой код здесь


//    public static int factorial(int value) {
//        int x = 1;
//        int buffer = 1;
//        for (int i = 1; i <= value; i++) {
//            x = x * i;
//            buffer = buffer * x;
//
//        }
//        return buffer;
//
//
//    }





