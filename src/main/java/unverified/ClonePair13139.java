package unverified;

public class ClonePair13139 {

    byte[] method1(String hexData){
      byte[] result=new byte[(hexData.length() + 1) / 2];
      String hexNumber=null;
      int stringOffset=0;
      int byteOffset=0;
      while (stringOffset < hexData.length()) {
        hexNumber=hexData.substring(stringOffset,stringOffset + 2);
        stringOffset+=2;
        result[byteOffset++]=(byte)Integer.parseInt(hexNumber,16);
      }
      return result;
    }

    byte[] method2(String string){
      byte[] ret;
      ret=new byte[string.length() / 2];
      for (int i=0; i < string.length(); i+=2)   ret[i / 2]=(byte)Integer.parseInt(string.substring(i,i + 2),16);
      return (ret);
    }
}
