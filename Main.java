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
        SinglyLinkedList a=new SinglyLinkedList();
        a.add(new Student("305370077","Fiorella Mora",20,"Quircot, Cartago"));
        a.add(new Student("201540221","Andrea Morales",28,"Limon"));
        a.add(new Student("304850123","Josue Vega",35,"Tejar"));
        a.add(new Student("701240222","Claudia Ulloa",20,"Guanacaste"));
        a.add(new Student("102120458","Fabian Loaiza",12,"San Jose"));
        
        DoublyLinkedList b= new DoublyLinkedList();
        b.add(new Course("IF-3000","Introduccion a la informatica",3));
        b.add(new Course("IF-3002","Programacion II",4));
        b.add(new Course("IF-4001","Estadistica",3));
        b.add(new Course("IF-4000","Introduccion a sistemas",2));
        b.add(new Course("IF-4100","Algebra",3));
        
        CircularLinkedList c=new CircularLinkedList();
       
    }
}
