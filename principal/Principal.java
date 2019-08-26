/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.util.Scanner;
import objeto.Caixa;
import objeto.Clinica;
import objeto.Oficina;

/**
 *
 * @author Cliente
 */
public class Principal {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        Caixa cx = new Caixa();
        Clinica cl = new Clinica();
        Oficina of = new Oficina();
        
        System.out.println("DIGITE O VALOR DE ABERTURA DE CAIXA");
        double cxValorAbert = tc.nextDouble();
        System.out.println("DIGITE A DATA DE ABERTURA DE CAIXA");
        String cxDataAbert = tc.next();
        cx.aberturaCaixa(cxValorAbert, cxDataAbert);
                
        System.out.println("DIGITE O VALOR DE FECHAMENTO DE CAIXA");
        double cxValorFec = tc.nextDouble();
        System.out.println("DIGITE A DATA DE FECHAMENTO DE CAIXA");
        String cxDataFec = tc.next();
        cx.fecharCaixa(cxValorFec, cxDataFec);
                
        System.out.println("DIGITE O VALOR DA SANGRIA DO CAIXA");
        double cxValorSan = tc.nextDouble();
        System.out.println("DIGITE A DATA DE SANGRIA DO CAIXA");
        String cxDataSan = tc.next();
        Caixa.cadastrarSangria(cxValorSan, cxDataSan);
                
        System.out.println("DIGITE O VALOR DE SUPRIMENTO DO CAIXA");
        double cxValorSup = tc.nextDouble();
        System.out.println("DIGITE A DATA DE SUPRIMENTO DO CAIXA");
        String cxDataSup = tc.next();
        Caixa.cadastrarSuprimento(cxValorSup, cxDataSup);
        System.out.println("////////////////////////////////////////////////////");
        
        System.out.println("DIGITE O NOME DO FUNCIONARIO DA CLINICA");
        String nomeFunc = tc.next();
        System.out.println("DIGITE O CPF DO FUNCIONARIO DA CLINICA");
        String cpfFunc = tc.next();
        cl.cadastrarFuncionario(nomeFunc, cpfFunc);
                
        System.out.println("DIGITE O NOME DO PACIENTE");
        String nomePac = tc.next();
        System.out.println("DIGITE O CPF DO PACIENTE");
        String cpfPac = tc.next();
        cl.cadastrarPaciente(nomePac, cpfPac);
        
        System.out.println("DIGITE O NOME DO EQUIPAMENTO");
        String nomeEquip = tc.next();
        System.out.println("DIGITE A MARCA");
        String marcaEquip = tc.next();
        Clinica.cadastrarEquipamento(nomeEquip, marcaEquip);
        System.out.println("////////////////////////////////////////////////////");
        
        System.out.println("DIGITE O NOME DO FUNCIONARIO DA OFICINA");
        String nomeFuncOfi = tc.next();
        System.out.println("DIGITE O CPF DO FUNCIONARIO DA OFICINA");
        String cpfFuncOfi = tc.next();
        of.cadastrarFuncionario(nomeFuncOfi, cpfFuncOfi);
        
        System.out.println("DIGITE O NOME DO CLIENTE DA OFICINA");
        String nomeCliOfi = tc.next();
        System.out.println("DIGITE O CPF DO CLIENTE DA OFICINA");
        String cpfCliOfi = tc.next();
        of.cadastrarFuncionario(nomeCliOfi, cpfCliOfi);
            
        System.out.println("DIGITE A MARCA DO VEICULO");
        String marcaVeic = tc.next();
        System.out.println("DIGITE O MODELO DO VEICULO");
        String modeloVeic = tc.next();
        Oficina.cadastrarVeiculo(marcaVeic, modeloVeic);
        
        System.out.println("DIGITE O NOME DO SERVIÇO");
        String  nomeServOfi = tc.next();
        System.out.println("DIGITE O VALOR DO SERVIÇO");
        double valorServOfi = tc.nextDouble();
        Oficina.cadastrarSErvico(nomeServOfi, valorServOfi);
        System.out.println("////////////////////////////////////////////////////");
    }
    
}
