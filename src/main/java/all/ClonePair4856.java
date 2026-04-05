package all;

public class ClonePair4856 {

    char method1(char c){
      if (c == '<')   return '>';
      if (c == '[')   return ']';
      if (c == '(')   return ')';
      if (c == '{')   return '}';
      return c;
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
