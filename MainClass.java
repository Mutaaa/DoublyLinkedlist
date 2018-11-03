/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kornkanok Sangwichien
 * 60130500202
 */
public class MainClass {
    public static void main(String[] args){
        Node n = new Node(20,null);
        System.out.println(n.value);
        Node k = new Node(26,n);
        System.out.println(k.value);
        //System.out.println(k.next.value);
        //System.out.println(n.next.value);
        
        LinkedList list1 = new LinkedList();
        list1.addToHead(53);
        System.out.println(list1.head.value);
        list1.addToHead(39);
        System.out.println(list1.head.value);
        list1.addToHead(40);
        //list1.addToHead(37);
        list1.addToHead(68);
        System.out.println(list1.head.next.value);
        System.out.println(list1.head.value);
        list1.printAll();
        list1.addToTail(90);
        list1.addToHead(50);
        list1.printAll();
        
        LinkedList list2 = new LinkedList();
        list2.addToTail(39);
        list2.printAll();
        
        list1.addToMid(44, 4);
        list1.printAll();

        list1.addToMid(73, 3);
        list1.printAll();
        
        list1.addToMid(90, 0);
        list1.printAll();
        
        
    }
}
