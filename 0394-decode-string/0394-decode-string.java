class Solution {

    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int number = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numberStack.push(number);
                stringStack.push(current);

                number = 0;
                current = "";
            }

            else if (ch == ']') {

                int repeat = numberStack.pop();
                String previous = stringStack.pop();

                String repeated = "";

                for (int i = 0; i < repeat; i++) {
                    repeated += current;
                }

                current = previous + repeated;
            }

            else {
                current += ch;
            }
        }

        return current;
    }
}