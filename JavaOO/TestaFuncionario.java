package JavaOO;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario2 f1 = new Funcionario2();
        f1.nome = "Kark";
        f1.salario = 2000.0;
        f1.status = true;
        System.out.println("Salario atual: "+f1.salario);
        f1.bonificacao(100);
        System.out.println("Salario com bonus de Natal: "+f1.salario);
    }
}
