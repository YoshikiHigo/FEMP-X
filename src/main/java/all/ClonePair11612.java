package all;

public class ClonePair11612 {

    String method1(String s,String oldPart,String newPart){
      if ((s == null) || (oldPart == null) || (newPart == null)) {
        return s;
      }
      int i=s.indexOf(oldPart);
      if (i < 0) {
        return s;
      }
      return s.substring(0,i) + newPart + s.substring(i + oldPart.length());
    }

    String method2(String inString,String oldPattern,String newPattern){
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
}
