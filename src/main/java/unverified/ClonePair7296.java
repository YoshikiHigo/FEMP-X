package unverified;

public class ClonePair7296 {

    int method1(byte[] data,int offset){
      int l=0;
      for (int k=0; k < 4; k++) {
        l=(l << 8) | (data[offset++] & 0xFF);
      }
      return l;
    }

    int method2(byte[] bytes,int offset){
      int b=0;
      for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j + offset] & 0xFF);
      return b;
    }
}
