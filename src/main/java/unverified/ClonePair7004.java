package unverified;

public class ClonePair7004 {

    int method1(int _i_1,int _i_2,int _i_3){
      if ((_i_1 == 0) && (_i_3 == 3)) {
        return 0;
      }
     else   if ((_i_2 == 2) && (_i_3 == 3)) {
        return 3;
      }
     else   if ((_i_1 == 1) && (_i_2 == 1) && (_i_3 == 3)) {
        return 4;
      }
     else   if ((_i_2 == 1) && (_i_3 == 4)) {
        return 4;
      }
     else   if ((_i_1 == 1 || _i_1 == 2) && (_i_2 == 3)) {
        return 5;
      }
     else   if (((_i_1 == 0) || (_i_1 == 1)) && (_i_2 == 4)) {
        return 7 - _i_1;
      }
     else   if ((_i_1 == 7) && (_i_2 == 2) && (_i_3 == 6)) {
        return 3;
      }
     else   if (_i_1 == 7) {
        return 7;
      }
     else   if (_i_2 == 7 && ((_i_3 == 1) || (_i_3 == 2))) {
        return _i_3;
      }
     else   if ((_i_2 == 5) || (_i_2 == 6)) {
        return 7 - _i_2;
      }
     else   if (((_i_1 == 5) || (_i_1 == 6)) && ((_i_2 == 1) || (_i_2 == 2))) {
        return 7 - _i_2;
      }
     else   if (((_i_1 == 5) || (_i_1 == 6)) && (_i_2 == 0) && (_i_3 == 0)) {
        return 1;
      }
     else   if ((_i_2 == 1) || (_i_2 == 2)) {
        return _i_2;
      }
     else {
        return 0;
      }
    }

    int method2(int length,int width,int height){
      int result=0;
      int i=0;
      int j=0;
      int k=0;
      while (i < length) {
        while (j < width) {
          while (k < height) {
            result++;
          }
        }
      }
      return result;
    }
}
