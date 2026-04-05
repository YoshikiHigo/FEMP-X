package all;

public class ClonePair4855 {

    char method1(char c){
      if (c == '<')   return '>';
      if (c == '[')   return ']';
      if (c == '(')   return ')';
      if (c == '{')   return '}';
      return c;
    }

    char method2(char c){
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
}
