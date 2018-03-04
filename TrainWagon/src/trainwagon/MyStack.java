/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainwagon;

/**
 *
 * @author tolaotesanya
 */

import java.util.*;
public class MyStack implements StackInterface {
    
    public ArrayList<String> TStack;
    
    public MyStack(){
        
        TStack = new ArrayList<String>();
    
    }
    
    public boolean isEmpty(){
    
        return TStack.isEmpty();
          
    }
    
    public boolean isFull(){
       if(TStack.size() == 5){
           return true;
       }
       
        return false;
    }
    
    public void push(Object wagonName){
    
        TStack.add(0, (String)wagonName);
    }
    
    public Object pop(){
        if(!(TStack.isEmpty())){
            return TStack.remove(0);
        }
        else 
            return null;
    }
    public String displayStack(){
            return TStack.toString();
    } 
    
    public String peek(){
        return TStack.get(0);
    }
    
    public int size(){
           return TStack.size();
    }
    
    public String emptyStack(){
       int len = TStack.size();
        for(int i = 0; i < len; i++){
            TStack.remove(0);
    
    }
        return null;
    }
    
     /* or
    public String emptyStack(){
       while(!(TStack.isEmpty()));
    
    }
        return pop();
    } */
    
}
