package all;

public class ClonePair13414 {

    byte[] method1(String csHex){
      byte[] arrByteValue=new byte[csHex.length() / 2];
      for (int i=0, j=0; i < csHex.length(); j++) {
        String csDigit="0x" + csHex.charAt(i++) + csHex.charAt(i++);
        int nVal=Integer.decode(csDigit).intValue();
        arrByteValue[j]=(byte)nVal;
      }
      return arrByteValue;
    }

    byte[] method2(String hexString){
      int len=hexString.length();
      byte[] bytearray=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        String nstring="0x" + hexString.substring(i,i + 2);
        int ascii=Integer.decode(nstring);
        bytearray[i / 2]=(byte)ascii;
      }
      return bytearray;
    }
}
