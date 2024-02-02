package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            String content = ReadUrl.readUrl("https://ekstrabladet.dk/");

            WriteToFile.writeToFile("ekstrabladet.html", content);

            System.out.println("done");
        } catch (Exception err) {
            System.out.println("fejl: " + err.getMessage());
        }
    }
}