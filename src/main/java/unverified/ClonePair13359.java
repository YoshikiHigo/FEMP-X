package unverified;

public class ClonePair13359 {

    byte[] method1(String hex){
      hex=hex.replaceAll(" ","");
      byte[] bytes=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        int num=Integer.parseInt(hex.substring(i,i + 2),16);
        bytes[i / 2]=(byte)num;
      }
      return bytes;
    }

    byte[] method2(String byteString){
      byte[] result=new byte[byteString.length() / 2];
      for (int i=0; i < byteString.length(); i+=2) {
        String toParse=byteString.substring(i,i + 2);
        result[i / 2]=(byte)Integer.parseInt(toParse,16);
      }
      return result;
    }
}
