package classesabstratas;


public abstract class Professor {
    
    private String nome;
    private double salario;
    
    public Professor(String n, double s) {
        this.setNomeP(n);
        this.setSalario(s);
    }
    
    public void setNomeP(String n) {
        this.nome = n;
    }
    public String getNomeP() {
        return this.nome;
    }
    
    public void setSalario(double s){
        this.salario = s;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public abstract double calcularSalarioLiquido();
}
