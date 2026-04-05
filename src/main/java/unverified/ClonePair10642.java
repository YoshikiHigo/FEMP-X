package unverified;

public class ClonePair10642 {

    String method1(String old,String substring1,String substring2){
      StringBuffer returnBuffer=new StringBuffer();
      int len0=old.length();
      int len1=substring1.length();
      if (len1 > len0)   return new String(old);
     else {
        int exti=0;
        for (int i=0; i < len0 - len1 + 1; i++) {
          if (old.regionMatches(i,substring1,0,len1)) {
            returnBuffer.append(substring2);
            i+=len1 - 1;
          }
     else {
            returnBuffer.append(old.charAt(i));
          }
          exti=i;
        }
        for (int i=exti + 1; i < len0; i++) {
          returnBuffer.append(old.charAt(i));
        }
        return new String(returnBuffer);
      }
    }

    String method2(String sourceStr,String oldSubStr,String newSubStr){
      String part=null;
      String result="";
      int index=-1;
      int subLen=0;
      subLen=oldSubStr.length();
      part=sourceStr;
      while ((part.length() > 0) && (subLen > 0)) {
        index=part.indexOf(oldSubStr);
        if (index >= 0) {
          result=result + part.substring(0,index) + newSubStr;
          part=part.substring(index + subLen);
        }
     else {
          result=result + part;
          part="";
        }
      }
      return result;
    }
}
