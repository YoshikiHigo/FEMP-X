package unverified;

public class ClonePair468 {

    boolean method1(byte[] header,byte[] suggestedEncodingBytes){
      if (header.length < suggestedEncodingBytes.length)   return false;
      for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
      return true;
    }

    boolean method2(byte[] string,byte[] start){
      if (string.length < start.length)   return false;
      for (int i=0; i < start.length; i++) {
        if (string[i] != start[i])     return false;
      }
      return true;
    }
}
