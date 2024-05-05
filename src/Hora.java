import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    Scanner sc = new Scanner(System.in);
    private int hora;
    private int min;
    private int seg;
    
    public Hora() {
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Digite um valor para a(s) hora(s): ");
                int h = sc.nextInt();
                while (h < 0 || h > 23) {
                    System.out.print("Horas inválidas. Por favor, digite novamente: ");
                    h = sc.nextInt();
                }
                this.hora = h;
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.\n");
                sc.next();
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite um valor para o(s) minuto(s): ");
                int m = sc.nextInt();
                while (m < 0 || m > 59) {
                    System.out.print("Minutos inválidos. Por favor, digite novamente: ");
                    m = sc.nextInt();
                }
                this.min = m;
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Por favor, digite um número inteiro.\n");
                sc.next();
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite um valor para o(s) segundo(s): ");
                int s = sc.nextInt();
                while (s < 0 || s > 59) {
                    System.out.print("Segundos inválidos. Por favor, digite novamente: ");
                    s = sc.nextInt();
                }
                this.seg = s;
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.\n");
                sc.next();
            }
        }
    }
    
    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }
    
    public void setHor(int h) {
        this.hora = h;
    }
    
    public void setMin(int m) {
        this.min = m;
    }
    
    public void setSeg(int s) {
        this.seg = s;
    }
    
    public void setHor() {
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Digite um valor para a(s) hora(s): ");
                int h = sc.nextInt();
                this.hora = h;
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para a(s) hora(s).");
                sc.next();
            }
        }
    }

    public void setMin() {
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Digite um valor para o(s) minuto(s): ");
                int m = sc.nextInt();
                this.min = m;
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para o(s) minuto(s).");
                sc.next();
            }
        }
    }

    public void setSeg() {
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Digite um valor para o(s) segundo(s): ");
                int s = sc.nextInt();
                this.seg = s;
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para o(s) segundo(s).");
                sc.next();
            }
        }
    }
    
    public int getHor() {
        return this.hora;
    }
    
    public int getMin() {
        return this.min;
    }
    
    public int getSeg() {
        return this.seg;
    }
    
    public String getHora1() {
        if (this.seg >= 60) {
            this.min += this.seg / 60;
            this.seg %= 60;
        }
        if (this.min >= 60) {
            this.hora += this.min / 60;
            this.min %= 60;
        }
        if (this.hora >= 24) {
            this.hora %= 24;
        }
        return String.format("%02d", this.hora) + ":" + 
            String.format("%02d", this.min) + ":" + 
            String.format("%02d", this.seg);
    }
    
    public String getHora2() {
        int horaFormatada = this.hora;
        String periodo = "AM";
        if (horaFormatada >= 12) {
            periodo = "PM";
            if (horaFormatada > 12) {
                horaFormatada -= 12;
            }
        }
        return String.format("%02d", horaFormatada) + ":" + 
            String.format("%02d", this.min) + ":" + 
            String.format("%02d", this.seg) + " " + periodo;
    }
    
    public int getSegundos() {
        return (this.getHor() * 3600) + (this.getMin() * 60) + this.getSeg();
    }
}