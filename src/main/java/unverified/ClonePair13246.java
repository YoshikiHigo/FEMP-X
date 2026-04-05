package unverified;

public class ClonePair13246 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String s){
      if (s == null || s.length() == 0)   return 0;
     else   return Integer.valueOf(s).intValue();
    }
}
