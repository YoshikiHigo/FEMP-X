package all;

public class ClonePair5147 {

    boolean method1(double[] vec1,double[] vec2){
      if (vec1.length != vec2.length)   return (false);
      for (int i=0; i < vec1.length; ++i)   if (vec1[i] != vec2[i])   return (false);
      return (true);
    }

    boolean method2(double[] arr1,double[] arr2){
      if (arr1.length != arr2.length)   return false;
      for (int index=0; index < arr1.length; index++)   if (arr1[index] != arr2[index])   return false;
      return true;
    }
}
