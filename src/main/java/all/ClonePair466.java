package all;

public class ClonePair466 {

    boolean method1(byte[] header,byte[] suggestedEncodingBytes){
      if (header.length < suggestedEncodingBytes.length)   return false;
      for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
      return true;
    }

    boolean method2(byte[] bytes,byte[] magicNumber){
      if (bytes.length < magicNumber.length) {
        return false;
      }
      for (int i=0; i < magicNumber.length; i++) {
        if (bytes[i] != magicNumber[i]) {
          return false;
        }
      }
      return true;
    }
}
