package classes;

import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];
            if (loja != null && loja.getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int quantidade = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja instanceof Cosmetico && tipo.equals("Cosmético")) {
                quantidade++;
            } else if (loja != null && loja instanceof Vestuario && tipo.equals("Vestuário")) {
                quantidade++;
            } else if (loja != null && loja instanceof Bijuteria && tipo.equals("Bijuteria")) {
                quantidade++;
            } else if (loja != null && loja instanceof Alimentacao && tipo.equals("Alimentação")) {
                quantidade++;
            } else if (loja != null && loja instanceof Informatica && tipo.equals("Informática")) {
                quantidade++;
            }
        }
        if (quantidade > 0) {
            return quantidade;
        } else {
            return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        double maiorSeguro = 0;
        Loja lojaMaisCara = null;
        for (Loja loja : lojas) {
            if (loja != null && loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return (Informatica) lojaMaisCara;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }
}
