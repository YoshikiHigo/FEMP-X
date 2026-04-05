package unverified;

public class ClonePair463 {

    boolean method1(byte[] header,byte[] suggestedEncodingBytes){
      if (header.length < suggestedEncodingBytes.length)   return false;
      for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
      return true;
    }

    boolean method2(byte[] array,byte[] prefix){
      if (prefix.length > array.length) {
        return false;
      }
      for (int i=0; i < prefix.length; i++) {
        if (array[i] != prefix[i]) {
          return false;
        }
      }
      return true;
    }
}
