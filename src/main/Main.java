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
        c.add(new Student("606590372", "Gabriela", 30, "Puntarenas"));
        c.add(new Student("109590371", "Fabiana", 90, "Curridabat"));
        c.add(new Student("306390376", "Gonzalo", 33, "Taras"));
        c.add(new Student("106590371", "Amalia", 34, "San Pedro"));
        c.add(new Student("306590379", "Mario", 39, "Tierra Blanca"));
        
        CircularDoublyLinkedList cd = new CircularDoublyLinkedList();
        cd.add(new Student("306590372", "Gabriel", 12, "Puntarenas"));
        cd.add(new Student("103292372", "Fabian", 13, "Curridabat"));
        cd.add(new Student("306370372", "Paula", 14, "Taras"));
        cd.add(new Student("106690372", "Alonso", 15, "San Pedro"));
        cd.add(new Student("306590377", "María", 16, "Tierra Blanca"));
                
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
