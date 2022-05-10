/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Usuario
 */
public class Main {
        public static void main(String[] args) {
        
        }
        
           public String diplay(Object reference){
        String result = "";
        
        Node aux = (Node) reference;
        while(aux != null){
            result+= aux.data +"\n";
            aux = aux.next;
            
        }
        
        return result;
        
    }
}
