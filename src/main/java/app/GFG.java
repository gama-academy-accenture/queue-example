package app;
// Java program to demonstrate 
// PriorityBlockingQueue(Collection c) constructor 
  
import java.util.concurrent.PriorityBlockingQueue; 
import java.util.*; 
  
public class GFG { 
  
    public static void main(String[] args) 
    { 
  
        // Creating a Collection 
        Vector<Integer> v = new Vector<Integer>(); 
        v.addElement(5); 
        v.addElement(2); 
        v.addElement(3); 
        v.addElement(4); 
        v.addElement(1); 
  
        // create object of PriorityBlockingQueue 
        // using PriorityBlockingQueue(Collection c) 
        // constructor 
        PriorityBlockingQueue<Integer> pbq 
            = new PriorityBlockingQueue<Integer>(v); 
  
        // print queue 
        System.out.println("PriorityBlockingQueue:" + pbq); 
    } 
}