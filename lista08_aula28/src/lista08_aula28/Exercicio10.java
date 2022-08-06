package lista08_aula28;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio10 {
    public static void main(String[] args) {
        // setar local US
        Locale.setDefault(Locale.US);
        String str1 = "123456";
        int num1 = Integer.parseInt(str1);
        System.out.println(NumberFormat.getCurrencyInstance().format(num1));

        Locale.setDefault(new Locale("pt", "BR"));
        String str2 = "789.01";
        double num2 = Double.parseDouble(str2);
        System.out.println(NumberFormat.getCurrencyInstance().format(num2));
    }
}
