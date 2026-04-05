package unverified;

public class ClonePair13566 {

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

    byte[] method2(String device){
      int len=device.length() / 2;
      byte[] data=new byte[len];
      for (int i=len - 1; i >= 0; i--) {
        data[i]=(byte)Integer.parseInt(device.substring(i * 2,i * 2 + 2),16);
      }
      return data;
    }
}
