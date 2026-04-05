package all;

public class ClonePair13468 {

    byte[] method1(String iStr){
      byte[] outArr=new byte[iStr.length() / 2];
      for (int i=0; i < iStr.length(); i+=2) {
        String hex=iStr.substring(i,i + 2);
        byte b=(byte)((int)Integer.parseInt(hex,16) & 0xFF);
        outArr[i / 2]=b;
      }
      return outArr;
    }

    byte[] method2(String s){
      byte[] bytes=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        bytes[i / 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
      }
      return bytes;
    }
}
