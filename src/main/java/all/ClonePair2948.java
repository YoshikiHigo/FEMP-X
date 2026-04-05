package all;

public class ClonePair2948 {

    boolean method1(byte[] read_data){
      int i;
      for (i=0; i < read_data.length; i++) {
        if ((read_data[i] < 0) || (read_data[i] > 126)) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] bytes){
      for (int i=0; i < bytes.length; i++) {
        if ((bytes[i] < 0x20 || bytes[i] > 0x7e) && bytes[i] != 0x00) {
          return false;
        }
      }
      return true;
    }
}
