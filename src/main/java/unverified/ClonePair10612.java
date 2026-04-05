package unverified;

public class ClonePair10612 {

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

    String method2(String line,String oldString,String newString){
      int i=0;
      int j=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buffer=new StringBuffer(line2.length);
        buffer.append(line2,0,i).append(newString2);
        i+=oLength;
        for (j=i; (i=line.indexOf(oldString,i)) > 0; j=i) {
          buffer.append(line2,j,i - j).append(newString2);
          i+=oLength;
        }
        buffer.append(line2,j,line2.length - j);
        return buffer.toString();
      }
     else {
        return line;
      }
    }
}
