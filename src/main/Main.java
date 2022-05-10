/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                
         CircularLinkedList c = new CircularLinkedList();
           Calendar calendar = Calendar.getInstance();
        calendar.set(2001, 1, 3);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1997, 1, 5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1993, 1, 7);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1991, 1, 9);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(1982, 1, 3);
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(1969, 1, 10);
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(1964, 1, 25);
        Calendar calendar7 = Calendar.getInstance();
        calendar7.set(1961, 1, 14);
        Calendar calendar8 = Calendar.getInstance();
        calendar8.set(1958, 1, 13);
        Calendar calendar9 = Calendar.getInstance();
        calendar9.set(1956, 1, 7);
        System.out.println("Laboratorio 5 Grupo #3\n");
        c.add(new Employee("125", "Ulloa ", "Claudia", "informática", calendar.getTime()));
        c.add(new Employee("78", "Mora", " Fiorella", "administración", calendar1.getTime()));
        c.add(new Employee("7542", "Montoya ", "Maria", "inglés", calendar2.getTime()));
        c.add(new Employee("734722", "Soto", "Nicolas", "turismo", calendar3.getTime()));
        c.add(new Employee("234325", "Quiros", "Javier", "agronomía", calendar4.getTime()));
     
        
        CircularDoublyLinkedList d = new CircularDoublyLinkedList();
        
        d.add(new JobPosition("Programadora", 20));
        d.add(new JobPosition("Educadora", 30));
        d.add(new JobPosition("Manager", 12));
        d.add(new JobPosition("Abogado", 16));
        d.add(new JobPosition("Fisioterapueta", 35));

                
          Node reference = new Node("Reference");
            try {
                reference.next = a.getNode(1);
                a.getNode(a.size()).next = b.getNode(1);
                b.getNode(b.size()).next = c.getNode(1);
                c.getNode(c.size()).next = d.getNode(1);
                d.getNode(d.size()).next = null;
                
                
            } catch (ListException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            System.out.println("LISTA REFERENCE NORMAL\n"+ display(reference)+"\n");
            
          //  System.out.println("LISTA REFERENCE INVERTIDA\n"+ inverse(reference));
                
        }
        
        
           public static String display(Object reference){
        String result = "";
        
        Node aux = (Node) reference;
        while(aux != null){
            result+= aux.data +"\n";
            aux = aux.next;
            
        }
        
        return result;
        
    }
}
