package unverified;

public class ClonePair11229 {

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

    String method2(String in,String from,String to){
      if (in == null || from == null || to == null) {
        return in;
      }
      StringBuffer newValue=new StringBuffer();
      char[] inChars=in.toCharArray();
      int inLen=inChars.length;
      char[] fromChars=from.toCharArray();
      int fromLen=fromChars.length;
      for (int i=0; i < inLen; i++) {
        if (inChars[i] == fromChars[0] && (i + fromLen) <= inLen) {
          boolean isEqual=true;
          for (int j=1; j < fromLen; j++) {
            if (inChars[i + j] != fromChars[j]) {
              isEqual=false;
              break;
            }
          }
          if (isEqual) {
            newValue.append(to);
            i+=fromLen - 1;
          }
     else {
            newValue.append(inChars[i]);
          }
        }
     else {
          newValue.append(inChars[i]);
        }
      }
      return newValue.toString();
    }
}
