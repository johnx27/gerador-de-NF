package create.projectnf.client;
import create.projectnf.products.Produto;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// ADICIONAR OS DADOS DOS CLIENTES E O QUE ELES ESTAA CMPRANDO DA LISTA DE PRODUTOS
// DEPOIS ADICIONAR TUDO DENTRO DA FUNÇAO QUE IRA IMPRIMIR A NF CM OS DADOS DOS CLIENTES E O NUMERO RANDOMICO

public class Cliente {
     public Scanner scanner;
     private long telefone;
     private String name;
     private long cpf;
     private long IdCliente;

     public Cliente(){
         this.scanner= new Scanner(System.in);
         this.IdCliente= gerarId(); //garante que cada Cliente tera um id unico

     }

     private long gerarId(){
         Random random= new Random();
         return 1_000_000_000_0L+  random.nextLong(9_000_000_000L);

     }

     public void Cadastro(){
         System.out.println("digite seu nome:");
         name= scanner.nextLine();
         System.out.println("numero de telefone:");
         telefone=scanner.nextInt();
         scanner.nextLine();
         System.out.println("seu cpf:");
         cpf= scanner.nextLong();
         scanner.nextLine();

         List <String> lista= new ArrayList<>();
         lista.add(String.valueOf(telefone));
         lista.add(String.valueOf(cpf));
         lista.add(name);
         lista.add(String.valueOf(IdCliente));

         System.out.println(lista);
     }


     public void cadProd(){
         Produto pro= new Produto();
         System.out.println(pro.getProdList());
         System.out.println("escolha um produto:");
         String escolha= scanner.nextLine();
        if (pro.getProdList().containsKey(escolha)){
            pro.getProdList().remove(escolha);
        }
     }

     @Override
     public String toString(){
         return
         "CLIENTE CADASTRADO \n"+
         "Cliente:"+name+"\n"+
         "CPF:"+cpf+"\n"+
         "TELEFONE:"+telefone+"\n"+
         "NUMERO DA NF:"+IdCliente;

     }

}
