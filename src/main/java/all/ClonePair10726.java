package all;

public class ClonePair10726 {

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

    String method2(String s,String replaceFrom,String repalceTo){
      if (s == null || replaceFrom == null)   return s;
      if (repalceTo == null)   repalceTo="";
      StringBuffer result=new StringBuffer();
      int index=0;
      int j=0;
      while ((j=s.indexOf(replaceFrom,index)) != -1) {
        result.append(s.substring(index,j));
        result.append(repalceTo);
        index=j + replaceFrom.length();
      }
      if (index == 0) {
        return s;
      }
     else {
        result.append(s.substring(index));
        return result.toString();
      }
    }
}
