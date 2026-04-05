package unverified;

public class ClonePair13270 {

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
     else {
        return Integer.parseInt(str);
      }
    }
}
