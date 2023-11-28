package classes;

import java.time.LocalDate;

public class Produto {
    String nome;
    double preco;
    Data dataValidade;


public Produto(String nome, double preco, Data dataValidade){
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade; 
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public double getPreco() {
    return preco;
}


public void setPreco(double preco) {
    this.preco = preco;
}


public Data getDataValidade() {
    return dataValidade;
}


public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
}

    public boolean estaVencido(Data data){
        LocalDate dataBase = LocalDate.of(dataValidade.getAno(), dataValidade.getMes(), dataValidade.getDia());
        LocalDate dataVerificar = LocalDate.of(data.getAno(), data.getMes(), data.getDia());
        if(dataVerificar.isAfter(dataBase)){
            return true;
        } else return false;
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", dataValidade=" + dataValidade + "]";
    }

    

}
