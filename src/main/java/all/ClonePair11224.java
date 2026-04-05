package all;

public class ClonePair11224 {

    boolean method1(char flag){
      if (flag >= 'a' && flag <= 'z') {
        return true;
      }
      if (flag >= 'A' && flag <= 'Z') {
        return true;
      }
      return false;
    }

    boolean method2(char ch){
      if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
        return true;
      }
     else {
        return false;
      }
    }
}
