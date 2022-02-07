package com.example.leiturabiblica;

public class Biblia {

    private String versao, livro, capitulo, versiculo;

    public Biblia(String livro, String capitulo, String versiculo, String versao) {
        this.livro = livro;
        this.capitulo = capitulo;
        this.versiculo = versiculo;
    }

    public String getLivro() {
        return livro;
    }

    public String getCapitulo() {

        return capitulo;
    }

    public String getVersiculo() {

        return versiculo;
    }

    public String getVersao(){
        return versao;
    }
}
