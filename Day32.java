class Day32 {
    
}

// MyQueue class to implement queue operations
class MyQueue {
    int[] arr;
    int front;
    int rear;

    // Constructor to initialize the queue
    public MyQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    // Function to push an item onto the queue
    public void push(int x) {
        arr[rear] = x;
        rear++;
    }

    // Function to pop an element from the queue and return that element
    public int pop() {
        if (rear == front) {
            return -1;
        }
        int x = front;
        front++;
        return arr[x];
    }
}
/* 
// C++ Code //
#include <iostream>
#include <vector>

class MyQueue {
public:
    std::vector<int> arr;
    int front;
    int rear;

    // Constructor to initialize the queue
    MyQueue(int size) : arr(size), front(0), rear(0) {}

    // Function to push an item onto the queue
    void push(int x) {
        arr[rear] = x;
        rear++;
    }

    // Function to pop an element from the queue and return that element
    int pop() {
        if (rear == front) {
            return -1;
        }
        int x = front;
        front++;
        return arr[x];
    }
};


// Python Code //
class MyQueue:
    def __init__(self, size: int):
        self.arr = [0] * size
        self.front = 0
        self.rear = 0

    # Function to push an item onto the queue
    def push(self, x: int) -> None:
        self.arr[self.rear] = x
        self.rear += 1

    # Function to pop an element from the queue and return that element
    def pop(self) -> int:
        if self.rear == self.front:
            return -1
        x = self.front
        self.front += 1
        return self.arr[x]

*/