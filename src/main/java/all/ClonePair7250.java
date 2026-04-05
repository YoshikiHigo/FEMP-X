package all;

public class ClonePair7250 {

    String method1(int start,int end,byte[] buf,boolean stopToZero){
      String str="";
      for (int i=start; i < end && (buf[i] != 0 || !stopToZero); i++) {
        if (buf[i] != 0)     str+=(char)buf[i];
      }
      return str;
    }

    String method2(int start,int end,byte[] buf,boolean stopToZero){
      String str="";
      for (int i=start; i < end && (buf[i] != 0 || !stopToZero); i++) {
        if (buf[i] != 0) {
          str+=(char)buf[i];
        }
      }
      return str;
    }
}
