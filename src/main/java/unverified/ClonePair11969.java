package unverified;

public class ClonePair11969 {

    String method1(String inString,String oldPattern,String newPattern){
      if (inString == null) {
        return null;
      }
      if (oldPattern == null || newPattern == null) {
        return inString;
      }
      StringBuffer sbuf=new StringBuffer();
      int pos=0;
      int index=inString.indexOf(oldPattern);
      int patLen=oldPattern.length();
      while (index >= 0) {
        sbuf.append(inString.substring(pos,index));
        sbuf.append(newPattern);
        pos=index + patLen;
        index=inString.indexOf(oldPattern,pos);
      }
      sbuf.append(inString.substring(pos));
      return sbuf.toString();
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
