package JavaOO;

public class ControleDeAcesso {
    int senha;

    void validaSenha(FuncionarioEspecial funcionarioEspecial) {
        funcionarioEspecial.verificaSenha(senha);
    }
}
