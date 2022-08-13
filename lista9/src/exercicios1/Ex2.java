package exercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = null;
        try {
            File arquivo = new File("c:\\temp\\arquivo.txt");
            scan = new Scanner(arquivo);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado ou inexistente.");
            System.out.println(e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
