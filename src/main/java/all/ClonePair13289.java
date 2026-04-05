package all;

public class ClonePair13289 {

    byte[] method1(String no){
      byte[] number=new byte[no.length() / 2];
      int i;
      for (i=0; i < no.length(); i+=2) {
        int j=Integer.parseInt(no.substring(i,i + 2),16);
        number[i / 2]=(byte)(j & 0x000000ff);
      }
      return number;
    }

    byte[] method2(String csHex){
      byte[] arrByteValue=new byte[csHex.length() / 2];
      for (int i=0, j=0; i < csHex.length(); j++) {
        String csDigit="0x" + csHex.charAt(i++) + csHex.charAt(i++);
        int nVal=Integer.decode(csDigit).intValue();
        arrByteValue[j]=(byte)nVal;
      }
      return arrByteValue;
    }
}
