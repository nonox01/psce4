package classes;

 public class Alimentacao extends Loja{
    Data dataAlvara;
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, Data dataAlvara, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData alvará: " + dataAlvara;
    }

}
    

