package unverified;

public class ClonePair12276 {

    String method1(String strOrig,String strFind,String strReplace){
      if (strOrig == null) {
        return null;
      }
      StringBuffer sb=new StringBuffer(strOrig);
      String toReplace="";
      if (strReplace == null)   toReplace="";
     else   toReplace=strReplace;
      int pos=strOrig.length();
      while (pos > -1) {
        pos=strOrig.lastIndexOf(strFind,pos);
        if (pos > -1)     sb.replace(pos,pos + strFind.length(),toReplace);
        pos=pos - strFind.length();
      }
      return sb.toString();
    }

    String method2(String errorMessage,String replaced,String included){
      if (replaced.equals(included))   return errorMessage;
      String message=new String(errorMessage);
      int index=0;
      while ((index=message.lastIndexOf(replaced)) != -1) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(message.substring(0,index > 0 ? index : 0));
        buffer.append(included);
        buffer.append(message.substring(index + replaced.length()));
        message=buffer.toString();
      }
      return message;
    }
}
