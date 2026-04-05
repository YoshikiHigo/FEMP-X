package all;

public class ClonePair462 {

    boolean method1(byte[] header,byte[] suggestedEncodingBytes){
      if (header.length < suggestedEncodingBytes.length)   return false;
      for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
      return true;
    }

    boolean method2(byte[] key,byte[] prefix){
      if (key.length >= prefix.length) {
        for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
        return true;
      }
      return false;
    }
}
