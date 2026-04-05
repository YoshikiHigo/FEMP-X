package all;

public class ClonePair13653 {

    byte[] method1(String s){
      byte[] bytes=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        bytes[i / 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
      }
      return bytes;
    }

    byte[] method2(String hexString){
      int length=hexString.length();
      byte[] data=new byte[length / 2];
      for (int i=0; i < length; i+=2) {
        data[i / 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
      }
      return data;
    }
}
