package unverified;

public class ClonePair13486 {

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
