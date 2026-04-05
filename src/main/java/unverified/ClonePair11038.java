package unverified;

public class ClonePair11038 {

    boolean method1(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z'))) {
        return false;
      }
      return true;
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
