package unverified;

public class ClonePair13430 {

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
      int len=hexString.length();
      byte[] bytearray=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        String nstring="0x" + hexString.substring(i,i + 2);
        int ascii=Integer.decode(nstring);
        bytearray[i / 2]=(byte)ascii;
      }
      return bytearray;
    }
}
