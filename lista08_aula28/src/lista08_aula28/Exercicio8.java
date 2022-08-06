package lista08_aula28;

public class Exercicio8 {
    public static void main(String[] args) {
        int num1 = 11;
        float num2 = 22.22f;
        double num3 = 33.33;

        Integer w1 = Integer.valueOf(num1);
        Float w2 = Float.valueOf(num2);
        Double w3 = Double.valueOf(num3);

        System.out.println("Integer: " + w1);
        System.out.println("Float: " + w2);
        System.out.println("Double: " + w3);
    }
}
