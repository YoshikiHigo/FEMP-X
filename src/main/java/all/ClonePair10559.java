package all;

public class ClonePair10559 {

    int method1(int colorcount){
      if (colorcount <= 2) {
        return 1;
      }
      if (colorcount <= 4) {
        return 2;
      }
      if (colorcount <= 16) {
        return 4;
      }
      return 8;
    }

    int method2(int colorcount){
      if (colorcount <= 2)   return 1;
      if (colorcount <= 4)   return 2;
      if (colorcount <= 16)   return 4;
      return 8;
    }
}
