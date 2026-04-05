package all;

public class ClonePair8708 {

    String method1(String s,String pat){
      if (!s.startsWith(pat)) {
        return null;
      }
      String ss=s.substring(pat.length() + 1,s.length()).trim();
      return ss;
    }

    String method2(String s,String pat){
      if (!s.startsWith(pat))   return null;
      s=s.substring(pat.length() + 1,s.length());
      return s.trim();
    }
}
