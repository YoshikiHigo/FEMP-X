package all;

public class ClonePair10428 {

    int method1(String s1,String s2){
      if (s1 == null) {
        return s2 == null ? 0 : -1;
      }
     else   if (s2 == null) {
        return 1;
      }
      return s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : 0;
    }

    int method2(String first,String second){
      if (null == first) {
        return null == second ? 0 : -1;
      }
      if (null == second) {
        return 1;
      }
      if (first.length() > second.length()) {
        return 1;
      }
      if (first.length() == second.length()) {
        return first.compareTo(second);
      }
      return -1;
    }
}
