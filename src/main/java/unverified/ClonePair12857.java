package unverified;

public class ClonePair12857 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String text,int maxLength){
      if (text != null && text.length() > maxLength)   text=text.substring(0,maxLength);
      return text;
    }
}
