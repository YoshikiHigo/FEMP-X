package all;

public class ClonePair6787 {

    int method1(int jdbcDataType,int precision,int lenght){
    switch (jdbcDataType) {
    case 2:case 3:    return precision;
    case 1:case 12:  return lenght;
    case 6:return 7;
    case 8:return 15;
    case 4:return 10;
    case 5:return 5;
    case 91:return 10;
    case 92:return 8;
    case 93:return 19;
    default:return 0;
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
