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
public class Caixa {
    public void aberturaCaixa(double valor, String data ){
        System.out.println("O valor de "+valor+" na data "+data+" foi registrado na abertura de caixa!!");
    }
    
    public void fecharCaixa(double valor, String data ){
        System.out.println("O valor de "+valor+" na data "+data+" foi registrado no fehamnto de caixa!!");
    }
    
    public static void cadastrarSuprimento(double valor, String data ){
        System.out.println("O suprimento de valor "+valor+" na data "+data+" foi registrado no caixa!!");
    }
    
    public static void cadastrarSangria(double valor, String data ){
        System.out.println("A sangria de valor "+valor+" na data "+data+" foi registrado no caixa!!");
    }
}
