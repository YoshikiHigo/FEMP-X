package unverified;

public class ClonePair10585 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String source,String pattern,String replace){
      if (source != null) {
        int len=pattern.length();
        StringBuffer sb=new StringBuffer();
        int found=-1;
        int start=0;
        while ((found=source.indexOf(pattern,start)) != -1) {
          sb.append(source.substring(start,found));
          sb.append(replace);
          start=found + len;
        }
        sb.append(source.substring(start));
        return sb.toString();
      }
     else   return null;
    }
}
