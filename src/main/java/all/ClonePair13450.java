package all;

public class ClonePair13450 {

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

    byte[] method2(String s){
      byte[] bb=new byte[s.length() / 2];
      int ii;
      for (int i=0; i < bb.length; i++) {
        ii=Integer.parseInt(s.substring(i * 2,i * 2 + 2),16);
        if (ii > 127) {
          ii=ii - 256;
        }
        bb[i]=(byte)ii;
      }
      return bb;
    }
}
