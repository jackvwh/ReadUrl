package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {
    public static void writeToFile(String fileName, String content) {
        // write to file

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
