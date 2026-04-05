package all;

public class ClonePair12856 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String s,int length){
      if (s != null) {
        if (length < s.length()) {
          s=s.substring(0,length);
        }
      }
      return s;
    }
}
