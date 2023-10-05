package JavaOO;

public class Caixa extends Funcionario{
    private int senha;

    public boolean verificaSenha(int senha) {
        return false;
        //metodo de verificacao de senha
        //diferente do método do Gerente
    }

    double getBonus() {
        return 0;
    }

}