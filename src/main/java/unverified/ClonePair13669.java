package unverified;

public class ClonePair13669 {

    byte[] method1(String s){
      byte[] b=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        String j=String.valueOf(s.charAt(i));
        j=j + String.valueOf(s.charAt(i + 1));
        b[i / 2]=(byte)Integer.parseInt(j,16);
      }
      return b;
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
