public class TestHora {
    public static void main(String[] args) {
        Hora h1 = new Hora();
        h1.setHor();
        h1.setMin();
        h1.setSeg();
        System.out.println("Horas: " + h1.getHor());
        System.out.println("Minutos: " + h1.getMin());
        System.out.println("Segundos: " + h1.getSeg());
        System.out.println("Hora 1: " + h1.getHora1());
        System.out.println("Hora 2: " + h1.getHora2());
        System.out.println("Total segundos: " + h1.getSegundos());
        
        Hora h2 = new Hora(15, 25, 60);
        System.out.println("Horas: " + h2.getHor());
        System.out.println("Minutos: " + h2.getMin());
        System.out.println("Segundos: " + h2.getSeg());
        System.out.println("Hora 1: " + h2.getHora1());
        System.out.println("Hora 2: " + h2.getHora2());
        System.out.println("Total segundos: " + h2.getSegundos());
    }
}