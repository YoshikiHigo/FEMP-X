package unverified;

public class ClonePair13448 {

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

    byte[] method2(String device){
      int len=device.length() / 2;
      byte[] data=new byte[len];
      for (int i=len - 1; i >= 0; i--) {
        data[i]=(byte)Integer.parseInt(device.substring(i * 2,i * 2 + 2),16);
      }
      return data;
    }
}
