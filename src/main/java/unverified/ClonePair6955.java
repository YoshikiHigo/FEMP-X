package unverified;

public class ClonePair6955 {

    int method1(int i,String s){
      for (; i < s.length() && (s.charAt(i) == ' ' || s.charAt(i) == '\t'); i++) {
        ;
      }
      return i;
    }

    int method2(int i,String s){
      for (; i < s.length() && (s.charAt(i) == ' ' || s.charAt(i) == '\t'); i++)   ;
      return i;
    }
}
