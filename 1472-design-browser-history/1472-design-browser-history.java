class BrowserHistory {
    
    // Define the Doubly Linked List Node structure
    private class Node {
        String url;
        Node prev;
        Node next;
        
        Node(String url) {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }

    // Pointer to track the current page node
    private Node curr;

    public BrowserHistory(String homepage) {
        // Initialize the history with the homepage node
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        // Connect current node to the new node
        curr.next = newNode;
        newNode.prev = curr;
        // Move the current pointer to the new page
        curr = newNode;
    }
    
    public String back(int steps) {
        // Move back as long as there is a previous page and steps remaining
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        // Move forward as long as there is a next page and steps remaining
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }
        return curr.url;
    }
}