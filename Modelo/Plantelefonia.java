package Modelo;

public class Plantelefonia{

    // ------------------
    // Atributos
    // ------------------
    private long numero;
    private String operador;
    private int minuto;
    private double costoMinuto;

    // ------------------
    // Métodos
    // ------------------

    //Constructor por defecto
    public Plantelefonia(){
        numero = 1;
        operador = " ";
        minuto = 1;
        costoMinuto = 1;
    }

    // Constructor común
    public Plantelefonia(long num, String op, int min, double costmin){
        this.numero = num;
        this.operador = op;
        this.minuto = min;
        this.costoMinuto = costmin;
    }

    // Constructor copia
    public Plantelefonia(Plantelefonia p){
        numero = p.numero;
        operador = p.operador;
        minuto = p.minuto;
    }

    // Métodos de acceso
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public String toString(){
        return numero + "/" + calcularPlan();
    }

    // Calcular precio del plan
    public Double calcularPlan(){
        double x = costoMinuto*minuto;
        if(operador.equals("Movilujo")){
            x = x - x*0.5;
        }
        return x;
    }

    // Método ejecutable
    public static void main(String[] args) {
        
        Plantelefonia p1 = new Plantelefonia(0, " ", 0, 0);
        System.out.println("Plan por defecto " + p1);
        Plantelefonia p2 = new Plantelefonia(3228971634l, "Movilujo", 200,300);
        System.out.println("Plan de movilujo "+ p2);
        Plantelefonia p3 = new Plantelefonia(p2);
        System.out.println("Plan copia " + p3);
    }
}