package unverified;

public class ClonePair11970 {

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

    String method2(String text,String replace,String replaceTo){
      if (text == null || replace == null || replaceTo == null || replace.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int searchFrom=0;
      while (true) {
        int foundAt=text.indexOf(replace,searchFrom);
        if (foundAt == -1) {
          break;
        }
        buf.append(text.substring(searchFrom,foundAt)).append(replaceTo);
        searchFrom=foundAt + replace.length();
      }
      buf.append(text.substring(searchFrom));
      return buf.toString();
    }
}
