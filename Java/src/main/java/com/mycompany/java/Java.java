package com.mycompany.java;

import java.util.HashMap;

public class Java {

    public static void main(String[] args) {
       
        //Java HashMap
        
        HashMap<Integer, String> estudantes = new HashMap<>();
        
        System.out.println("Adicionando elementos: ");
        
        estudantes.put(1, "Matheus");
        estudantes.put(2, "Roberto");
        estudantes.put(3, "Fernanda");
        estudantes.put(4, "Clarisse");
        estudantes.put(5, "Davi");
        
        System.out.println(estudantes);
        
        
        System.out.println("");
        
        System.out.println("Acessando o primeiro elemento:");
       
        System.out.println(estudantes.get(1));
        
         System.out.println("");
         
         System.out.println("Alterando um item qualquer: ");
         estudantes.replace(3, "Júlio");
         System.out.println(estudantes);
        
        System.out.println("");
        
        System.out.println("Excluindo um item qualquer: ");
        System.out.println(estudantes.remove(4));
        
       
        System.out.println("Removendo todos os itens: ");
        estudantes.clear();
        System.out.println(estudantes);
        
         
        
    }
}
