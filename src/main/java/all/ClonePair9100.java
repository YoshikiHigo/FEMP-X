package all;

public class ClonePair9100 {

    int method1(int length){
      if (length >= 0) {
        if (length < 128) {
          return 1;
        }
     else     if (length < 256) {
          return 2;
        }
     else     if (length < 65536) {
          return 3;
        }
     else     if (length < 16777216) {
          return 4;
        }
     else {
          return 5;
        }
      }
     else {
        return 5;
      }
    }

    int method2(int length){
      if (length < 0) {
        return 5;
      }
     else   if (length < 0x80) {
        return 1;
      }
     else   if (length <= 0xFF) {
        return 2;
      }
     else   if (length <= 0xFFFF) {
        return 3;
      }
     else   if (length <= 0xFFFFFF) {
        return 4;
      }
      return 5;
    }
}
