package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadUrl {

    public static String readUrl(String s) {
        StringBuilder sb = new StringBuilder();
        try {
            URL urlEB = new URL(s);

            BufferedReader in = new BufferedReader(new InputStreamReader(urlEB.openStream()));

            String inputLine = "";

            while  (inputLine != null){
                sb.append(inputLine);
                inputLine = in.readLine();
            }

        } catch (Exception err) {
            System.out.println("fejl: " + err.getMessage());
        }
        return sb.toString();
    }

}

