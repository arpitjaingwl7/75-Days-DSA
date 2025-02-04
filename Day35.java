public class Day35 {
    
}

// MinStack class to implement a stack that supports push, pop, top, and retrieving the minimum element in constant time
class MinStack {
    Stack<Pair> st;

    // Constructor to initialize the stack
    public MinStack() {
        st = new Stack<>();
    }

    // Function to push an item onto the stack
    public void push(int val) {
        Pair p = new Pair(val, val);
        if (st.size() != 0 && st.peek().min < val) {
            p.min = st.peek().min;
        }
        st.push(p);
    }

    // Function to remove an item from the top of the stack
    public void pop() {
        if (st.size() != 0) {
            st.pop();
        }
    }

    // Function to get the top item of the stack
    public int top() {
        if (st.size() == 0) {
            return -1;
        }
        return st.peek().val;
    }

    // Function to get the minimum item of the stack
    public int getMin() {
        if (st.size() == 0) {
            return -1;
        }
        return st.peek().min;
    }
}

// Pair class to store the value and the minimum value at each stack level
class Pair {
    int val, min;

    // Constructor to initialize the pair
    Pair(int x, int y) {
        val = x;
        min = y;
    }
}

// C++ Code //
/* 

class MinStack {
public:
    std::stack<std::pair<int, int>> st;

    // Constructor to initialize the stack
    MinStack() {}

    // Function to push an item onto the stack
    void push(int val) {
        int min = st.empty() ? val : std::min(val, st.top().second);
        st.push({val, min});
    }

    // Function to remove an item from the top of the stack
    void pop() {
        if (!st.empty()) {
            st.pop();
        }
    }

    // Function to get the top item of the stack
    int top() {
        if (st.empty()) {
            return -1;
        }
        return st.top().first;
    }

    // Function to get the minimum item of the stack
    int getMin() {
        if (st.empty()) {
            return -1;
        }
        return st.top().second;
    }
};



// Python Code //
class MinStack:

    def __init__(self):
        self.stack = []

    # Function to push an item onto the stack
    def push(self, val: int) -> None:
        min_val = val if not self.stack else min(val, self.stack[-1][1])
        self.stack.append((val, min_val))

    # Function to remove an item from the top of the stack
    def pop(self) -> None:
        if self.stack:
            self.stack.pop()

    # Function to get the top item of the stack
    def top(self) -> int:
        if not self.stack:
            return -1
        return self.stack[-1][0]

    # Function to get the minimum item of the stack
    def getMin(self) -> int:
        if not self.stack:
            return -1
        return self.stack[-1][1]
*/