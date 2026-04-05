package unverified;

public class ClonePair11210 {

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

    String method2(String s,String oldPart,String newPart){
      if ((s == null) || (oldPart == null) || (newPart == null)) {
        return s;
      }
      int i=s.indexOf(oldPart);
      if (i < 0) {
        return s;
      }
      return s.substring(0,i) + newPart + s.substring(i + oldPart.length());
    }
}
