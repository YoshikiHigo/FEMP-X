package all;

public class ClonePair13360 {

    byte[] method1(String hex){
      hex=hex.replaceAll(" ","");
      byte[] bytes=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        int num=Integer.parseInt(hex.substring(i,i + 2),16);
        bytes[i / 2]=(byte)num;
      }
      return bytes;
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
