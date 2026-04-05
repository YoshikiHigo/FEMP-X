package unverified;

public class ClonePair11212 {

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
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        return true;
      }
      return false;
    }
}
