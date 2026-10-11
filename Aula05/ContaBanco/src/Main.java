//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(001, "cc", "Bruno");
        c1.setSaldo(200);
        c1.pagarMensal();
        c1.setStatus(true);
        c1.pagarMensal();
        System.out.println(c1.getStatus());
        System.out.println(c1.getSaldo());
    }
}