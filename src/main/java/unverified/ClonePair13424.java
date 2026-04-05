package unverified;

public class ClonePair13424 {

    byte[] method1(String csHex){
      byte[] arrByteValue=new byte[csHex.length() / 2];
      for (int i=0, j=0; i < csHex.length(); j++) {
        String csDigit="0x" + csHex.charAt(i++) + csHex.charAt(i++);
        int nVal=Integer.decode(csDigit).intValue();
        arrByteValue[j]=(byte)nVal;
      }
      return arrByteValue;
    }

    byte[] method2(String hex){
      byte[] bfr=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        bfr[i / 2]=Integer.valueOf(String.valueOf(hex.charAt(i)) + String.valueOf(hex.charAt(i + 1)),16).byteValue();
      }
      return bfr;
    }
}
