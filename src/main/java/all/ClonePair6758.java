package all;

public class ClonePair6758 {

    int method1(int fieldType,int fieldSubType,int fieldScale){
      if (fieldScale < 0) {
    switch (fieldType) {
    case 7:case 8:case 16:case 27:      return fieldSubType != 2 ? 2 : 3;
      }
    }
    switch (fieldType) {
    case 7:  return 5;
    case 8:return 4;
    case 11:case 27:return 8;
    case 10:return 6;
    case 14:return 1;
    case 37:return 12;
    case 35:return 93;
    case 13:return 92;
    case 12:return 91;
    case 16:return fieldSubType != 2 ? 2 : 3;
    case 261:if (fieldSubType < 0) {
    return 2004;
    }
    if (fieldSubType == 0) {
    return -4;
    }
    if (fieldSubType == 1) {
    return 2005;
    }
    return fieldSubType != 1 ? 1111 : -1;
    case 9:return 1111;
    }
    return 0;
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
