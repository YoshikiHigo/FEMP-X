package unverified;

public class ClonePair465 {

    boolean method1(byte[] header,byte[] suggestedEncodingBytes){
      if (header.length < suggestedEncodingBytes.length)   return false;
      for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
      return true;
    }

    boolean method2(byte[] bytes,byte[] prefix){
      if (prefix.length > bytes.length)   return false;
      for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
      return true;
    }
}
