package all;

public class ClonePair13492 {

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

    String method2(String str,String search,String replace){
      int start=0;
      int end=(str != null) ? str.indexOf(search) : -1;
      if (end == -1)   return str;
      StringBuffer buf=new StringBuffer(str.length());
      while (end != -1) {
        buf.append(str.substring(start,end));
        buf.append(replace);
        start=end + search.length();
        end=str.indexOf(search,start);
      }
      if (start != str.length()) {
        buf.append(str.substring(start));
      }
      return buf.toString();
    }
}
