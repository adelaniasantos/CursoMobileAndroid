public class Cliente extends Pessoa {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Código do cliente: " + codigo);
    }

}
