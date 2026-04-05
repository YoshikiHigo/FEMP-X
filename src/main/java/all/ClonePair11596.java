package all;

public class ClonePair11596 {

    boolean method1(char c){
      if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 95))   return true;
      return false;
    }

    boolean method2(char c){
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_')   return true;
     else   return false;
    }
}
