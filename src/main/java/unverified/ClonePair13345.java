package unverified;

public class ClonePair13345 {

    byte[] method1(String hex){
      hex=hex.replaceAll(" ","");
      byte[] bytes=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        int num=Integer.parseInt(hex.substring(i,i + 2),16);
        bytes[i / 2]=(byte)num;
      }
      return bytes;
    }

    byte[] method2(String s){
      byte[] out=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        out[i / 2]=(byte)Integer.parseInt(s.substring(i,i + 2),16);
      }
      return out;
    }
}
