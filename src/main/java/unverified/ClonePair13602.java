package unverified;

public class ClonePair13602 {

    byte[] method1(String hexString){
      byte[] myByte=new byte[hexString.length() / 2];
      for (int x=0; x < hexString.length(); x+=2) {
        int intValue=Integer.parseInt(hexString.substring(x,x + 2),16);
        myByte[x / 2]=(byte)intValue;
      }
      return myByte;
    }

    byte[] method2(String string){
      byte[] ret;
      ret=new byte[string.length() / 2];
      for (int i=0; i < string.length(); i+=2)   ret[i / 2]=(byte)Integer.parseInt(string.substring(i,i + 2),16);
      return (ret);
    }
}
