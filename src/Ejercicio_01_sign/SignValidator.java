package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {


    public boolean isValid(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) return false;

                char tope = pila.pop();
                if ((c == ')' && tope != '(') ||
                    (c == '}' && tope != '{') ||
                    (c == ']' && tope != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty(); 
    }
}
