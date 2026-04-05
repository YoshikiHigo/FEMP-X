package all;

public class ClonePair12671 {

    boolean method1(byte[] raw,int offset,int size){
      if ((size & 3) != 0 || size <= 4) {
        return false;
      }
      long chksum=0;
      int count=size - 4;
      long check=-1;
      int i;
      for (i=offset; i < count; i+=4) {
        check=raw[i] & 0xff;
        check|=raw[i + 1] << 8 & 0xff00;
        check|=raw[i + 2] << 0x10 & 0xff0000;
        check|=raw[i + 3] << 0x18 & 0xff000000;
        chksum^=check;
      }
      check=raw[i] & 0xff;
      check|=raw[i + 1] << 8 & 0xff00;
      check|=raw[i + 2] << 0x10 & 0xff0000;
      check|=raw[i + 3] << 0x18 & 0xff000000;
      return check == chksum;
    }

    boolean method2(byte[] raw,int offset,int size){
      if ((size & 3) != 0 || size <= 4)   return false;
      long chksum=0;
      int count=size - 4;
      long check=-1;
      int i;
      for (i=offset; i < count; i+=4) {
        check=raw[i] & 0xff;
        check|=raw[i + 1] << 8 & 0xff00;
        check|=raw[i + 2] << 0x10 & 0xff0000;
        check|=raw[i + 3] << 0x18 & 0xff000000;
        chksum^=check;
      }
      check=raw[i] & 0xff;
      check|=raw[i + 1] << 8 & 0xff00;
      check|=raw[i + 2] << 0x10 & 0xff0000;
      check|=raw[i + 3] << 0x18 & 0xff000000;
      return check == chksum;
    }
}
