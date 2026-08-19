public class Caneta {
    //atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    //metodos
    public void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if (tampada == true) {
            System.out.println("ERRO! Não posso rabiscar! Caneta tampada!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
