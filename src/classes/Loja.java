package classes;

import java.util.Arrays;

public class Loja{
    String nome;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;
    Endereco endereco;
    Data dataFundacao;
    Produto[] estoqueProdutos;

public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario =  salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[tamanhoEstoque];
}


public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[tamanhoEstoque];

}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
}

public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
}

public double getSalarioBaseFuncionario() {
    return salarioBaseFuncionario;
}

public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
}

public double gastosComSalario(){
    if(salarioBaseFuncionario>0){
        double resultado = quantidadeFuncionarios*salarioBaseFuncionario;
        return resultado;
    } else return -1;
}

public char tamanhoDaLoja(){
    if(quantidadeFuncionarios<10){
        return 'P';
    } else if(quantidadeFuncionarios>=10&&quantidadeFuncionarios<=30){
        return 'M';
    } else return 'G';
}


public Endereco getEndereco() {
    return endereco;
}


public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}


public Data getDataFundacao() {
    return dataFundacao;
}


public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
}


public Produto[] getEstoqueProdutos() {
    return estoqueProdutos;
}


public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
}


@Override
public String toString() {
    return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
            + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
            + ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) + "]";
}


public void imprimeProdutos() {
    for (Produto produto : estoqueProdutos) {
        if (produto != null) {
            System.out.println(produto.toString());
        }
    }
}

public boolean insereProduto(Produto produto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] == null) {
            estoqueProdutos[i] = produto;
            return true;
        }
    }
    return false;
}

public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        Produto produto = estoqueProdutos[i];
        if (produto != null && produto.getNome().equals(nomeProduto)) {
            estoqueProdutos[i] = null;
            return true;
        }
    }
    return false;
}


}
