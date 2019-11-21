package classesabstratas;

public class TestaProduto {
    
    public static void main(String[] args) {
        
        Motor motor1 = new Motor("001", "Motor V12", "Motor de carro de alta potência", 19000.00, 725, 6000);
        Parafuso parafuso1 = new Parafuso("002", "Parafuso abaulado", "Parafuso de avião", 0.5, 2.5, 1.5);
        
        motor1.calcularPrecoFinal();
        System.out.println(motor1.imprimirDados());
        
        parafuso1.calcularPrecoFinal();
        System.out.println(parafuso1.imprimirDados());
        
        
    }
}
