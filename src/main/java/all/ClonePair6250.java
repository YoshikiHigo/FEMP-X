package all;

public class ClonePair6250 {

    int method1(byte[] buf,int offset,boolean isBigEndian){
      int val;
      if (isBigEndian) {
        val=(buf[offset] << 8) & 0xFF00;
        val|=buf[++offset] & 0x00FF;
      }
     else {
        val=buf[offset] & 0x00FF;
        val|=(buf[++offset] << 8) & 0xFF00;
      }
      return val;
    }

    int method2(byte[] buffer,int offset,boolean bigEndian){
      if (bigEndian) {
        return ((buffer[offset] & 0xFF) << 8) | (buffer[offset + 1] & 0xFF);
      }
     else {
        return ((buffer[offset + 1] & 0xFF) << 8) | (buffer[offset] & 0xFF);
      }
    }
}
