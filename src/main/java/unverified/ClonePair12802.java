package unverified;

public class ClonePair12802 {

    String method1(String text,String src,String tar){
      StringBuffer sb=new StringBuffer();
      if (text == null || src == null || tar == null) {
        return text;
      }
     else {
        int size=text.length();
        int gap=src.length();
        for (int start=0; start >= 0 && start < size; ) {
          int i=text.indexOf(src,start);
          if (i == -1) {
            sb.append(text.substring(start));
            start=-1;
          }
     else {
            sb.append(text.substring(start,i)).append(tar);
            start=i + gap;
          }
        }
        return sb.toString();
      }
    }

    String method2(String str,String from,String to){
      int lenFrom;
      if (str == null) {
        return null;
      }
     else   if (from == null || (lenFrom=from.length()) == 0 || to == null) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      int lenTo=to.length();
      int pos=buf.indexOf(from);
      while (pos >= 0) {
        buf.replace(pos,pos + lenFrom,to);
        pos=buf.indexOf(from,pos + lenTo);
      }
      return buf.toString();
    }
}
