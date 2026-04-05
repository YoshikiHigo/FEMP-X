package all;

public class ClonePair7123 {

    String method1(byte buf[]){
      StringBuffer sb=new StringBuffer(2 * buf.length);
      for (int i=0; i < buf.length; i++) {
        int h=(buf[i] & 0xf0) >> 4;
        int l=(buf[i] & 0x0f);
        sb.append(new Character((char)((h > 9) ? 'a' + h - 10 : '0' + h)));
        sb.append(new Character((char)((l > 9) ? 'a' + l - 10 : '0' + l)));
      }
      return sb.toString();
    }

    String method2(byte buf[]){
      StringBuffer sb=new StringBuffer(2 * buf.length);
      for (int i=0; i < buf.length; i++) {
        int h=(buf[i] & 0xf0) >> 4;
        int l=buf[i] & 0xf;
        sb.append(new Character((char)(h <= 9 ? 48 + h : (97 + h) - 10)));
        sb.append(new Character((char)(l <= 9 ? 48 + l : (97 + l) - 10)));
      }
      return sb.toString();
    }
}
