package all;

public class ClonePair6661 {

    int method1(long value,byte[] buf,int offset,int length){
      int i;
      String tmp=Long.toOctalString(value);
      int c=tmp.length();
      for (i=0; i < length && i < c; i++) {
        buf[offset + i]=(byte)tmp.charAt(i);
      }
      while (i < length) {
        buf[offset + i]=(byte)' ';
        i++;
      }
      return offset + length;
    }

    int method2(long value,byte[] buf,int offset,int length){
      int i;
      String tmp=Long.toString(value);
      int c=tmp.length();
      for (i=0; i < length && i < c; i++) {
        buf[offset + i]=(byte)tmp.charAt(i);
      }
      while (i < length) {
        buf[offset + i]=(byte)' ';
        i++;
      }
      return offset + length;
    }
}
