/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.bank;

/**
 *
 * @author sarah62076366
 */
public class ContaPF extends ContaBancaria {
     private String Cpf;
public ContaPF(String titular, String Cpf){
        super(titular);
        this.Cpf = Cpf;
    }
     public String getCpf(){
        return Cpf;
    }

    public void setCpf(String cpf) {
        this.Cpf = Cpf;
    }

    @Override
    public void extratoBancario(){
        System.out.println("=== Conta PF ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("CPF: " + Cpf);
        System.out.println("Saldo: R$" + getSaldo());
    }
    
}
