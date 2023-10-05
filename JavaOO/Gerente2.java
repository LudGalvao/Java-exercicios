package JavaOO;

public class Gerente2 extends Funcionario2 {
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
        return super.getBonus() + 5000;
    }
}
