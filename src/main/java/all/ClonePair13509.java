package all;

public class ClonePair13509 {

    byte[] method1(String hexString){
      int len=hexString.length();
      byte[] bytes=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
        bytes[i / 2]=(byte)value;
      }
      return bytes;
    }

    byte[] method2(String hex){
      byte[] bfr=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        bfr[i / 2]=Integer.valueOf(String.valueOf(hex.charAt(i)) + String.valueOf(hex.charAt(i + 1)),16).byteValue();
      }
      return bfr;
    }
}
