package polibii;

import java.io.*;
import java.util.Scanner;


public class Main {
    protected static char[][] key = new char[9][10];

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        Scanner keyScanner = new Scanner(new File("key.txt"));
        for (int i = 0; i < 9; i++) {
            String line = keyScanner.nextLine();
            String[] split = line.split(" ");
            for (int j = 0; j < 10; j++) {
                if (split[j].length() > 0) {
                    key[i][j] = split[j].charAt(0);
                } else {
                    key[i][j] = ' ';
                }
            }
        }
        PrintWriter printWriterPol = new PrintWriter(new File("outputPol.txt"));
        String peremen = in.nextLine();
        Encryption enc = new polibii.Encryption(peremen);

        String encri = enc.getEncText();
        printWriterPol.println("Encrypt: " + encri);

        Description desc = new Description(encri);
        printWriterPol.println("Descript: " + desc.getDescText());
        printWriterPol.flush();
    }
}
