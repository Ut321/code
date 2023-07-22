package stack;

import java.util.Stack;

public class next_greater {
    public static void main(String[] args) {
       int arr[] = {2,4,1,9,0};
       Stack<Integer> s = new Stack<>();
       int nextGreater[] = new int [arr.length];


       for(int i = arr.length-1; i>=0 ; i-- ){

           // 1 while Check Condition
           while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
               s.pop();
           }
           // if -else
           if(s.isEmpty()){
               nextGreater[i]=-1;
           }else{
               nextGreater[i] = arr[s.peek()];
           }
           // 3 push step
           s.push(i);
       }
       // print
       for(int i =0; i<nextGreater.length; i++){
           System.out.println(nextGreater[i] + " ");

       }
        System.out.println();
    }
}


// Output : 4 , 9 , 9, -1 , -1 .
