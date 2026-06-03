import java.util.Stack;

class BrowserHistory {
   
     Stack<String> main=new Stack<>();;
    
    Stack<String> helper=new Stack<>();;

    public BrowserHistory(String homepage) {
      
       
        main.push(homepage);
    }
    
    public void visit(String url) {
       
        main.push(url);
       
        helper.clear();
    }
    
    public String back(int steps) {
        
        while (steps > 0 && main.size() > 1) {
            helper.push(main.pop());
            steps--;
        }
       
        return main.peek();
    }
    
    public String forward(int steps) {
       
        while (steps > 0 && !helper.isEmpty()) {
            main.push(helper.pop());
            steps--;
        }
       
        return main.peek();
    }
}