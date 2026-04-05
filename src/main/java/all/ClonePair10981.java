package all;

public class ClonePair10981 {

    int method1(byte[] array,byte[] pattern,int start){
      int subPosition=0;
      for (int i=start; i < array.length; i++) {
        if (array[i] == pattern[subPosition]) {
          if (++subPosition == pattern.length) {
            return i - subPosition + 1;
          }
        }
     else {
          subPosition=0;
        }
      }
      return -1;
    }

    int method2(byte[] buffer,byte[] searchbuffer,int startpos){
      int retval=-1;
      for (int i=startpos; i < buffer.length - searchbuffer.length + 1; i++) {
        boolean found=true;
        for (int l=0; l < searchbuffer.length; l++) {
          if (buffer[i + l] != searchbuffer[l]) {
            found=false;
          }
        }
        if (found) {
          return i;
        }
      }
      return retval;
    }
}
