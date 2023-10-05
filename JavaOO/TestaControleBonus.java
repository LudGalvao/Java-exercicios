package JavaOO;

public class TestaControleBonus {
    public static void main(String[] args) {
        ControleBonus controle = new ControleBonus();

        Funcionario f1 = new Caixa();
        f1.setSalario(1000);
        controle.setTotalBonus(f1);
        System.out.println("Total de bônus pagos até agora: "+controle.getTotalBonus());

        Gerente g1 = new Gerente();
        g1.setSalario(10000);
        controle.setTotalBonus(g1);
        System.out.println("Total de salarios pagos até agora: "+controle.getTotalBonus());
    }
}
