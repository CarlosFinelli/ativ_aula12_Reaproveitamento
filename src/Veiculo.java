import java.util.ArrayList;

public class Veiculo
{
    private String ano;
    private String cor;
    private String modelo;
    private String placa;
    private int tipo;
    private Double valorVeiculo;

    ArrayList listVeiculo = new ArrayList();
    public String getAno()
    {
        return ano;
    }

    public void setAno(String ano)
    {
        this.ano = ano;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getPlaca()
    {
        return placa;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valorVeiculo;
    }

    public void setValor(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public void venderVeiculo(Veiculo veiculo) {

    }
}
