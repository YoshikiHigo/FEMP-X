package all;

public class ClonePair11826 {

    boolean method1(char x){
      if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || x == '_')   return true;
      return false;
    }

    boolean method2(char c){
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_')   return true;
     else   return false;
    }
}
