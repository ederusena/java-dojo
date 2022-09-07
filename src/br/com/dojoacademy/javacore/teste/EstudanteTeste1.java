package br.com.dojoacademy.javacore.teste;

import br.com.dojoacademy.javacore.dominio.Estudante;

public class EstudanteTeste1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Eders", 35, 'M');

        estudante.consultarDadosPessoais();
    }
}
