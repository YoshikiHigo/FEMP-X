package unverified;

public class ClonePair12865 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String longString,int size){
      if (longString == null) {
        return null;
      }
      return longString.length() <= size ? longString : new String(longString.substring(0,size));
    }
}
