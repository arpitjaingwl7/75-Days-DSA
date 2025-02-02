class Day31 {
    
}

// MyStack class to implement stack operations
class MyStack {
    int[] arr;
    int top;

    // Constructor to initialize the stack
    public MyStack(int size) {
        arr = new int[size];
        top = -1;
    }

    // Function to push an item onto the stack
    public void push(int x) {
        top++;
        arr[top] = x;
    }

    // Function to remove an item from the top of the stack
    public int pop() {
        if (top == -1) {
            return -1;
        }
        int x = top;
        top--;
        return arr[x];
    }
}
/* 
// C++ Code //
#include <iostream>
#include <vector>

class MyStack {
public:
    std::vector<int> arr;
    int top;

    // Constructor to initialize the stack
    MyStack(int size) : arr(size), top(-1) {}

    // Function to push an item onto the stack
    void push(int x) {
        top++;
        arr[top] = x;
    }

    // Function to remove an item from the top of the stack
    int pop() {
        if (top == -1) {
            return -1;
        }
        int x = top;
        top--;
        return arr[x];
    }
};



// Python Code //
class MyStack:
    def __init__(self, size: int):
        self.arr = [0] * size
        self.top = -1

    # Function to push an item onto the stack
    def push(self, x: int) -> None:
        self.top += 1
        self.arr[self.top] = x

    # Function to remove an item from the top of the stack
    def pop(self) -> int:
        if self.top == -1:
            return -1
        x = self.top
        self.top -= 1
        return self.arr[x]

*/