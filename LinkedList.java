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
public class LinkedList {
    Node head;
    int count;
    
    public LinkedList(){
        this.head = null;
        this.count = 0;
    }
    
    public LinkedList(Node head){
        this.head = head;
        this.count = 1;
    }
    
    public void addToHead(int val){
        head = new Node(val, head);
    }
    
    public void addToMid(int val, int location){
        Node newNode = new Node(val, null);
        
        if(this.head == null && location != 0){
            return;
        }else if(this.head == null && location == 0){
            this.head = newNode;            
        }
        if (location == 0){
            addToHead(val);
        }
        
        Node current = this.head;
        Node previous = null;
        int i = 0;
        
        while (i<location-1){
            previous = current;
            current = current.next;
            if(current == null){
                break;
            }
            i++;
            newNode.next = current;
            previous.next = newNode;
        }
        
        
    }
    
    public void addToTail(int val){
        Node it = head;
        if(head==null){
            head = new Node(val,head);
        } else {                 
            while(it.next != null){
                it = it.next;
            }
            it.next = new Node(val, null);
        }
        
    }
    
    public void delNode(){
        Node current = head;
        if (current == null){
            System.out.println("It is empty LinkedList!!!!!!");
        } else if(getCount() == 1) {
            this.head = null;
            count--;
            return;
        }
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    public void update(){
        
    }
    
    public int getCount(){
        return this.count;
    }
    
    public Boolean isEmpty() {
        return getCount() == 0;
    }
    
    public void printAll(){
        Node it;
        it = head;
        while(it != null){
            System.out.print(it.value+ " ");
            it = it.next;
        }
        System.out.println("");
    }
    
}
