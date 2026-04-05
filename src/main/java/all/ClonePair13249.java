package all;

public class ClonePair13249 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String s){
      if (s == null || s.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(s);
      }
    }
}
