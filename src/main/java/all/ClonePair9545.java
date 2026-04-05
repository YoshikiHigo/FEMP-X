package all;

public class ClonePair9545 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')   return true;
      return false;
    }

    boolean method2(char flag){
      if (flag >= 'a' && flag <= 'z') {
        return true;
      }
      if (flag >= 'A' && flag <= 'Z') {
        return true;
      }
      return false;
    }
}
