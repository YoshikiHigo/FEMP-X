package all;

public class ClonePair3995 {

    double[] method1(double[] initialTime,double stepSize,int timeLength){
      double[] stepTime=new double[timeLength];
      int counter=1;
      stepTime[0]=initialTime[0];
      double newStep;
      double stop=initialTime[initialTime.length - 1] - (stepSize / 1000);
      while (stepTime[counter - 1] < stop) {
        if ((stepTime[counter - 1] + stepSize) > initialTime[initialTime.length - 1]) {
          newStep=stepSize - (stepTime[counter - 1] + stepSize - initialTime[initialTime.length - 1]);
        }
     else {
          newStep=stepSize;
        }
        stepTime[counter]=stepTime[counter - 1] + newStep;
        counter++;
      }
      return stepTime;
    }

    double[] method2(double[] inputTime,double stepSize,int timeLength){
      double[] stepTime=new double[timeLength];
      stepTime[0]=inputTime[0];
      double tFinal=inputTime[inputTime.length - 1];
      double stop=tFinal - (stepSize / 1000);
      System.out.println("Creating Time Steps...");
      double newStep;
      int counter=0;
      while (stepTime[counter] < stop) {
        if ((stepTime[counter] + stepSize) > tFinal) {
          newStep=tFinal - stepTime[counter];
        }
     else {
          newStep=stepSize;
        }
        stepTime[counter + 1]=stepTime[counter] + newStep;
        counter++;
      }
      return stepTime;
    }
}
