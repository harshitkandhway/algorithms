package datastructures.stack.leetcode;

import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class PathSimplifier {
    public static String simplifyPath(String path) {
        path.replaceAll("//","/");
        path.replaceAll("/./","");
        Stack<String> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(path,"/");
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(!stack.empty() && str.equals(".."))
                stack.pop();
            if(stack.empty() && str.equals(".."))
                return "/";
            else
                stack.push(str);
        }

        String temp="";

        while(!stack.empty()){
            temp="/"+stack.pop()+temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        String res = simplifyPath("/a/b/../c/");
        System.out.println("res = " + res);
    }
}
