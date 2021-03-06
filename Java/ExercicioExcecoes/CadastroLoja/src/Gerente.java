public class Gerente extends Funcionario {

    private String area;
    private float imposto = 0.03f; //Float.parseFloat(null); correcao da inicializacao da variavel

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Área do gerente: " + area);
    }

    @Override
    public float calcularImposto() {
        float valorDoImposto = getSalario() * imposto;
        return valorDoImposto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
