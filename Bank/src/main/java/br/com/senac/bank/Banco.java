/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.bank;

/**
 *
 * @author sarah62076366
 */
public class Banco {

    public static void main(String[] args) {
       ContaBancaria conta1 = new ContaBancaria("Sarah");
       
       conta1.depositar(100);
       conta1.sacar(10);
       conta1.extratoBancario();
     
       
      System.out.println(conta1.getTitular());
      System.out.println(conta1.getSaldo());
     
      conta1.setTitular("Sarah Hillary");
     
      System.out.println(conta1.getTitular());
      }
       
      public void Apresentar(){
          
      }
    }
   
