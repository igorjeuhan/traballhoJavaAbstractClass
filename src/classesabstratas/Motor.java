package classesabstratas;

public class Motor extends Produto {
    
    public Motor (String c, String n, String d, double p, double pt, double rpm) {
        super(c, n, d, p);
        this.setPotencia(pt);
        this.setRpm(rpm);
    }
            
    private double potencia;
    private double rpm;
    
    public void setPotencia(double pt) {
        this.potencia = pt;
    }
    
    public double getPotencia() {
        return this.potencia;
    }
    
    public void setRpm(double rpm){
        this.rpm = rpm;
    }
    
    public double getRpm(){
        return this.rpm;
    }
    
    @Override
    public double calcularPrecoFinal(){
        return this.getPreco() - (this.getPreco() * 5 / 100);
    }
    
    @Override
    public String imprimirDados(){
        
        return "Codigo: " + this.getCod() + "\n" + 
        "Nome: " + this.getNome() + 
                "\n" + "Descricao: " + this.getDesc() +
                "\n" + "Preço: R$" + this.getPreco() +
                "\n" + "Potência: " + this.getPotencia() +
                "\n" + "Rpm: " + this.getRpm() + "\n";
    }
}
