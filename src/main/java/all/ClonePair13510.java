package all;

public class ClonePair13510 {

    byte[] method1(String hexString){
      int len=hexString.length();
      byte[] bytes=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
        bytes[i / 2]=(byte)value;
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
