package all;

public class ClonePair11739 {

    String method1(String s,int n){
      if (s == null)   return null;
      if (s.equals("") || n <= 0)   return "";
      final StringBuilder r=new StringBuilder(n);
      for (int i=0; i < n; i++) {
        r.append(s.charAt(i % s.length()));
      }
      return r.toString();
    }

    String method2(String s,int count){
      if (s == null) {
        return null;
      }
      return s.substring(0,((count < 0) ? 0 : (count < s.length()) ? count : s.length()));
    }
}
