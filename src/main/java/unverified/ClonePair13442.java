package unverified;

public class ClonePair13442 {

    byte[] method1(String hexString){
      byte[] bytes=new byte[hexString.length() / 2];
      for (int i=0; i < hexString.length(); i=i + 2) {
        String hex=hexString.substring(i,i + 2);
        int b=Integer.parseInt(hex,16);
        bytes[i / 2]=b > 128 ? (byte)(b - 256) : (byte)b;
      }
      return bytes;
    }

    byte[] method2(String value){
      byte[] data=new byte[value.length() / 2];
      for (int i=0; i < value.length(); i+=2) {
        String s="0x" + value.substring(i,i + 2);
        data[i / 2]=(byte)(0x000000FF & Integer.decode(s));
      }
      return data;
    }
}
