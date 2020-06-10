
package poo2;

import javax.swing.JOptionPane;

public class Poo2 {

    public static void main(String[] args) {
        Estacionamento dados = new Estacionamento();
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro: "));
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
        
        dados.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de entrada: "))); 
        dados.setMinutoEntrada(Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de entrada: ")));
        
        dados.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de saída: "))); 
        dados.setMinutoSaida(Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de saída: "))); 
        
        dados.calculaTempo(dados.getHoraEntrada(), dados.getHoraSaida(), dados.getMinutoEntrada(), dados.getMinutoSaida());
        dados.valorPagar(dados.getTempo(), dados.getPreco());
        dados.gerarNotinha(dados.getTempo(), dados.getValoraPagar());
        
    }
    
}
