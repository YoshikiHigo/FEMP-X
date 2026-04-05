package unverified;

public class ClonePair11410 {

    String method1(String str,int limit){
      if (str.length() <= limit)   return str;
      String s0=str.substring(0,limit);
      s0+="...";
      return s0;
    }

    String method2(String input,int maxChars){
      if (input.length() <= maxChars) {
        return input;
      }
     else {
        return input.substring(0,maxChars) + "...";
      }
    }
}
