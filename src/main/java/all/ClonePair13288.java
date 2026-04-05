package all;

public class ClonePair13288 {

    byte[] method1(String no){
      byte[] number=new byte[no.length() / 2];
      int i;
      for (i=0; i < no.length(); i+=2) {
        int j=Integer.parseInt(no.substring(i,i + 2),16);
        number[i / 2]=(byte)(j & 0x000000ff);
      }
      return number;
    }

    byte[] method2(String hex){
      hex=hex.replaceAll(" ","");
      byte[] bytes=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        int num=Integer.parseInt(hex.substring(i,i + 2),16);
        bytes[i / 2]=(byte)num;
      }
      return bytes;
    }
}
