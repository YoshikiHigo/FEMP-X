package all;

public class ClonePair13256 {

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

    byte[] method2(String rendered){
      byte[] result=new byte[rendered.length() / 2];
      for (int byteIndex=0; byteIndex < result.length; byteIndex++) {
        String byteStr=rendered.substring(byteIndex * 2,byteIndex * 2 + 2);
        int byteAsSignedInt=Integer.parseInt(byteStr,16);
        if (0X7f < byteAsSignedInt) {
          result[byteIndex]=(byte)byteAsSignedInt;
        }
     else {
          result[byteIndex]=(byte)(-0x100 + byteAsSignedInt);
        }
      }
      return result;
    }
}
