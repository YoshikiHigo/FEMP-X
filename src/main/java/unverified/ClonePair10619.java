package unverified;

public class ClonePair10619 {

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

    String method2(String original,String regex,String replacement){
      int index=0;
      String newString=original;
      while ((newString.contains(regex)) && (regex.compareTo(replacement) != 0)) {
        index=newString.indexOf(regex);
        newString=newString.substring(0,index) + replacement + newString.substring(index + regex.length(),newString.length());
      }
      return newString;
    }
}
