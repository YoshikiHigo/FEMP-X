package all;

public class ClonePair11471 {

    boolean method1(char c){
      if ((c >= '0' && c <= '9') || c == '.') {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c){
      if ((c >= '0' && c <= '9') || c == '.')   return true;
      return false;
    }
}
