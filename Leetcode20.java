class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] ch = s.toCharArray();
        for (char c: ch){
            if (c == '{' || c == '(' || c == '['){
                stack.push(c);
            } else {
                   if (stack.isEmpty()) return false;
                char res = (char) stack.pop();
                if (c == '}' && res != '{'){
                    return false;
                }
                 if (c == ']' && res != '['){
                    return false;
                }
                 if (c == ')' && res != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
