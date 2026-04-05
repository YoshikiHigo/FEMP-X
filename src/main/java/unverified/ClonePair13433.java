package unverified;

public class ClonePair13433 {

    byte[] method1(String hexString){
      byte[] bytes=new byte[hexString.length() / 2];
      for (int i=0; i < hexString.length(); i=i + 2) {
        String hex=hexString.substring(i,i + 2);
        int b=Integer.parseInt(hex,16);
        bytes[i / 2]=b > 128 ? (byte)(b - 256) : (byte)b;
      }
      return bytes;
    }

    byte[] method2(String hexString){
      byte[] myByte=new byte[hexString.length() / 2];
      for (int x=0; x < hexString.length(); x+=2) {
        int intValue=Integer.parseInt(hexString.substring(x,x + 2),16);
        myByte[x / 2]=(byte)intValue;
      }
      return myByte;
    }
}
