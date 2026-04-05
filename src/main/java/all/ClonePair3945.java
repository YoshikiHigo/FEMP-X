package all;

public class ClonePair3945 {

    int method1(byte[] first,byte[] second){
      if (first == second) {
        return 0;
      }
      for (int i=0; i < first.length && i < second.length; i++) {
        if (first[i] != second[i]) {
          return Integer.signum(first[i] - second[i]);
        }
      }
      return Integer.signum(first.length - second.length);
    }

    int method2(byte[] data1,byte[] data2){
      int len=Math.min(data1.length,data2.length);
      for (int i=0; i < len; i++) {
        byte b=data1[i];
        byte b2=data2[i];
        if (b != b2) {
          return b > b2 ? 1 : -1;
        }
      }
      int c=data1.length - data2.length;
      return c == 0 ? 0 : (c < 0 ? -1 : 1);
    }
}
