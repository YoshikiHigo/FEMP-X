package unverified;

public class ClonePair10586 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
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
