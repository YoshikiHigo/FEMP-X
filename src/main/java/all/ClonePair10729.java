package all;

public class ClonePair10729 {

    String method1(String s,String replace,String with){
      if (s == null || replace == null) {
        return s;
      }
      if (with == null) {
        with="";
      }
      StringBuffer b=new StringBuffer();
      int start=0;
      int lenreplace=replace.length();
      while (true) {
        int i=s.indexOf(replace,start);
        if (i == -1) {
          b.append(s.substring(start));
          break;
        }
        b.append(s.substring(start,i - start));
        b.append(with);
        start=i + lenreplace;
      }
      return b.toString();
    }

    String method2(String s,String f,String r){
      if (s == null)   return s;
      if (f == null)   return s;
      if (r == null)   r="";
      int index01=s.indexOf(f);
      while (index01 != -1) {
        s=s.substring(0,index01) + r + s.substring(index01 + f.length());
        index01+=r.length();
        index01=s.indexOf(f,index01);
      }
      return s;
    }
}
