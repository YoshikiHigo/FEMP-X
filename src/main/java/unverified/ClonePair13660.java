package unverified;

public class ClonePair13660 {

    byte[] method1(String hexString){
      int length=hexString.length();
      byte[] data=new byte[length / 2];
      for (int i=0; i < length; i+=2) {
        data[i / 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
      }
      return data;
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
