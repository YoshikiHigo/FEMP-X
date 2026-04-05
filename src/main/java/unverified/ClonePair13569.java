package unverified;

public class ClonePair13569 {

    byte[] method1(String string){
      byte[] bytes=new byte[string.length() / 2];
      int pos=0;
      byte upper, lower;
      int buffer;
      for (int i=0; (i + 1) < string.length(); i+=2) {
        upper=Byte.decode("0x0" + string.charAt(i));
        lower=Byte.decode("0x0" + string.charAt(i + 1));
        buffer=(upper << 4) | lower;
        bytes[pos++]=(byte)buffer;
      }
      return bytes;
    }

    byte[] method2(String s){
      byte[] bb=new byte[s.length() / 2];
      int ii;
      for (int i=0; i < bb.length; i++) {
        ii=Integer.parseInt(s.substring(i * 2,i * 2 + 2),16);
        if (ii > 127) {
          ii=ii - 256;
        }
        bb[i]=(byte)ii;
      }
      return bb;
    }
}
