package unverified;

public class ClonePair461 {

    boolean method1(byte[] header,byte[] suggestedEncodingBytes){
      if (header.length < suggestedEncodingBytes.length)   return false;
      for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
      return true;
    }

    boolean method2(byte[] bytes,byte[] lookFor){
      if (bytes.length < lookFor.length) {
        return false;
      }
      for (int i=0; i < lookFor.length; ++i) {
        if (bytes[i] != lookFor[i]) {
          return false;
        }
      }
      return true;
    }
}
