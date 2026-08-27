public class CanetaGetSet {

    //Atributos
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //Metodos - Getters e Setters
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String model){
        this.modelo = model;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float pont){
        this.ponta = pont;
    }

    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean tamp){
        this.tampada = tamp;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    //Metodos - Tampar | Destampar
    public void tampar(){
        this.setTampada(true);
    }
    public void destampar(){
        this.setTampada(false);
    }

    //Metodo - Mostrar o estado atual da minha Caneta
    public void status(){
        System.out.println("-----------------------------------------------");
        System.out.println("Sobre a caneta - Só Get e Set sem construtor!!!");
        System.out.println("-----------------------------------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println("Cor: " + this.getCor());
    }
}
