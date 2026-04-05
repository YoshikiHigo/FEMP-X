package all;

public class ClonePair13449 {

    byte[] method1(String rendered){
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
