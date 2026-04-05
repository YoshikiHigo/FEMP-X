package all;

public class ClonePair10455 {

    int method1(byte[] bytes,int offset,int length){
      int result=0;
      int end=offset + length;
      for (int i=offset; i < end; i++) {
        result=(result << 8) + (bytes[i] & 0xFF);
      }
      return result;
    }

    int method2(byte[] content,int index,int size){
      int result=0;
      for (int i=0; i < size; i++) {
        result=(result << 8) + (content[index + i] & 0xff);
      }
      return result;
    }
}
