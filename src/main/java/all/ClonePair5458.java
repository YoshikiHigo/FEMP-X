package all;

public class ClonePair5458 {

    int[][][] method1(int[][][] imageData){
      int numRows=imageData.length;
      int numCols=imageData[0].length;
      int[][][] horizontalSobelImgData=new int[numRows][numCols][4];
      double[][] horizontalFilter=new double[3][3];
      horizontalFilter[0][0]=1;
      horizontalFilter[0][1]=2;
      horizontalFilter[0][2]=1;
      horizontalFilter[1][0]=0;
      horizontalFilter[1][1]=0;
      horizontalFilter[1][2]=0;
      horizontalFilter[2][0]=-1;
      horizontalFilter[2][1]=-2;
      horizontalFilter[2][2]=-1;
      for (int row=0; row < numRows - 3; row++) {
        for (int col=0; col < numCols - 3; col++) {
          horizontalSobelImgData[row][col][0]=imageData[row][col][0];
          for (int colorIndex=1; colorIndex < 4; colorIndex++) {
            horizontalSobelImgData[row][col][colorIndex]=Math.round(Math.round((((double)imageData[row][col][colorIndex] * horizontalFilter[0][0]) + ((double)imageData[row][col + 1][colorIndex] * horizontalFilter[0][1]) + ((double)imageData[row][col + 2][colorIndex] * horizontalFilter[0][2])+ ((double)imageData[row + 1][col][colorIndex] * horizontalFilter[1][0])+ ((double)imageData[row + 1][col + 1][colorIndex] * horizontalFilter[1][1])+ ((double)imageData[row + 1][col + 2][colorIndex] * horizontalFilter[1][2])+ ((double)imageData[row + 2][col][colorIndex] * horizontalFilter[2][0])+ ((double)imageData[row + 2][col + 1][colorIndex] * horizontalFilter[2][1])+ ((double)imageData[row + 2][col + 2][colorIndex] * horizontalFilter[2][2]))));
          }
        }
      }
      return horizontalSobelImgData;
    }

    int[][][] method2(int[][][] imageData){
      int numRows=imageData.length;
      int numCols=imageData[0].length;
      double[][] verticalFilter=new double[3][3];
      verticalFilter[0][0]=-1;
      verticalFilter[0][1]=0;
      verticalFilter[0][2]=1;
      verticalFilter[1][0]=-2;
      verticalFilter[1][1]=0;
      verticalFilter[1][2]=2;
      verticalFilter[2][0]=-1;
      verticalFilter[2][1]=0;
      verticalFilter[2][2]=1;
      int[][][] verticalSobelimageData=new int[numRows][numCols][4];
      for (int row=0; row < numRows - 3; row++) {
        for (int col=0; col < numCols - 3; col++) {
          verticalSobelimageData[row][col][0]=imageData[row][col][0];
          for (int colorIndex=1; colorIndex < 4; colorIndex++) {
            verticalSobelimageData[row][col][colorIndex]=Math.round(Math.round(((double)imageData[row][col][colorIndex] * verticalFilter[0][0]) + ((double)imageData[row][col + 1][colorIndex] * verticalFilter[0][1]) + ((double)imageData[row][col + 2][colorIndex] * verticalFilter[0][2])+ ((double)imageData[row + 1][col][colorIndex] * verticalFilter[1][0])+ ((double)imageData[row + 1][col + 1][colorIndex] * verticalFilter[1][1])+ ((double)imageData[row + 1][col + 2][colorIndex] * verticalFilter[1][2])+ ((double)imageData[row + 2][col][colorIndex] * verticalFilter[2][0])+ ((double)imageData[row + 2][col + 1][colorIndex] * verticalFilter[2][1])+ ((double)imageData[row + 2][col + 2][colorIndex] * verticalFilter[2][2])));
          }
        }
      }
      return verticalSobelimageData;
    }
}
