package ru.stepup.payments.mobile.pay;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int counter = 0;


        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean isDirectory = file.isDirectory();
            boolean fileExists = file.exists();
            if ((fileExists) && (isDirectory) ) {
                System.out.println("Путь указан верно");

                counter = counter + 1;
                System.out.println("Это файл номер " + counter);
            } else {
                System.out.println("Путь указан не верно");
                break;
            }
        }
    }

}
