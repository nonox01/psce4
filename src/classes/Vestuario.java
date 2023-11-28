package classes;

public class Vestuario extends Loja{
    boolean produtosImportados;

 public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int tamanhoEstoque) {
     super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, tamanhoEstoque);
    this.produtosImportados = produtosImportados;
 }

public boolean getProdutosImportados() {
    return produtosImportados;
}

public void setProdutosImportados(boolean produtosImportados) {
    this.produtosImportados = produtosImportados;
}

@Override
public String toString() {
    return "Vestuario [produtosImportados=" + produtosImportados + "]";
}


}
