/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Hora {
    //Atributos
    private int hora;
    private int minuto;
    private int segundo;
    
    //Métodos construtores
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Setters
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Deve estar entre 0 e 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido. Deve estar entre 0 e 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido. Deve estar entre 0 e 59.");
        }
    }

    public void setHora() {
        this.hora = 0;
    }

    public void setMinuto() {
        this.minuto = 0;
    }

    public void setSegundo() {
        this.segundo = 0;
    }

    //Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Métodos
    public String getHora1() {
        return "";
    }

    public String getHora2() {
        return "";
    }

    public int getSegundos() {
        return 0;
    }
}
