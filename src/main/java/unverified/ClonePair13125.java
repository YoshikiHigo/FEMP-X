package unverified;

public class ClonePair13125 {

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

    byte[] method2(String hex){
      hex=hex.replaceAll(" ","");
      byte[] bytes=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        int num=Integer.parseInt(hex.substring(i,i + 2),16);
        bytes[i / 2]=(byte)num;
      }
      return bytes;
    }
}
