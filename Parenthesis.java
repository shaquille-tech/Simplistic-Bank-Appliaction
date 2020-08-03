 import java.util.*;
class Parenthesis {
  public static void balancedParenthesis(String input_str) {
    // Declaring a stack
    Stack<Character> s = new Stack<Character>();
    // Iterating over the entire string.
    for (char st : input_str.toCharArray()) {
      //  If the input string contains an opening parenthesis,
      //  push in on to the stack.
      if (st == '(' || st == '{' || st == '[') {
        s.push(st);
      }
      else {
      // In the case of valid parentheses, the stack cannot be 
      // be empty if a closing parenthesis is encountered.
        if(s.empty()) {
          System.out.println(input_str + 
          " contains invalid parentheses or invalid characters.");
          return;
        }
        // If the input string contains a closing bracket,
        // then pop the corresponding opening parenthesis if
        // present.
        char top = (Character) s.peek();
        if(st == ')' && top == '(' ||
        st == '}' && top == '{' ||
        st == ']' && top == '['){
          s.pop();
        }
      }
      }
    //  Checking the status of the stack to determine the
    //  validity of the string.
    if(s.empty()) {
      System.out.println("true for" + " " + input_str );
    }
    else{
      System.out.println("false for" + " " + input_str );
    }
  }

}