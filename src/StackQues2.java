import java.util.Stack;

public class StackQues2 {
    // Questions 2 : Reverse the String using Stack !!
    public static void main(String[] args) {
       String  str = "HelloWorld";
       String result = reverseString(str);
       System.out.println(result);
    }
    public  static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while (idx <str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuffer result = new StringBuffer("");
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }

}
