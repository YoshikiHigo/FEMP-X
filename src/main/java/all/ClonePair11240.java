package all;

public class ClonePair11240 {

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

    String method2(String string,String from,String to){
      if (null == string || null == from || null == to) {
        return string;
      }
      if (string.length() == 0 || from.length() == 0) {
        return string;
      }
      StringBuilder sb=new StringBuilder();
      int pos=0;
      int index=string.indexOf(from);
      int patLen=from.length();
      while (index >= 0) {
        sb.append(string.substring(pos,index));
        sb.append(to);
        pos=index + patLen;
        index=string.indexOf(from,pos);
      }
      sb.append(string.substring(pos));
      return sb.toString();
    }
}
