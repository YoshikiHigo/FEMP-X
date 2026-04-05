package unverified;

public class ClonePair13657 {

    byte[] method1(String s){
      byte[] bytes=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        bytes[i / 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
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
