public class TestHora {
    public static void main(String[] args) {
        // Utilizando construtor Hora() sem parametros
        Hora h1 = new Hora();
        System.out.println("Horas: " + h1.getHor());
        System.out.println("Minutos: " + h1.getMin());
        System.out.println("Segundos: " + h1.getSeg());
        System.out.println("Hora 1: " + h1.getHora1());
        System.out.println("Hora 2: " + h1.getHora2());
        System.out.println("Total segundos: " + h1.getSegundos());
        System.out.println();

        // Utilizando construtor Hora() com parametros
        Hora h2 = new Hora(15, 25, 42);
        System.out.println("Horas: " + h2.getHor());
        System.out.println("Minutos: " + h2.getMin());
        System.out.println("Segundos: " + h2.getSeg());
        System.out.println("Hora 1: " + h2.getHora1());
        System.out.println("Hora 2: " + h2.getHora2());
        System.out.println("Total segundos: " + h2.getSegundos());
        System.out.println();

        // Utilizando metodo set() sem parametros
        h2.setHor();
        h2.setMin();
        h2.setSeg();
        System.out.println("Horas: " + h2.getHor());
        System.out.println("Minutos: " + h2.getMin());
        System.out.println("Segundos: " + h2.getSeg());
        System.out.println("Hora 1: " + h2.getHora1());
        System.out.println("Hora 2: " + h2.getHora2());
        System.out.println("Total segundos: " + h2.getSegundos());
        System.out.println();

        // Utilizando metodo set() com parametros
        h2.setHor(20);
        h2.setMin(15);
        h2.setSeg(36);
        System.out.println("Horas: " + h2.getHor());
        System.out.println("Minutos: " + h2.getMin());
        System.out.println("Segundos: " + h2.getSeg());
        System.out.println("Hora 1: " + h2.getHora1());
        System.out.println("Hora 2: " + h2.getHora2());
        System.out.println("Total segundos: " + h2.getSegundos());
    }
}