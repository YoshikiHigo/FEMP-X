package all;

public class ClonePair8078 {

    int method1(int value){
      if (value < 128) {
        return 1;
      }
     else   if (value < 16384) {
        return 2;
      }
     else   if (value < 2097152) {
        return 3;
      }
     else   if (value < 268435456) {
        return 4;
      }
     else {
        return 5;
      }
    }

    int method2(int n){
      assert (n >= 0);
      if (n < 128) {
        return 1;
      }
     else   if (n < 16384) {
        return 2;
      }
     else   if (n < 2097152) {
        return 3;
      }
     else   if (n < 268435456) {
        return 4;
      }
     else {
        return 5;
      }
    }
}
