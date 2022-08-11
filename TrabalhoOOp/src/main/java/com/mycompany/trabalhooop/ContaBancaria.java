package com.mycompany.trabalhooop;
//atributos


import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//construtor

public class ContaBancaria {

    private String titular;
    private double saldo;
    Date ulMov;

    public ContaBancaria(String titular, Date ulMov) {
        this.titular = titular;
        this.ulMov = ulMov;
    }
  //construtor sem argumentos
    public ContaBancaria() {

    }
 //Encapisulamento(get e set)

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getUlMov() {
        return ulMov;
    }
//funçao deposito

    public void depositar(double quantia) {
        int a, b;
        a = 1;
        b = 2;
//tratamento de erro
        if (quantia > 0 & 5000 >= quantia) {
            saldo += quantia;

        } else if (a != b) {

            JFrame frame = new JFrame("Valor menor ou maior que o permitido");
            int resposta = JOptionPane.showConfirmDialog(frame, "escolha sim ou nao \npara tentar novamente", "Valor Invalido!!", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Digite o valor da operaçao menor que R$5000 \nmaior que 0 ");

                Double deposito;
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de depsito", "DIGITE NOVAMENTE",
                        JOptionPane.QUESTION_MESSAGE));
                saldo += deposito;
                quantia = deposito;
                if (quantia > 0 & 5000 >= quantia) {

                    JOptionPane.showMessageDialog(null, "Operaçao realizada");
                }

            } else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Operaçao encerrada");

            } else {
                JOptionPane.showMessageDialog(null, "Operaçao encerrada");
                System.exit(0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Operaçao encerrada");
            System.exit(0);
        }
    }
//funçao de saque

    public void sacar(Double saque) {
        int a, b;
        a = 1;
        b = 2;
//tratamento de erro
        if (saque > 0 & 5000 >= saque) {
            saldo -= saque;

        } else if (a != b) {

            JFrame frame = new JFrame("Valor menor ou maior que o permitido");
            int resposta = JOptionPane.showConfirmDialog(frame, "escolha sim ou nao \npara tentar novamente", "Valor Invalido!!", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Digite o valor da operaçao menor que R$5000 \nmaior que 0 ");

                Double saques;
                saques = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de saque", "DIGITE NOVAMENTE",
                        JOptionPane.QUESTION_MESSAGE));
                saldo -= saques;
                saque = saques;
                if (saque > 0 & 5000 >= saque) {

                    JOptionPane.showMessageDialog(null, "Operaçao realizada");
                }

            } else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Operaçao encerrada");

            } else {
                JOptionPane.showMessageDialog(null, "Operaçao encerrada");
                System.exit(0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Operaçao encerrada");
            System.exit(0);
        }
    }

}
