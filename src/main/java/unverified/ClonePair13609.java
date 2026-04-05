package unverified;

public class ClonePair13609 {

    byte[] method1(String hexString){
      byte[] myByte=new byte[hexString.length() / 2];
      for (int x=0; x < hexString.length(); x+=2) {
        int intValue=Integer.parseInt(hexString.substring(x,x + 2),16);
        myByte[x / 2]=(byte)intValue;
      }
      return myByte;
    }

    byte[] method2(String hex){
      byte[] bfr=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        bfr[i / 2]=Integer.valueOf(String.valueOf(hex.charAt(i)) + String.valueOf(hex.charAt(i + 1)),16).byteValue();
      }
      return bfr;
    }
}
