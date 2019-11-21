package classesabstratas;


public class TestaProfessores {
    
    public static void main(String[] args) {
        
        ProfessorIntegral pI1 = new ProfessorIntegral("Igor", 1200.00);
        ProfessorHorista pH1 = new ProfessorHorista("Jaum", 50.00, 8);
        
        System.out.println("Salário Líquido Professor Integral: " + pI1.calcularSalarioLiquido());
        System.out.println("Salário Líquido Professor Horista: " + pH1.calcularSalarioLiquido());
    }
}
