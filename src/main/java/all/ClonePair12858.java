package all;

public class ClonePair12858 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String sSource,int nChars){
      int iLen;
      if (null == sSource)   return null;
      iLen=sSource.length();
      if (iLen > nChars)   return sSource.substring(0,nChars);
     else   return sSource;
    }
}
