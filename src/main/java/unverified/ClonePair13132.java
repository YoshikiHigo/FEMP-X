package unverified;

public class ClonePair13132 {

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

    byte[] method2(String iStr){
      byte[] outArr=new byte[iStr.length() / 2];
      for (int i=0; i < iStr.length(); i+=2) {
        String hex=iStr.substring(i,i + 2);
        byte b=(byte)((int)Integer.parseInt(hex,16) & 0xFF);
        outArr[i / 2]=b;
      }
      return outArr;
    }
}
