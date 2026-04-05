package all;

public class ClonePair2169 {

    boolean method1(byte[] bytes,byte[] prefix){
      if (prefix.length > bytes.length)   return false;
      for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
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
