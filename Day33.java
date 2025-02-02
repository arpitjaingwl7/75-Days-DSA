public class Day33 {
    
}

// MyStack class to implement stack operations using two queues
class MyStack {
    Queue<Integer> main;
    Queue<Integer> helper;

    // Constructor to initialize the stack
    public MyStack() {
        main = new ArrayDeque<>();
        helper = new ArrayDeque<>();
    }

    // Function to push an item onto the stack
    public void push(int x) {
        main.add(x);
    }

    // Function to remove an item from the top of the stack
    public int pop() {
        if (main.size() == 0) {
            return -1;
        }
        while (main.size() != 1) {
            helper.add(main.remove());
        }
        int x = main.remove();
        while (helper.size() != 0) {
            main.add(helper.remove());
        }
        return x;
    }

    // Function to get the top item of the stack
    public int top() {
        if (main.size() == 0) {
            return -1;
        }
        while (main.size() != 1) {
            helper.add(main.remove());
        }
        int x = main.remove();
        while (helper.size() != 0) {
            main.add(helper.remove());
        }
        main.add(x);
        return x;
    }

    // Function to check if the stack is empty
    public boolean empty() {
        return main.size() == 0;
    }
}

/* 

// C++ Code //
#include <queue>
#include <iostream>

class MyStack {
public:
    std::queue<int> main;
    std::queue<int> helper;

    // Constructor to initialize the stack
    MyStack() {}

    // Function to push an item onto the stack
    void push(int x) {
        main.push(x);
    }

    // Function to remove an item from the top of the stack
    int pop() {
        if (main.empty()) {
            return -1;
        }
        while (main.size() != 1) {
            helper.push(main.front());
            main.pop();
        }
        int x = main.front();
        main.pop();
        while (!helper.empty()) {
            main.push(helper.front());
            helper.pop();
        }
        return x;
    }

    // Function to get the top item of the stack
    int top() {
        if (main.empty()) {
            return -1;
        }
        while (main.size() != 1) {
            helper.push(main.front());
            main.pop();
        }
        int x = main.front();
        main.pop();
        while (!helper.empty()) {
            main.push(helper.front());
            helper.pop();
        }
        main.push(x);
        return x;
    }

    // Function to check if the stack is empty
    bool empty() {
        return main.empty();
    }
};



// Python Code //
from collections import deque

class MyStack:
    def __init__(self):
        self.main = deque()
        self.helper = deque()

    # Function to push an item onto the stack
    def push(self, x: int) -> None:
        self.main.append(x)

    # Function to remove an item from the top of the stack
    def pop(self) -> int:
        if not self.main:
            return -1
        while len(self.main) != 1:
            self.helper.append(self.main.popleft())
        x = self.main.popleft()
        while self.helper:
            self.main.append(self.helper.popleft())
        return x

    # Function to get the top item of the stack
    def top(self) -> int:
        if not self.main:
            return -1
        while len(self.main) != 1:
            self.helper.append(self.main.popleft())
        x = self.main.popleft()
        while self.helper:
            self.main.append(self.helper.popleft())
        self.main.append(x)
        return x

    # Function to check if the stack is empty
    def empty(self) -> bool:
        return not self.main
*/