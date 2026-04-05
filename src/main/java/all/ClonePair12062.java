package all;

public class ClonePair12062 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
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
