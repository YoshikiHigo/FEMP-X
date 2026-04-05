package unverified;

import java.util.*;

public class ClonePair5206 {

    int method1(String s,char c){
      int i=0;
      while (i < s.length()) {
        if (s.charAt(i) == '\\') {
          ++i;
        }
     else {
          if (s.charAt(i) == c)       return i;
        }
        ++i;
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
