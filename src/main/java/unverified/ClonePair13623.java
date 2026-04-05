package unverified;

public class ClonePair13623 {

    byte[] method1(String string){
      byte[] ret;
      ret=new byte[string.length() / 2];
      for (int i=0; i < string.length(); i+=2)   ret[i / 2]=(byte)Integer.parseInt(string.substring(i,i + 2),16);
      return (ret);
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
