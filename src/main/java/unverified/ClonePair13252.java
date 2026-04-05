package unverified;

public class ClonePair13252 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Integer.parseInt(srcValue);
    }
}
