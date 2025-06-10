package Materia.Controllers;

import java.util.EmptyStackException;

import Materia.Models.NodeGeneric;

public class ColaGenerica <T> {

    private NodeGeneric<T> head;
    private NodeGeneric<T> tail;
    public int length;
    // Constructor

    public ColaGenerica() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if(isEmpty()){
            head = newNode;
            tail = head;
        } else{
            tail.setNext(newNode);
            tail = newNode;            
        }
        length++;
    }

    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        T value = head.getValue();
        head = head.getNext();
        length--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return head.getValue();
    }

    public void printCola() {
        NodeGeneric<T> current = head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.print(']');
        System.out.println();
    }

    public int size() {
        
        return length;
    }

    public T findByName(String name){
        NodeGeneric<T> current = head;
        while (current != null) {
            if (current.getValue().toString() == name) {
                return current.getValue();
            }
            current = current.getNext();
        }

        return null;
    }

    public T removeByName(String name){
        NodeGeneric<T> current = head;
        NodeGeneric<T> previous = null;
        while (current != null) {
            if (current.getValue().toString() == name) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                length--;
                return current.getValue();
            }
            previous = current;
            current = current.getNext();
        }

        return null;
    }

}
