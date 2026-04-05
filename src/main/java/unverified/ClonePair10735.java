package unverified;

public class ClonePair10735 {

    boolean method1(char c){
      if ((c >= 'a') && (c <= 'z'))   return true;
      if ((c >= 'A') && (c <= 'Z'))   return true;
      if (c == '_') {
        return true;
      }
      return false;
    }

    boolean method2(char x){
      if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || x == '_')   return true;
      return false;
    }
}
