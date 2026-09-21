class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] group = path.split("/");

        for (String s : group) {

            // Ignore empty strings and "."
            if (s.equals("") || s.equals(".")) {
                continue;
            }

            // Go to parent directory
            else if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Normal directory
            else {
                st.push(s);
            }
        }

        // If stack is empty, path is root
        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder res = new StringBuilder();

        // Build the canonical path
        for (String curr : st) {
            res.append("/");
            res.append(curr);
        }

        return res.toString();
    }
}