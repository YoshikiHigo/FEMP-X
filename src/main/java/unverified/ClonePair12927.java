package unverified;

public class ClonePair12927 {

    String method1(String s,int length){
      if (s.length() < length) {
        StringBuffer str=new StringBuffer(s);
        for (int i=0; i < length - s.length(); i++) {
          str.append(" ");
        }
        s=str.toString();
      }
     else   if (s.length() > length) {
        s=s.substring(0,length);
      }
      return s;
    }

    String method2(String s,int w){
      int n=s.length();
      if (w < n)   return s.substring(n - w);
      StringBuilder result=new StringBuilder();
      for (int i=n; i < w; i++) {
        result.append(' ');
      }
      result.append(s);
      return result.toString();
    }
}
