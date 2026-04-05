package all;

public class ClonePair13568 {

    byte[] method1(String string){
      byte[] bytes=new byte[string.length() / 2];
      int pos=0;
      byte upper, lower;
      int buffer;
      for (int i=0; (i + 1) < string.length(); i+=2) {
        upper=Byte.decode("0x0" + string.charAt(i));
        lower=Byte.decode("0x0" + string.charAt(i + 1));
        buffer=(upper << 4) | lower;
        bytes[pos++]=(byte)buffer;
      }
      return bytes;
    }

    byte[] method2(String str){
      char[] chars=str.toCharArray();
      int chars_length=chars.length - chars.length % 2;
      byte[] res=new byte[chars_length / 2];
      for (int i=0; i < chars_length; i+=2) {
        String b=new String(chars,i,2);
        res[i / 2]=(byte)Integer.parseInt(b,16);
      }
      return (res);
    }
}
