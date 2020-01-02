import java.util.*; 
  
public class DequeExample 
{ 
    public static void main(String[] args) 
    { 
        Deque<String> deque = new LinkedList<String>(); 
  
        
        deque.add("5"); // add to tail 
        deque.addFirst("1"); 
        deque.addLast("9"); 
        deque.push("7"); //add to head 
  
        System.out.println(deque + "\n"); 
  
        // Iterate through the queue elements. 
        System.out.println("Standard Iterator"); 
        Iterator iterator = deque.iterator(); 
        while (iterator.hasNext()) 
            System.out.println("\t" + iterator.next()); 
  
  
        // Reverse order iterator 
        Iterator reverse = deque.descendingIterator(); 
        System.out.println("Reverse Iterator"); 
        while (reverse.hasNext()) 
            System.out.println("\t" + reverse.next()); 
  
        // Peek returns the head, without deleting 
        // it from the deque 
        System.out.println("Peek " + deque.peek()); 
        System.out.println("After peek: " + deque); 
  
        // Pop returns the head, and removes it from 
        // the deque 
        System.out.println("Pop " + deque.pop()); 
        System.out.println("After pop: " + deque); 
  
        // We can check if a specific element exists 
        // in the deque 
        System.out.println("Contains 5: " + 
                        deque.contains("5")); 
  
        // We can remove the first / last element. 
        deque.removeFirst(); 
        deque.removeLast(); 
        System.out.println("Deque after removing " + 
                            "first and last: " + deque); 
  
    } 
} 