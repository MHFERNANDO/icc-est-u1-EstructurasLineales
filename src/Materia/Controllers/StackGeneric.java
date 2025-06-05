package Materia.Controllers;

import java.util.EmptyStackException;

import Materia.Models.*;

public class StackGeneric <T> {
    
    private NodeGeneric<T> top;
    public int length;
    // Constructor

    public StackGeneric() {
        this.top = null;
        this.length = 0;
    }

     public void push(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        newNode.setNext(top);
        top = newNode;
        length++;
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();

        }
        T value = top.getValue();
        top = top.getNext();
        length--;
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack() {
        NodeGeneric<T> current = top;
        //System.out.print("[ ");
        while (current != null) {
            if (current.getNext() != null) {
                System.out.print(current.getValue() + "-> ");
                current = current.getNext();
            } else {
                System.out.print(current.getValue());
                current = current.getNext();
            }
        }
        //System.out.print(']');
        System.out.println();
    }

    public int size() {
        return length;
    }
}
