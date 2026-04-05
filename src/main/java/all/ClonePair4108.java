package all;

public class ClonePair4108 {

    boolean method1(String[] termos1,String[] termos2){
      if (termos1.length != termos2.length) {
        return false;
      }
      for (int i=0; i < termos1.length; i++) {
        if (!termos1[i].equals(termos2[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String[] strings1,String[] strings2){
      if (strings1.length != strings2.length)   return false;
      for (int i=0; i < strings1.length; ++i)   if (!strings1[i].equals(strings2[i]))   return false;
      return true;
    }
}
