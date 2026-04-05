package all;

public class ClonePair13482 {

    byte[] method1(String hexString){
      int len=hexString.length();
      byte[] bytearray=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        String nstring="0x" + hexString.substring(i,i + 2);
        int ascii=Integer.decode(nstring);
        bytearray[i / 2]=(byte)ascii;
      }
      return bytearray;
    }

    byte[] method2(String string){
      byte[] ret;
      ret=new byte[string.length() / 2];
      for (int i=0; i < string.length(); i+=2)   ret[i / 2]=(byte)Integer.parseInt(string.substring(i,i + 2),16);
      return (ret);
    }
}
