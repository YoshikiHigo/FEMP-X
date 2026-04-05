package all;

public class ClonePair13157 {

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

    byte[] method2(String byteString){
      byte[] result=new byte[byteString.length() / 2];
      for (int i=0; i < byteString.length(); i+=2) {
        String toParse=byteString.substring(i,i + 2);
        result[i / 2]=(byte)Integer.parseInt(toParse,16);
      }
      return result;
    }
}
