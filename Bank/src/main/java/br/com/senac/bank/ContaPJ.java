/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.bank;

/**
 *
 * @author sarah62076366
 */
public class ContaPJ extends ContaBancaria {
    private String cnpj;

    public ContaPJ(String titular, String cnpj) {
        super(titular);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void extratoBancario() {
        System.out.println("=== Conta PJ ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Saldo: R$" + getSaldo());
    }
}

