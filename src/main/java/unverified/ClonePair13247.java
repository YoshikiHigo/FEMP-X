package unverified;

public class ClonePair13247 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String str){
      if (str == null || str.equals("")) {
        return 0;
      }
      return (new Integer(str).intValue());
    }
}
