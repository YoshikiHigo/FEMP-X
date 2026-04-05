package unverified;

public class ClonePair11230 {

    String method1(String source,String needle,String replace){
      if (null == source || null == needle || replace == null) {
        return source;
      }
      int needleLenth=needle.length();
      StringBuffer sb=new StringBuffer();
      int pos=source.indexOf(needle);
      while (-1 != pos) {
        sb.append(source.substring(0,pos)).append(replace);
        source=source.substring(pos + needleLenth);
        pos=source.indexOf(needle);
      }
      sb.append(source);
      return sb.toString();
    }

    String method2(String s,String s1,String s2){
      if ("".equals(s1) || "".equals(s) || s == null || s1 == null || s2 == null)   return s;
      StringBuffer stringbuffer=null;
      int j=0;
      int i;
      while ((i=s.indexOf(s1,j)) != -1) {
        String s4=s.substring(j,i);
        j=i + s1.length();
        if (stringbuffer == null)     stringbuffer=new StringBuffer(s2.length());
        stringbuffer.append(s4);
        stringbuffer.append(s2);
      }
      return stringbuffer != null ? stringbuffer.append(s.substring(j)).toString() : s;
    }
}
