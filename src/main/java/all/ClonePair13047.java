package all;

public class ClonePair13047 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
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
