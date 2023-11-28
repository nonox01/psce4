package classes;

public class Cosmetico extends Loja {
    double taxaComercializacao;


    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, double taxaComercializacao, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}