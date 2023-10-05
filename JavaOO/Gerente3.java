package JavaOO;

public class Gerente3 extends Funcionario implements AcessoInterno {
    private int senha;

    public boolean verificaSenha(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso autorizado");
            return true;
        } else {
            System.out.println("Acesso NÃO autorizado");
            return false;
        }
    }

    double getBonus() {
        return (this.salario * 0.07 + 5000);
//		return super.getBonus() + 5000;
    }
}