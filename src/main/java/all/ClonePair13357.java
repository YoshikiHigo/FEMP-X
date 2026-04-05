package all;

public class ClonePair13357 {

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
      byte[] b=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        String j=String.valueOf(s.charAt(i));
        j=j + String.valueOf(s.charAt(i + 1));
        b[i / 2]=(byte)Integer.parseInt(j,16);
      }
      return b;
    }
}
