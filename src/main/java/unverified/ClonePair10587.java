package unverified;

public class ClonePair10587 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
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
