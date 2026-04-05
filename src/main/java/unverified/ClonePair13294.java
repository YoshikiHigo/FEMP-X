package unverified;

public class ClonePair13294 {

    byte[] method1(String no){
      byte[] number=new byte[no.length() / 2];
      int i;
      for (i=0; i < no.length(); i+=2) {
        int j=Integer.parseInt(no.substring(i,i + 2),16);
        number[i / 2]=(byte)(j & 0x000000ff);
      }
      return number;
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
