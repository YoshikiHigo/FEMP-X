package all;

public class ClonePair11415 {

    String method1(String str,int limit){
      if (str.length() <= limit)   return str;
      String s0=str.substring(0,limit);
      s0+="...";
      return s0;
    }

    String method2(String s,int maxLen){
      int len=s.length();
      if (len > maxLen) {
        s=s.substring(0,maxLen) + "...";
      }
      return s;
    }
}
