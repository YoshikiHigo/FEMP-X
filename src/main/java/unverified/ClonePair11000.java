package unverified;

public class ClonePair11000 {

    int method1(byte[] buffer,byte[] searchbuffer,int startpos){
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

    int method2(byte[] bytes,byte[] pattern,int start){
      if (pattern.length == 0) {
        return start;
      }
      if (start > bytes.length) {
        return -1;
      }
      int last=bytes.length - pattern.length + 1;
      next:   for (; start < last; start++) {
        for (int i=0; i < pattern.length; i++) {
          if (bytes[start + i] != pattern[i]) {
            continue next;
          }
        }
        return start;
      }
      return -1;
    }
}
