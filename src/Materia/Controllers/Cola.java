package Materia.Controllers;
import java.util.EmptyStackException;

import Materia.Models.*;
public class Cola {
    private Node head;
    private Node tail;

    
    public Cola() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void add(int value){
    Node newNode = new Node(value);
        if(isEmpty()){
            head = new Node(value);
            tail = head;
        } else{
            tail.setNext(new Node(value));
            tail = newNode;            
        }
    }

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        int value = head.getValue();
        head = head.getNext();
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return head.getValue();
    }

    public void printStack() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int Size() {
        Node current = head;
        int size=0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

}
