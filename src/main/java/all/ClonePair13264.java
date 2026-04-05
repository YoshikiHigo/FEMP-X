package all;

public class ClonePair13264 {

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
