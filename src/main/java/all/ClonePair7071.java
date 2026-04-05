package all;

public class ClonePair7071 {

    int method1(byte[] bytes,int pos){
      if (bytes.length < pos + 4) {
        return 0;
      }
      return (((bytes[pos + 0] & 0xff) >> 0) + ((bytes[pos + 1] & 0xff) << 8) + ((bytes[pos + 2] & 0xff) << 16)+ ((bytes[pos + 3] & 0xff) << 24));
    }

    int method2(byte[] data,int off){
      int ret=0;
      for (int i=0; (i < 4 && i + off < data.length); i++) {
        int tmp_i=data[off + i];
        ret|=((tmp_i & 0xFF) << 8 * i);
      }
      return ret;
    }
}
