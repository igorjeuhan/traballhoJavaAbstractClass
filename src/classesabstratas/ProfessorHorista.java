package classesabstratas;

public class ProfessorHorista extends Professor {
    
    public ProfessorHorista (String n, double s, double h) {
        super(n, s);
        this.setNomeP(n);
        this.setSalario(s);
        this.setHoras(h);
    }
    
    double horasTrab;
    
    public void setHoras(double h) {
        this.horasTrab = h;
    }
    
    public double getHoras() {
        return this.horasTrab;
    }
    
    public double calcularSalarioLiquido() {
        return ((this.getSalario() * this.horasTrab) - (this.getSalario() * 5 / 100));
    }
}
