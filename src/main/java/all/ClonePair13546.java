package all;

public class ClonePair13546 {

    byte[] method1(String s){
      byte[] out=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        out[i / 2]=(byte)Integer.parseInt(s.substring(i,i + 2),16);
      }
      return out;
    }

    byte[] method2(String s){
      byte[] bytes=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        bytes[i / 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
      }
      return bytes;
    }
}
