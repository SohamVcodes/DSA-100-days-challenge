class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public int pop() {
        int top = -1;

        if (empty()) {
            return -1;
        }

        if (!q1.isEmpty()) {

            while (!q1.isEmpty()) {
                top = q1.remove();

                if (q1.isEmpty()) {
                    break;
                }

                q2.add(top);
            }

        } else {

            while (!q2.isEmpty()) {
                top = q2.remove();

                if (q2.isEmpty()) {
                    break;
                }

                q1.add(top);
            }
        }

        return top;
    }

    public int top() {
        if (empty()) {
            return -1;
        }

        int top = pop();
        push(top);

        return top;
    }

    public boolean empty() {
        if (q1.isEmpty() && q2.isEmpty()) {
            return true;
        }

        return false;
    }
}