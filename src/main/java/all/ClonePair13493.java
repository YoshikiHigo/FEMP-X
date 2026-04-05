package all;

public class ClonePair13493 {

    byte[] method1(String hexString){
      int len=hexString.length();
      byte[] bytearray=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        String nstring="0x" + hexString.substring(i,i + 2);
        int ascii=Integer.decode(nstring);
        bytearray[i / 2]=(byte)ascii;
      }
      return bytearray;
    }

    byte[] method2(String value){
      byte[] data=new byte[value.length() / 2];
      for (int i=0; i < value.length(); i+=2) {
        String s="0x" + value.substring(i,i + 2);
        data[i / 2]=(byte)(0x000000FF & Integer.decode(s));
      }
      return data;
    }
}
