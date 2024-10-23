package main;

import java.util.ArrayList;
import java.util.List;

import model.Banco;
import model.Cliente;
import model.ContaBancaria;
import model.Endereco;

public class Principal {
    
    public static void main(String [] args){          
       
        Cliente ana = new Cliente("Ana Carla", "111.111.111-11", 
        "Programadora Senior","Jose Alfredo",50,
               "88220-000", "São José", "SC",
        "1234-5", "1111-3");      
         
        
        Endereco enderecoJoao = new Endereco("Jose Alfredo",50,
               "88220-000", "São José", "SC");
            
        ContaBancaria contaJoao = new ContaBancaria("1234-5", "1111-3");
        contaJoao.depositar(150);
        
        Cliente joao = new Cliente("Joao Cardosas Filho", "000.000.000-00",
                "Cientista de Dados", enderecoJoao, contaJoao );
        
        Endereco enderecoBanco = new Endereco("Leoberto Leal", 123, 
        "12540-000", "Sao Jose", "SC");
        
        List <Cliente> clientes = new ArrayList <Cliente>();
        clientes.add(ana);
        clientes.add(joao);
        
        ana.getConta().setAgencia("0000-0");
        
        Banco banco = new Banco("Estacio Bank", enderecoBanco, clientes);
        System.out.println(banco);
     
        
    }
    
}
