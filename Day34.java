public class Day34 {
    
}

// MyQueue class to implement queue operations using two stacks
class MyQueue {
    Stack<Integer> main;
    Stack<Integer> helper;

    // Constructor to initialize the queue
    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    // Function to push an item onto the queue
    public void push(int x) {
        main.push(x);
    }

    // Function to pop an element from the queue and return that element
    public int pop() {
        if (main.size() == 0) {
            return -1;
        }
        while (main.size() != 1) {
            helper.push(main.pop());
        }
        int x = main.pop();
        while (helper.size() != 0) {
            main.push(helper.pop());
        }
        return x;
    }

    // Function to get the front element of the queue
    public int peek() {
        if (main.size() == 0) {
            return -1;
        }
        while (main.size() != 1) {
            helper.push(main.pop());
        }
        int x = main.peek();
        while (helper.size() != 0) {
            main.push(helper.pop());
        }
        return x;
    }

    // Function to check if the queue is empty
    public boolean empty() {
        return main.size() == 0;
    }
}

/* 

// C++ Code //
#include <stack>
#include <iostream>

class MyQueue {
public:
    std::stack<int> main;
    std::stack<int> helper;

    // Constructor to initialize the queue
    MyQueue() {}

    // Function to push an item onto the queue
    void push(int x) {
        main.push(x);
    }

    // Function to pop an element from the queue and return that element
    int pop() {
        if (main.empty()) {
            return -1;
        }
        while (main.size() != 1) {
            helper.push(main.top());
            main.pop();
        }
        int x = main.top();
        main.pop();
        while (!helper.empty()) {
            main.push(helper.top());
            helper.pop();
        }
        return x;
    }

    // Function to get the front element of the queue
    int peek() {
        if (main.empty()) {
            return -1;
        }
        while (main.size() != 1) {
            helper.push(main.top());
            main.pop();
        }
        int x = main.top();
        while (!helper.empty()) {
            main.push(helper.top());
            helper.pop();
        }
        return x;
    }

    // Function to check if the queue is empty
    bool empty() {
        return main.empty();
    }
};



// Python Code //
class MyQueue:
    def __init__(self):
        self.main = []
        self.helper = []

    # Function to push an item onto the queue
    def push(self, x: int) -> None:
        self.main.append(x)

    # Function to pop an element from the queue and return that element
    def pop(self) -> int:
        if not self.main:
            return -1
        while len(self.main) != 1:
            self.helper.append(self.main.pop())
        x = self.main.pop()
        while self.helper:
            self.main.append(self.helper.pop())
        return x

    # Function to get the front element of the queue
    def peek(self) -> int:
        if not self.main:
            return -1
        while len(self.main) != 1:
            self.helper.append(self.main.pop())
        x = self.main.pop()
        while self.helper:
            self.main.append(self.helper.pop())
        self.main.append(x)
        return x

    # Function to check if the queue is empty
    def empty(self) -> bool:
        return not self.main

*/