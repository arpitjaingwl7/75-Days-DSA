public class PrrintNumber {

    public static void main(String[] args) {
        
    printNumber(20);
    }
    public static void printNumber(int n){
        // Base Case
        if(n==0){
            return;
        }
        
        // Step-2 Think the easiest task you can perform

        System.out.println(n);



    // step-3 Recursive Call

    printNumber(n-1);




    }
     
}


// write a function that print all the number in reverse order
// from n and n is a fxn paremeter

// 5-> 5 4 3 2 1
// 6 ->6 5 4 3 2 1
