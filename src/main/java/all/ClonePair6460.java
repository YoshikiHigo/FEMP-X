package all;

public class ClonePair6460 {

    long method1(byte[] bytes,int pos){
      if (bytes.length < 8) {
        return 0;
      }
      if ((bytes[pos + 7] & 0xff) < 0) {
        return 0x7fffffff;
      }
      long low=(((bytes[pos + 0] & 0xff) >> 0) + ((bytes[pos + 1] & 0xff) << 8) + ((bytes[pos + 2] & 0xff) << 16)+ ((bytes[pos + 3] & 0xff) << 24));
      long high=(((bytes[pos + 4] & 0xff) >> 0) + ((bytes[pos + 5] & 0xff) << 8) + ((bytes[pos + 6] & 0xff) << 16)+ ((bytes[pos + 7] & 0xff) << 24));
      return (high << 32) + (low & 0xffffffff);
    }

    long method2(byte[] bytes,int pos){
      if (bytes.length < 8) {
        return 0;
      }
      long low=(((bytes[pos + 0] & 0xff) >> 0) + ((bytes[pos + 1] & 0xff) << 8) + ((bytes[pos + 2] & 0xff) << 16)+ ((bytes[pos + 3] & 0xff) << 24));
      long high=(((bytes[pos + 4] & 0xff) >> 0) + ((bytes[pos + 5] & 0xff) << 8) + ((bytes[pos + 6] & 0xff) << 16)+ ((bytes[pos + 7] & 0xff) << 24));
      return (high << 32) + (low & 0xffffffff);
    }
}
