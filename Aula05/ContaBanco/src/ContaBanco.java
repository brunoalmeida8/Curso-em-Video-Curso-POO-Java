public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //construtor
    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //get e set
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //metodos

    public void abrirConta(String tipo) {
        if (this.status == true) {
            System.out.println("Conta já é aberta");
            return;
        }
        setTipo(tipo);
        setStatus(true);
        if (this.tipo.equalsIgnoreCase("CC")) {
            this.saldo = 50;
        } else if (this.tipo.equalsIgnoreCase("CP")) {
            setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("\nPrimeiro zere o saldo da conta\nSaldo atual: " + this.saldo);
        } else if (this.saldo < 0){
            System.out.println("\nConta em debito");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(double valor) {
        if (this.status == false) {
            System.out.println("\nConta com status false");
        } else if (valor < 0) {
            System.out.println("\nFavor infomar valor de saldo maior que zero (0)");
        } else {
            setSaldo(getSaldo() - valor);//this.saldo += valor;
        }
    }


    public void sacar(double valor) {
        if (this.status == false) {
            System.out.println("\nConta com status false");
        } else if (valor < this.saldo) {
            System.out.println("\nSaldo indisponivel.\nSaldo atual: " + this.saldo);
        } else {
            this.saldo -= valor;
        }
    }

    public void pagarMensal() {
        if (this.status == false) {
            System.out.println("\nConta com status false");
        } else if (this.tipo.equalsIgnoreCase("CC")) {
            this.saldo -= 12;
        } else if (this.tipo.equalsIgnoreCase("CP")) {
            this.saldo -= 20;
        }
    }
}
