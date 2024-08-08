package Seminar2.cw4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Задание 4.
 * Напишите метод, который составит строку, состоящую из 100
 * повторений слова TEST и метод, который запишет эту строку в
 * простой текстовый файл, обработайте исключения.
 */

public class Ex4 {

    private static final Logger logger = Logger.getLogger(Ex4.class.getName());

    public static void main(String[] args) throws IOException {
    String str = "TEST\n".repeat(100);
    writeFile(str, "index.txt");

    }
    public static void writeFile (String args, String fileName) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))  {
            bw.write(args);
            System.out.println("File writing to " + fileName);
            throw new IOException();

        } catch (IOException e) {
            FileHandler fh  = new FileHandler("error.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            logger.log(Level.WARNING,"Error writing to file");
            System.out.println("Error writing to file: " + fileName);
        }

    }
}
