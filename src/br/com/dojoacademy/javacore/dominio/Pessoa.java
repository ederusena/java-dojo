package br.com.dojoacademy.javacore.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void consultarDadosPessoais() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }

}
