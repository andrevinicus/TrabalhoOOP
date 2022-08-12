
package br.com.unimater.poo.contabancaria.Program;

import br.com.unimater.poo.contabancaria.ContaBancaria;
import java.text.ParseException;
import javax.swing.JOptionPane;


public class programa {
    public static void main(String[] args) throws ParseException {
        ContaBancaria acc1 = new ContaBancaria();
        
        
        
        JOptionPane.showMessageDialog(null,
                "\nBem-Vindo\nao banco bradesco");

        //Define o nome do ususario da conta 
        
        String nome = JOptionPane.showInputDialog("Digite o nome da sua conta: ");
        acc1.setTitular(nome);
        //depositar
        Double deposita;
        deposita = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de depsito",
                JOptionPane.QUESTION_MESSAGE));
        acc1.depositar(deposita);
        
        
        Double saque;
        saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de Saque",
                JOptionPane.QUESTION_MESSAGE));
        acc1.sacar(saque);
       
        
        //saldo final
        JOptionPane.showMessageDialog(null, "\nSaldo da conta: " + acc1.getSaldo(), "Nome da Conta: " + 
                nome + " Data: " , JOptionPane.QUESTION_MESSAGE);

    }
}

