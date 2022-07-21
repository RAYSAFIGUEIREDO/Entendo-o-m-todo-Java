package Exercicio1.Main;

import Exercicio1.Calculadora;
import Exercicio1.Emprestimo;

public class Java {
    /**
     * Classe principal dos exercícios da Aula 1 de Métodos.
     */
    public class Main {

        public void main(String[] args) {

            // Calculadora
            System.out.println("Exercício calculadora");
            Calculadora.soma(3, 6);
            Calculadora.subtracao(9, 1.8);
            Calculadora.multiplicacao(7, 8);
            Calculadora.divisao(5, 2.5);

            // Mensagem
            System.out.println("Exercício mensagem");
            Mensagem.mensagem Mensagem = null;
            Mensagem.obterMensagem(9);
            Mensagem.obterMensagem(14);
            Mensagem.obterMensagem(1);

            // Empréstimo
            System.out.println("Exercício empréstimo");
            Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
            Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
            Emprestimo.calcular(1000, 5);

        }
    }
}
