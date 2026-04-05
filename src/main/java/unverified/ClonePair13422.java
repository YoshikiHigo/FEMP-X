package unverified;

public class ClonePair13422 {

    byte[] method1(String csHex){
      byte[] arrByteValue=new byte[csHex.length() / 2];
      for (int i=0, j=0; i < csHex.length(); j++) {
        String csDigit="0x" + csHex.charAt(i++) + csHex.charAt(i++);
        int nVal=Integer.decode(csDigit).intValue();
        arrByteValue[j]=(byte)nVal;
      }
      return arrByteValue;
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
