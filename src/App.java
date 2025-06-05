import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Controllers.StackGeneric;
import Materia.Controllers.Stacks;


public class App {
    public static void main(String[] args) throws Exception {
        StackGeneric<Integer> stackGeneric = new StackGeneric<Integer>();
    
        stackGeneric.push(1);
        stackGeneric.push(4);
        stackGeneric.printStack();
        System.out.println("Length: " + stackGeneric.length);

        StackGeneric<String> stackGenericString = new StackGeneric<String>();
        stackGenericString.push("Uno");
        stackGenericString.push("Cuatro");
        stackGenericString.printStack();
        

        SignValidator  signValidator = new SignValidator();
        String sign1 = "([]){}";
        String sign2 = "({)}";
        System.out.println("Sign 1 is valid: " + signValidator.isValid(sign1));
        System.out.println("Sign 2 is valid: " + signValidator.isValid(sign2));

        StackSorter stackSorter = new StackSorter();
        StackGeneric<Integer> stackToSort = new StackGeneric<>();
        stackToSort.push(2);
        stackToSort.push(4);
        stackToSort.push(1);
        stackToSort.push(5);
        System.out.println("Stack original:");
        stackToSort.printStack();
        stackSorter.sort(stackToSort);
        System.out.println("Stack ordenado:");
        stackToSort.printStack();

    }   
}
