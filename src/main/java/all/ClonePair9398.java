package all;

public class ClonePair9398 {

    int[] method1(int[] img,int width,int height){
      final int[] tmp_img=new int[width * height];
      for (int y=0; y < height; y++)   for (int x=0; x < width; x++)   tmp_img[y * width + x]=img[(height - y - 1) * width + x];
      return tmp_img;
    }

    int[] method2(int[] pixels,int width,int height){
      int max=width * height;
      int[] pixelArray=new int[width * height];
      int[][] kernel={{1,4,7,4,1},{4,16,26,16,4},{7,26,41,26,7},{4,16,26,16,4},{1,4,7,4,1}};
      for (int x=0; x < width; x++) {
        for (int y=0; y < height; y++) {
          int i=y * width + x;
          int[][] conv=new int[5][5];
          for (int j=-2; j <= 2; j++) {
            if (i + j - 2 * width > 0)         conv[j + 2][0]=pixels[i + j - 2 * width] & 0x000000ff;
            if (i + j - width > 0)         conv[j + 2][1]=pixels[i + j - width] & 0x000000ff;
            if ((i + j > 0) && (i + j < max))         conv[j + 2][2]=pixels[i + j] & 0x000000ff;
            if (i + j + width < max)         conv[j + 2][3]=pixels[i + j + width] & 0x000000ff;
            if (i + j + 2 * width < max)         conv[j + 2][4]=pixels[i + j + 2 * width] & 0x000000ff;
          }
          int gray=0;
          for (int k=0; k < 5; k++) {
            for (int l=0; l < 5; l++) {
              gray+=(conv[k][l] * kernel[k][l]);
            }
          }
          gray/=273;
          if (gray >= 255)       pixelArray[i]=0xffffffff;
     else       pixelArray[i]=0xff000000 | gray << 16 | gray << 8 | gray;
        }
      }
      return pixelArray;
    }
}
