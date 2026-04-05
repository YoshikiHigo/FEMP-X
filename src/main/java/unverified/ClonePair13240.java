package unverified;

public class ClonePair13240 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String s){
      if (s != null && s.trim().length() > 0) {
        return Integer.parseInt(s);
      }
      return 0;
    }
}
