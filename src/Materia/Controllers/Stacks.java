package Materia.Controllers;
import Materia.Models.Node;
public class Stacks {
    private Node top;
    public Stacks() {
        this.top = null;
    }

    //Metodo que ingrese eun valor int
    public void push(int value){
        Node node1 = new Node(value);
        node1.setNext(top);
        top = node1;
    }
    public int pop(){
        if (top == null)
        {
            throw new RuntimeException("Stack nulo");
        }
        int value = top.getValue();
        top = top.getNext();
        return value;

    }
    public boolean isEmpty() {
        return top == null;}

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");}
        return top.getValue();
    }
    public void printStack(){
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue()+", ");
            current = current.getNext();
        }System.out.println();
    }
}
