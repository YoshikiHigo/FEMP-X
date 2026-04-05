package all;

public class ClonePair2326 {

    boolean method1(byte[] magic,byte[] buffer){
      for (int i=0; i < magic.length; i++)   if (buffer[i] != magic[i])   return false;
      return true;
    }

    boolean method2(byte[] fixed,byte[] temp){
      for (int i=0; i < fixed.length; i++) {
        if (temp[i] != fixed[i])     return false;
      }
      return true;
    }
}
