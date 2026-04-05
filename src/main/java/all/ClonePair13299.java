package all;

public class ClonePair13299 {

    byte[] method1(String no){
      byte[] number=new byte[no.length() / 2];
      int i;
      for (i=0; i < no.length(); i+=2) {
        int j=Integer.parseInt(no.substring(i,i + 2),16);
        number[i / 2]=(byte)(j & 0x000000ff);
      }
      return number;
    }

    byte[] method2(String string){
      byte[] ret;
      ret=new byte[string.length() / 2];
      for (int i=0; i < string.length(); i+=2)   ret[i / 2]=(byte)Integer.parseInt(string.substring(i,i + 2),16);
      return (ret);
    }
}
