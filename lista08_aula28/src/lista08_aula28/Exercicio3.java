package lista08_aula28;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("a) 2^10: " + Math.pow(2, 10));
        System.out.println("b) raiz de 1000: " + String.format("%.4f", Math.sqrt(1000)));
        System.out.println("c) valor absoluto de -10: " + Math.abs(-10));
        System.out.println("d) valor máximo entre 42 e 666: " + Math.max(42, 666));
        System.out.println("e) valor mínimo entre 42 e 666: " + Math.min(42, 666));
        System.out.println("f) arredondar 4,9 pra cima: " + Math.ceil(4.9));
        System.out.println("g) arredondar 4,9 para baixo: " + Math.floor(4.9));
        System.out.println("h) calcular 'seno' 'cosseno' de 90 e a tangente de 45");
        System.out.println("  seno: " + Math.round(Math.sin(Math.toRadians(90))));
        System.out.println("  cosseno: " + Math.round(Math.cos(Math.toRadians(90))));
        System.out.println("  tangente: " + Math.round(Math.tan(Math.toRadians(45))));
    }
}