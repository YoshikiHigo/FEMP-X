package all;

public class ClonePair13317 {

    byte[] method1(String hexString){
      if ((hexString.length() % 2) == 1) {
        return null;
      }
      try {
        int idx=0;
        byte result[]=new byte[hexString.length() / 2];
        for (int i=0; i < hexString.length(); i+=2) {
          String val=hexString.substring(i,i + 2);
          int b=Integer.parseInt(val,16);
          result[idx++]=(byte)b;
        }
        return result;
      }
     catch (  Exception ex) {
        return null;
      }
    }

    byte[] method2(String hexStr){
      if (hexStr.length() % 2 == 0) {
        byte[] bytes=new byte[hexStr.length() / 2];
        int i, j;
        try {
          for (i=0, j=0; j < hexStr.length(); i++, j+=2)       bytes[i]=(byte)Integer.parseInt(hexStr.substring(j,j + 2),16);
        }
     catch (    Exception e) {
          return null;
        }
        return bytes;
      }
     else   return null;
    }
}
