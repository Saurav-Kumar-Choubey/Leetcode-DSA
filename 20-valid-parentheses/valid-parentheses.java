class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket, check stack top
            else {
                if (stack.isEmpty()) return false;  // No matching opening bracket
                
                char top = stack.peek();  // Check the top element without removing it
                if ((ch == ')' && top == '(') || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[')) {
                    stack.pop();  // Remove matched opening bracket
                } else {
                    return false; // Mismatched closing bracket
                }
            }
        }
        
        return stack.isEmpty(); // If stack is empty, all brackets matched correctly
    
    }
}