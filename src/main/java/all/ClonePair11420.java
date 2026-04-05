package all;

public class ClonePair11420 {

    boolean method1(char c){
      if (Character.isJavaIdentifierPart(c)) {
        return true;
      }
      return ((c == '!') || (c == '#') || (c == '%')|| (c == '&')|| (c == '(')|| (c == ')')|| (c == '+')|| (c == ',')|| (c == '-')|| (c == '/')|| (c == ':')|| (c == ';')|| (c == '=')|| (c == '@')|| (c == '[')|| (c == '\\')|| (c == ']')|| (c == '^')|| (c == '|')|| (c == '~'));
    }

    boolean method2(char ch){
      int c=(int)ch;
      if (c < 0 || c > 255)   return false;
      return " \t\n\r.".indexOf(c) < 0;
    }
}
