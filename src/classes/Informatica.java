package classes;

public class Informatica extends Loja{
    double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, double seguroEletronicos, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeguro eletronicos: " + seguroEletronicos;
    }
}
    

