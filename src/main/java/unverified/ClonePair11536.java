package unverified;

public class ClonePair11536 {

    String method1(String inputString,String oldString,String newString){
      StringBuffer outputString=new StringBuffer(100);
      int startIndex=0, nextIndex;
      while (inputString.substring(startIndex).indexOf(oldString) > -1) {
        nextIndex=startIndex + inputString.substring(startIndex).indexOf(oldString);
        if (nextIndex > startIndex) {
          outputString.append(inputString.substring(startIndex,nextIndex));
        }
        outputString.append(newString);
        startIndex=nextIndex + oldString.length();
      }
      if (startIndex <= inputString.length() - 1) {
        outputString.append(inputString.substring(startIndex));
      }
      return outputString.toString();
    }

    String method2(String source,String token,String replacement){
      int i1;
      int i2=0;
      int tl=token.length();
      StringBuffer r=new StringBuffer(source.length());
      do {
        i1=source.indexOf(token,i2);
        if (i1 >= i2) {
          if (i1 > i2)       r.append(source.substring(i2,i1));
          r.append(replacement);
          i2=i1 + tl;
        }
     else     r.append(source.substring(i2));
      }
     while (i1 >= 0);
      return r.toString();
    }
}
