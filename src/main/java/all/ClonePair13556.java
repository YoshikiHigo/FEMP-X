package all;

public class ClonePair13556 {

    byte[] method1(String s){
      byte[] out=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        out[i / 2]=(byte)Integer.parseInt(s.substring(i,i + 2),16);
      }
      return out;
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
