/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author ThayroneNot
 */
public class Oficina {
    public void cadastrarFuncionario(String nome, String cpf){
        System.out.println("O funcionario "+nome+" e de CPF ("+cpf+") foi cadastrado!!");
        }
    
    public void cadastrarCliente(String nome, String cpf){
        System.out.println("O cliente "+nome+" e de CPF ("+cpf+") foi cadastrado!!");
        }
    
    public static void cadastrarVeiculo(String marca, String modelo ){
        System.out.println("O veicolo "+marca+" e de modelo ("+modelo+") foi cadastrado!!");
        }
    
    public static void cadastrarSErvico(String nome, double valor){
        System.out.println("O Serviço: "+ nome+", de valor: "+valor+"$ foi cadastrado!!");
    }
}
