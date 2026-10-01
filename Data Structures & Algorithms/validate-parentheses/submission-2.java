class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        if(n % 2 == 1)return false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            // if its an open bracket add
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                // if its a close and it matches the top pop the top
                if (isClose(c) && matchingBrackets(c, top)) {
                    stack.pop();
                }else{
                    return false;
                }
                // if its a close and it doesnt match return false
            }
        }
        return stack.isEmpty();
    }

    public boolean matchingBrackets(char close, char top) {
        if (top == '(' && close == ')') {
            return true;
        } else if (top == '[' && close == ']') {
            return true;
        } else if (top == '{' && close == '}') {
            return true;
        }
        return false;
    }
    public boolean isClose(char bracket) {
        return bracket == ')' || bracket == ']' || bracket == '}';
    }
}
