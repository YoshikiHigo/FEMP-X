package all;

public class ClonePair10993 {

    int method1(byte[] tok,byte[] sub,int p){
      final int sl=sub.length;
      if (sl == 0)   return 0;
      final int tl=tok.length - sl;
      if (p > tl)   return -1;
      for (int t=p; t <= tl; t++) {
        int s=0;
        while (sub[s] == tok[t + s])     if (++s == sl)     return t;
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
