package all;

public class ClonePair9101 {

    boolean method1(char charV){
      if (Character.isLetter(charV))   return true;
      if (charV == ':')   return true;
      if (charV == '_')   return true;
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case '<':case '>':case '(':case ')':case '[':case ']':case '{':case '}':    return false;
    }
    return true;
    }
}
