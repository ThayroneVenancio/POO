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
public class Clinica{
    public void cadastrarFuncionario(String nome, String cpf){
        System.out.println("O funcionario "+nome+" e de CPF ("+cpf+") foi cadastrado!!");
        }
    
    public void cadastrarPaciente(String nome, String cpf){
        System.out.println("O cliente "+nome+" e de CPF ("+cpf+") foi cadastrado!!");
        }
    
    public static void cadastrarEquipamento(String nome, String marca ){
        System.out.println("O equipamento "+nome+" e de marca ("+marca+") foi cadastrado!!");
        }
    
    public static void cadastrarFalta(String nome, String data){
        System.out.println("O funcionario "+nome+" faltou o serviço na data: !"+data);
        }
    
}
