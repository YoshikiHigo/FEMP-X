package unverified;

public class ClonePair519 {

    boolean method1(byte[] s1,byte[] s2){
      int len=s1.length;
      for (int i=0; i < len; i++) {
        if (s1[i] != s2[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] magic,byte[] buffer){
      for (int i=0; i < magic.length; i++)   if (buffer[i] != magic[i])   return false;
      return true;
    }
}
