package all;

public class ClonePair7377 {

    double[][] method1(double[][] rotMatrix,double coords[][]){
      double[][] p_rot=new double[coords.length][3];
      for (int i=0; i < coords.length; ++i) {
        p_rot[i][0]=rotMatrix[0][0] * coords[i][0] + rotMatrix[0][1] * coords[i][1] + rotMatrix[0][2] * coords[i][2];
        p_rot[i][1]=rotMatrix[1][0] * coords[i][0] + rotMatrix[1][1] * coords[i][1] + rotMatrix[1][2] * coords[i][2];
        p_rot[i][2]=rotMatrix[2][0] * coords[i][0] + rotMatrix[2][1] * coords[i][1] + rotMatrix[2][2] * coords[i][2];
      }
      return p_rot;
    }

    double[][] method2(double[][] rotMatrix,double coords[][]){
      double[][] p_rot=new double[coords.length][3];
      for (int i=0; i < coords.length; ++i) {
        p_rot[i][0]=rotMatrix[0][0] * coords[i][0] + rotMatrix[0][1] * coords[i][1] + rotMatrix[0][2] * coords[i][2] + rotMatrix[0][3];
        p_rot[i][1]=rotMatrix[1][0] * coords[i][0] + rotMatrix[1][1] * coords[i][1] + rotMatrix[1][2] * coords[i][2] + rotMatrix[1][3];
        p_rot[i][2]=rotMatrix[2][0] * coords[i][0] + rotMatrix[2][1] * coords[i][1] + rotMatrix[2][2] * coords[i][2] + rotMatrix[2][3];
      }
      return p_rot;
    }
}
