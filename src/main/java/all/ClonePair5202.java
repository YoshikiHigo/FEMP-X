package all;

import java.util.*;

public class ClonePair5202 {

    int method1(String s,char toFind){
      int deep=0;
      for (int i=0; i < s.length(); i++) {
        char c=s.charAt(i);
        if ((deep == 0) && (c == toFind))     return i;
        if (c == '"')     deep=1 - deep;
        if (c == '\'')     deep=1 - deep;
      }
      return -1;
    }

    int method2(String buffer,char delimiter){
      Stack stack=new Stack();
      char ch, top;
      for (int i=0; i < buffer.length(); i++) {
        ch=buffer.charAt(i);
        if (!stack.empty()) {
          top=((Character)stack.peek()).charValue();
        }
     else {
          top='\0';
        }
        if (ch == '<') {
          if (top != '"') {
            stack.push(new Character(ch));
          }
          continue;
        }
        if (ch == '>') {
          if (top == '<') {
            stack.pop();
          }
          continue;
        }
        if (ch == '"') {
          if (top == '"') {
            stack.pop();
          }
     else {
            stack.push(new Character(ch));
          }
          continue;
        }
        if (!stack.empty()) {
          continue;
        }
        if (ch == delimiter) {
          return i;
        }
      }
      return -1;
    }
}
