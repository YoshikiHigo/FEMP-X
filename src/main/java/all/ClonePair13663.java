package all;

public class ClonePair13663 {

    byte[] method1(String hexString){
      int length=hexString.length();
      byte[] data=new byte[length / 2];
      for (int i=0; i < length; i+=2) {
        data[i / 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
      }
      return data;
    }

    byte[] method2(String hex){
      byte[] ret=new byte[hex.length() / 2];
      for (int i=0, len=hex.length(); i < len; i+=2) {
        int v=Integer.parseInt(hex.substring(i,i + 2),16);
        ret[i / 2]=(byte)v;
      }
      return ret;
    }
}
