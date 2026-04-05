package all;

public class ClonePair8003 {

    int[] method1(byte[] source){
      int[] output=new int[source.length >> 2];
      for (int i=0, j=0; i < source.length; i+=4, ++j) {
        output[j]=((source[i] & 0xff) << 24) | ((source[i + 1] & 0xff) << 16) | ((source[i + 2] & 0xff) << 8)| source[i + 3] & 0xff;
      }
      return output;
    }

    int[] method2(byte[] bytes){
      int[] ints=new int[bytes.length / 4];
      int i=0;
      for (int b=0; b < bytes.length; b+=4) {
        ints[i++]=(bytes[b] << 24) + ((bytes[b + 1] & 0xFF) << 16) + ((bytes[b + 2] & 0xFF) << 8)+ (bytes[b + 3] & 0xFF);
      }
      return ints;
    }
}
