package all;

public class ClonePair97 {

    int[] method1(byte[] b,int off,int len){
      final int clen=len >>> 2;
      final int[] c=new int[clen];
      for (int i=0, bi=off; i < clen; i++, bi+=4) {
        c[i]=(b[bi] << 24) + ((b[bi + 1] & 0xFF) << 16) + ((b[bi + 2] & 0xFF) << 8)+ (b[bi + 3] & 0xFF);
      }
      return c;
    }

    int[] method2(byte[] b,int off,int len){
      final int clen=len >>> 2;
      final int[] c=new int[clen];
      int i=0, bi=off;
      final int limit=clen - 7;
      for (; i < limit; i+=8, bi+=32) {
        c[i]=(b[bi] << 24) + ((b[bi + 1] & 0xFF) << 16) + ((b[bi + 2] & 0xFF) << 8)+ (b[bi + 3] & 0xFF);
        c[i + 1]=(b[bi + 4] << 24) + ((b[bi + 5] & 0xFF) << 16) + ((b[bi + 6] & 0xFF) << 8)+ (b[bi + 7] & 0xFF);
        c[i + 2]=(b[bi + 8] << 24) + ((b[bi + 9] & 0xFF) << 16) + ((b[bi + 10] & 0xFF) << 8)+ (b[bi + 11] & 0xFF);
        c[i + 3]=(b[bi + 12] << 24) + ((b[bi + 13] & 0xFF) << 16) + ((b[bi + 14] & 0xFF) << 8)+ (b[bi + 15] & 0xFF);
        c[i + 4]=(b[bi + 16] << 24) + ((b[bi + 17] & 0xFF) << 16) + ((b[bi + 18] & 0xFF) << 8)+ (b[bi + 19] & 0xFF);
        c[i + 5]=(b[bi + 20] << 24) + ((b[bi + 21] & 0xFF) << 16) + ((b[bi + 22] & 0xFF) << 8)+ (b[bi + 23] & 0xFF);
        c[i + 6]=(b[bi + 24] << 24) + ((b[bi + 25] & 0xFF) << 16) + ((b[bi + 26] & 0xFF) << 8)+ (b[bi + 27] & 0xFF);
        c[i + 7]=(b[bi + 28] << 24) + ((b[bi + 29] & 0xFF) << 16) + ((b[bi + 30] & 0xFF) << 8)+ (b[bi + 31] & 0xFF);
      }
      for (; i < clen; i++, bi+=4) {
        c[i]=(b[bi] << 24) + ((b[bi + 1] & 0xFF) << 16) + ((b[bi + 2] & 0xFF) << 8)+ (b[bi + 3] & 0xFF);
      }
      return c;
    }
}
