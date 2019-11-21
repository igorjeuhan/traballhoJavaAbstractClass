package classesabstratas;


public class ProfessorIntegral extends Professor {
    
    public ProfessorIntegral (String n, double s) {
        super(n, s);
    }
    
    @Override
    public double calcularSalarioLiquido() {
        return this.getSalario() - (this.getSalario() * 11 / 100);
    }
}
