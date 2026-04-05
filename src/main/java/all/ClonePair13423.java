package all;

public class ClonePair13423 {

    byte[] method1(String csHex){
      byte[] arrByteValue=new byte[csHex.length() / 2];
      for (int i=0, j=0; i < csHex.length(); j++) {
        String csDigit="0x" + csHex.charAt(i++) + csHex.charAt(i++);
        int nVal=Integer.decode(csDigit).intValue();
        arrByteValue[j]=(byte)nVal;
      }
      return arrByteValue;
    }

    byte[] method2(String s){
      byte[] b=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        String j=String.valueOf(s.charAt(i));
        j=j + String.valueOf(s.charAt(i + 1));
        b[i / 2]=(byte)Integer.parseInt(j,16);
      }
      return b;
    }
}
