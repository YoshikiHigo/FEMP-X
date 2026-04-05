package all;

public class ClonePair13607 {

    byte[] method1(String hexString){
      byte[] myByte=new byte[hexString.length() / 2];
      for (int x=0; x < hexString.length(); x+=2) {
        int intValue=Integer.parseInt(hexString.substring(x,x + 2),16);
        myByte[x / 2]=(byte)intValue;
      }
      return myByte;
    }

    byte[] method2(String byteString){
      byte result[]=new byte[byteString.length() / 2];
      for (int i=0; i < byteString.length(); i+=2) {
        String toParse=byteString.substring(i,i + 2);
        result[i / 2]=(byte)Integer.parseInt(toParse,16);
      }
      return result;
    }
}
