package unverified;

public class ClonePair13042 {

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
