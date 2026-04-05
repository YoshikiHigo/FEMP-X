package unverified;

public class ClonePair12594 {

    String method1(String s,char c){
      boolean b=false;
      if (s == null || s.length() == 0)   return s;
      int n=0;
      int len=s.length();
      while (n < len && s.charAt(n) == c) {
        n++;
        b=true;
      }
      if (b)   s=s.substring(n);
      return s;
    }

    String method2(String path,char separator){
      if (path == null || path.length() == 0)   return path;
      if (path.charAt(0) == separator) {
        return path.substring(1,path.length());
      }
      return path;
    }
}
