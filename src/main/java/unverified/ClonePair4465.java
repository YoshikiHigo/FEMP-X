package unverified;

public class ClonePair4465 {

    double method1(double[] polje){
      if (polje.length == 0)   return 0;
      double zbroj=0;
      for (int i=0; i < polje.length; i++) {
        zbroj+=polje[i];
      }
      return zbroj / polje.length;
    }

    double method2(double[] distData){
      double sumX=0;
      if (distData.length == 0)   return (0);
     else   sumX=distData[0];
      for (int i=1; i < distData.length; i++)   sumX+=distData[i];
      double result=(sumX / distData.length);
      return result;
    }
}
