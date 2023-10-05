package JavaOO;

public class TestaControleSalarial {
    public static void main(String[] args) {
        ControleSalarial controle = new ControleSalarial();

        Funcionario f1 = new Caixa();
        f1.setSalario(1000);
        controle.setTotalSalarios(f1);
        System.out.println("Total de salarios pagos até agora: "+controle.getTotalSalarios());

        Gerente g1 = new Gerente();
        g1.setSalario(10000);
        controle.setTotalSalarios(g1);
        System.out.println("Total de salarios pagos até agora: "+controle.getTotalSalarios());
    }

}
