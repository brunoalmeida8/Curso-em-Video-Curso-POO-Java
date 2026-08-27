//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Usando Getters e Setters sem construtor
        CanetaGetSet caneta1 = new CanetaGetSet();
        caneta1.setModelo("Bic");
        caneta1.setPonta(2.0f);
        caneta1.setTampada(false);
        caneta1.setCor("Preta");
        caneta1.tampar();
        caneta1.status();

        //Usando Construtor
        CanetaConstrutor c2 = new CanetaConstrutor("Tera", 1.5f, true, "Azul");
        c2.destampar();
        c2.status();
    }
}