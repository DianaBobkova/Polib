package polibii;

import polibii.Description;
import polibii.Encryption;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter printWriterPol = new PrintWriter(new File("outputPol.txt"));
        String peremen = in.nextLine();
        polibii.Encryption enc = new polibii.Encryption(peremen);

        String encri = enc.getEncText();
        printWriterPol.println("Encrypt: "+ encri);

        Description desc = new Description(encri);
        printWriterPol.println("Descript: "+desc.getDescText());
        printWriterPol.flush();
    }
}
