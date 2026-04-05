package unverified;

public class ClonePair13259 {

    byte[] method1(String txt){
      int i=0;
      int v=0;
      byte[] value=null;
      txt=txt.trim();
      if (txt.equals("") || (txt == null)) {
        value=new byte[0];
      }
     else {
        while ((i=txt.indexOf(" ")) >= 0) {
          txt=txt.substring(0,i) + txt.substring(i + 1,txt.length());
        }
        value=new byte[txt.length() / 2];
        for (i=0; i < txt.length() / 2; i++) {
          v=Integer.parseInt(txt.substring(i * 2,i * 2 + 2),16);
          value[i]=(byte)(v % 0x100);
        }
      }
      return value;
    }

    byte[] method2(String string){
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
}
