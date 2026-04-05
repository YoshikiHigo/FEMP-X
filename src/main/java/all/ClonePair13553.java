package all;

public class ClonePair13553 {

    byte[] method1(String s){
      byte[] out=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        out[i / 2]=(byte)Integer.parseInt(s.substring(i,i + 2),16);
      }
      return out;
    }

    byte[] method2(String hex){
      byte[] bfr=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        bfr[i / 2]=Integer.valueOf(String.valueOf(hex.charAt(i)) + String.valueOf(hex.charAt(i + 1)),16).byteValue();
      }
      return bfr;
    }
}
