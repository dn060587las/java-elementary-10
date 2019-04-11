package org.demo;

import java.io.*;

public class InputOutputDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Pedagog\\coffeelint.json");

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getName());

        InputStream is = new FileInputStream(file);
        int readByte;
        byte buffer [] = new byte[100 * 1024];
        try {
            while ((is.read(buffer)) != -1) {
                for (byte byteVal : buffer) {
                    System.out.println(" " + (char) byteVal);
                }
            }
        } finally {
            is.close();
        }

        File file2 = new File("C:\\Users\\Pedagog\\test.txt");
        Writer writer = new FileWriter(file2, true);
        writer.write("\ntest");
        writer.close();
    }

    public static void printDirectoryContent(File directory) throws Exception {
        if (!directory.exists() || !directory.isDirectory()) {
            throw new Exception("File  does not exists or is not directory");
        }
        System.out.println("Name of current folder " + directory.getName());
        for (File file : directory.listFiles()) {
            System.out.println("File name is " + file.getName());
        }
    }

}
