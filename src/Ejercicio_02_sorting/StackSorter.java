package Ejercicio_02_sorting;
import Materia.Controllers.StackGeneric;
public class StackSorter {
    
    public void sort(StackGeneric<Integer> stack) {
        StackGeneric<Integer> tempStack = new StackGeneric<>();
        
        while (stack.isEmpty()!= true) {
            int current = stack.pop();
            
            while (tempStack.isEmpty()!= true && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(current);
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
