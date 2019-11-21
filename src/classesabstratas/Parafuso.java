package classesabstratas;

public class Parafuso extends Produto {
    
    public Parafuso(String c, String n, String d, double p, double cp, double diam) {
        super(c, n, d, p);
        this.setComp(cp);
        this.setDiam(diam);
    }
    
    private double comprimento;
    private double diametro;
    
    public void setComp(double cp) {
        this.comprimento = cp;
    }
    
    public double getComp(){
        return this.comprimento;
    }
    
    public void setDiam(double diam) {
        this.diametro = diam;
    }
    
    public double getDiam() {
        return this.diametro;
    }
    
    @Override
    public double calcularPrecoFinal(){
        return this.getPreco() + (this.getPreco() * 15 / 100);
    }
    
    @Override
    public String imprimirDados(){
        
        return "Codigo: " + this.getCod() + "\n" + 
        "Nome: " + this.getNome() + 
                "\n" + "Descricao: " + this.getDesc() +
                "Preço: R$" + this.getPreco() +
                "\n" + "Comprimento: " + this.getComp() +
                "\n" + "Diamentro: " + this.getDiam() + "\n";
    }
}
