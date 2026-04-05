package all;

public class ClonePair13495 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
    }

    String method2(String s,String s1,String s2){
      if (s == null)   return s;
      int i=-1;
      for (int j=s.indexOf(s1); j != -1 && i != 0; i--) {
        s=s.substring(0,j) + s2 + s.substring(j + s1.length());
        j=s.indexOf(s1,j + s2.length());
      }
      return s;
    }
}
