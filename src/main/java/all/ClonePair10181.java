package all;

public class ClonePair10181 {

    boolean method1(String s1,String s2,int minLength){
      if ((s1.equals(s2) || s1.contains(s2) || s2.contains(s1)) && (s1.length() >= minLength && s2.length() >= minLength)) {
        return true;
      }
      return false;
    }

    boolean method2(String s1,String s2,int minLength){
      if (s1.equals(s2) || s1.contains(s2) || s2.contains(s1)) {
        if (s1.length() >= minLength && s2.length() >= minLength) {
          return true;
        }
      }
      return false;
    }
}
