package oop;


import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;


    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }


    @Override // 0, 5
    public CharSequence subSequence(int start, int end) {
        byte[] chars = new byte[end - start];
        for (int i = 0; i < end - start; i++) {
            chars[i] = bytes[i];
        }

        return new AsciiCharSequence(chars);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (byte b : bytes) {
            char ch = (char) b;
            str.append(ch);
        }
        String s = str.toString();
        return s;
    }
}
