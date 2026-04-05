package unverified;

public class ClonePair4863 {

    char method1(char c){
      char close=0;
    switch (c) {
    case '(':{
          close=')';
          break;
        }
    case '{':{
        close='}';
        break;
      }
    case '<':{
      close='>';
      break;
    }
    case '[':{
    close=']';
    break;
    }
    default:{
    close=c;
    break;
    }
    }
    return close;
    }

    char method2(char c){
    switch (c) {
    case '(':    return ')';
    case '{':  return '}';
    case '[':return ']';
    case '<':return '>';
    default:return c;
    }
    }
}
