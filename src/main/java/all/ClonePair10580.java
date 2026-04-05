package all;

public class ClonePair10580 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String source,String find,String replace){
      if (source == null)   return null;
      StringBuffer sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(find)) < 0)     break;
        if (sb == null)     sb=new StringBuffer();
        if (pos > 0)     sb.append(source.substring(0,pos));
        sb.append(replace);
        source=source.substring(pos + find.length());
      }
     while (source.length() > 0);
      if (sb == null)   return source;
     else {
        sb.append(source);
        return sb.toString();
      }
    }
}
