package unverified;

public class ClonePair1170 {

    boolean method1(byte[] header,byte[] full){
      int i=0;
      for (  byte b : header) {
        if (b != full[i++])     return false;
      }
      return true;
    }

    boolean method2(byte[] magic,byte[] buffer){
      for (int i=0; i < magic.length; i++)   if (buffer[i] != magic[i])   return false;
      return true;
    }
}
