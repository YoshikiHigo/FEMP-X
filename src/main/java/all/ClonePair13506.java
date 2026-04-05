package all;

public class ClonePair13506 {

    byte[] method1(String hexString){
      int len=hexString.length();
      byte[] bytes=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
        bytes[i / 2]=(byte)value;
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
