package unverified;

public class ClonePair12859 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String str,int len){
      if (str == null)   return null;
      if (len > str.length())   len=str.length();
      return str.substring(0,len);
    }
}
