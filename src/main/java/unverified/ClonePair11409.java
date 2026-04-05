package unverified;

public class ClonePair11409 {

    String method1(String str,int limit){
      if (str.length() <= limit)   return str;
      String s0=str.substring(0,limit);
      s0+="...";
      return s0;
    }

    String method2(String toTruncate,int maxLength){
      if (toTruncate.length() > maxLength) {
        return toTruncate.substring(0,maxLength) + "...";
      }
     else {
        return toTruncate;
      }
    }
}
