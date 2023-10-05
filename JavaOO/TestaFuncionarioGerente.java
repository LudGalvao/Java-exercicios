package JavaOO;

public class TestaFuncionarioGerente {
    public static void main(String[] args) {
        Funcionario2 f1 = new Funcionario2();
        f1.setSalario(1000);
        double salFuncionario = f1.getSalario();
        System.out.println("Salario do funcionario f1: "+salFuncionario);
        System.out.println("Bonus do funcionario f1: "+f1.getBonus());

        Gerente g1 = new Gerente();
        g1.setSalario(10000);
        System.out.println("Salario do Gerente g1: "+g1.getSalario());
        System.out.println("Bonus do Gerente g1: "+g1.getBonus());

        Funcionario arthur = new Gerente();
        arthur.setSalario(1000);
        System.out.println("Bonus de f10: "+arthur.getBonus());
    }

}