package all;

public class ClonePair2327 {

    boolean method1(byte[] magic,byte[] buffer){
      for (int i=0; i < magic.length; i++)   if (buffer[i] != magic[i])   return false;
      return true;
    }

    boolean method2(byte[] first,byte[] seond){
      boolean startsWith=true;
      int i=0;
      for (  byte toComp : first) {
        if (toComp != seond[i++]) {
          startsWith=false;
          break;
        }
      }
      return startsWith;
    }
}
