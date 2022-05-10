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
                
         CircularLinkedList c = new CircularLinkedList();
        c.add(new Course("IF3001", "Programación I", 3));
        c.add(new Course("IF3101", "Programación II", 4));
        c.add(new Course("IF3100", "Algoritmos y Estructuras de Datos", 4));
        c.add(new Course("IF4001", "Humanidades I", 4));
        c.add(new Course("IF4101", "Humanidades II", 4));
        
        CircularDoublyLinkedList cd = new CircularDoublyLinkedList();

                
          Node reference = new Node("Reference");
            try {
                reference.next = a.getNode(1);
                a.getNode(a.size()).next = b.getNode(1);
                b.getNode(b.size()).next = c.getNode(1);
                c.getNode(c.size()).next = cd.getNode(1);
                cd.getNode(cd.size()).next = null;
                
                
            } catch (ListException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
        }
        
           public String display(Object reference){
        String result = "";
        
        Node aux = (Node) reference;
        while(aux != null){
            result+= aux.data +"\n";
            aux = aux.next;
            
        }
        
        return result;
        
    }
}
