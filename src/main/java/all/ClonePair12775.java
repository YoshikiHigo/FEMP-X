package all;

public class ClonePair12775 {

    int method1(String str,byte[] outbuf,int offset){
      for (int i=0; i < str.length(); i++) {
        outbuf[offset]=(byte)str.charAt(i);
        offset++;
      }
      return offset;
    }

    int method2(String str,byte[] outbuf,int offset){
      char[] chars=str.toCharArray();
      for (int i=0; i < chars.length; i++) {
        outbuf[offset]=(byte)chars[i];
        offset++;
      }
      return offset;
    }
}
