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
public class Node<E> {
    E value;
    Node next;
    
    public Node(E value){
        this.value = value;
        next = null;
    }
    public Node(E value, Node n){
        this.value = value;
        next = n;        
    }
    public E getValue(){
        return this.value;
    }
    public Node getNext(){
        return this.next;
    }
    public void setValue(E value){
        this.value = value;
    }
    public void setNext(Node next){
        this.next = next;
    }
    

}
