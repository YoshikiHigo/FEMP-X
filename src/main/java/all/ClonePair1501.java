package all;

public class ClonePair1501 {

    String method1(byte[] b){
      StringBuffer sb=new StringBuffer(b.length);
      for (int i=0; i < b.length; i++) {
        byte c=b[i];
        if (c == 0) {
          break;
        }
        sb.append((char)c);
      }
      return sb.toString();
    }

    String method2(byte[] string){
      StringBuffer ret=new StringBuffer();
      for (int i=0; i < string.length; ++i) {
        if (string[i] == (byte)'\0') {
          return ret.toString();
        }
        ret.append((char)string[i]);
      }
      return ret.toString();
    }
}
