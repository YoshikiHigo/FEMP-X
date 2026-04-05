package unverified;

public class ClonePair11982 {

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

    String method2(String in,String from,String to){
      if (in == null || from == null || to == null)   return in;
      StringBuffer newValue=new StringBuffer();
      char inChars[]=in.toCharArray();
      int inLen=inChars.length;
      char fromChars[]=from.toCharArray();
      int fromLen=fromChars.length;
      for (int i=0; i < inLen; i++)   if (inChars[i] == fromChars[0] && i + fromLen <= inLen) {
        boolean isEqual=true;
        for (int j=1; j < fromLen; j++) {
          if (inChars[i + j] == fromChars[j])       continue;
          isEqual=false;
          break;
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
      return newValue.toString();
    }
}
