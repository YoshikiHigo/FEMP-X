package all;

public class ClonePair7893 {

    boolean method1(byte[] src,int offs,String searchTxt){
      final int searchLen=searchTxt.length();
      for (int x=0; x < searchLen; x++) {
        final byte a=(byte)searchTxt.charAt(x);
        final byte b=src[offs + x];
        if (a != b) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] buffer,int offset,String str){
      for (int i=0; i < str.length(); i++) {
        if (((byte)(str.charAt(i))) != buffer[i + offset]) {
          return false;
        }
      }
      return true;
    }
}
