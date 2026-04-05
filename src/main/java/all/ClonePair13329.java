package all;

public class ClonePair13329 {

    boolean method1(String input){
      if (input.contains("/") || input.contains("\\") || input.contains(":")|| input.contains("*")|| input.contains("?")|| input.contains("\"")|| input.contains("<")|| input.contains(">")|| input.contains("|"))   return true;
      return false;
    }

    boolean method2(String path){
      for (int i=0; i < path.length(); i++) {
    switch (path.charAt(i)) {
    case '\\':case '/':case ':':case '*':case '?':case '"':case '<':case '>':case '|':      return true;
      }
    }
    return false;
    }
}
