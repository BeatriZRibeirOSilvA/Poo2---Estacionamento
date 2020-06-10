
package poo2;

import javax.swing.JOptionPane;

public class Estacionamento {   
public String placa;
public String modelo;
public double horaEntrada;
public double horaSaida;
public double minutoEntrada;
public double minutoSaida;
private double preco = 4.00;
public double valorPago;
public double tempo;

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

  

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getValoraPagar() {
        return valoraPagar;
    }

    public void setValoraPagar(double valoraPagar) {
        this.valoraPagar = valoraPagar;
    }
public double valoraPagar;
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(double minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public double getMinutoSaida() {
        return minutoSaida;
    }

    public void setMinutoSaida(double minutoSaida) {
        this.minutoSaida = minutoSaida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calculaTempo(double horaEntrada, double horaSaida, double minutoEntrada, double minutoSaida){
        double converte_ent = horaEntrada - minutoEntrada/60;
        double converte_saida = horaSaida - minutoSaida/60;
        
        double tempo = Math.ceil(converte_saida - converte_ent);
        
        JOptionPane.showMessageDialog(null, "O tempo de permanência é de: " + tempo + "horas");
        
        return tempo;
        
    }
    
    public double valorPagar(double tempo, double preco){
        double valorPago = tempo * preco;
        
        JOptionPane.showMessageDialog(null, "O valor a pagar é de: " + valorPago + "reais");
        
        return preco;
        
        
    }
    
   
    
    public void gerarNotinha(double tempo, double valoraPagar){
        JOptionPane.showMessageDialog(null, "Notinha do Estacionamento!\n"
        + "_________________________\n"
        + "Placa: " + placa + "\n"
        + "Tempo de Permanência: " + this.tempo + "\n"
        + "Valor por hora: " + preco + "\n"
        + "Total a pagar: " + valoraPagar + "\n"
        + "OBRIGADO! VOLTE SEMPRE!");
        
    }

    
}
