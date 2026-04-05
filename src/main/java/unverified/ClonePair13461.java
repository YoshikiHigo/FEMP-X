package unverified;

public class ClonePair13461 {

    byte[] method1(String iStr){
      byte[] outArr=new byte[iStr.length() / 2];
      for (int i=0; i < iStr.length(); i+=2) {
        String hex=iStr.substring(i,i + 2);
        byte b=(byte)((int)Integer.parseInt(hex,16) & 0xFF);
        outArr[i / 2]=b;
      }
      return outArr;
    }

    byte[] method2(String hexString){
      int len=hexString.length();
      byte[] bytes=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
        bytes[i / 2]=(byte)value;
      }
      return bytes;
    }
}
