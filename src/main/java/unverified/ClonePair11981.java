package unverified;

public class ClonePair11981 {

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

    String method2(String text,String key,String value){
      if (text == null)   return null;
      String buffer=text;
      if (buffer != null && key != null && value != null) {
        int length=key.length();
        for (int start=buffer.indexOf(key); start != -1; start=buffer.indexOf(key,start + value.length())) {
          buffer=buffer.substring(0,start) + value + buffer.substring(start + length);
        }
      }
      return buffer;
    }
}
