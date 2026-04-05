package all;

public class ClonePair9510 {

    boolean method1(int[] v){
      if (v.length <= 6)   return false;
     else   if ((v.length == 7) && (v[0] > 0) && (v[1] > v[0])&& (v[2] > v[1])&& (v[3] > v[2])&& (v[4] > v[3])&& (v[5] > v[4])&& (v[6] > v[5]))   return true;
     else   if ((v.length == 8) && (v[0] > 0) && (v[1] > v[0])&& (v[2] > v[1])&& (v[3] > v[2])&& (v[4] > v[3])&& (v[5] > v[4])&& (v[6] > v[5])&& (v[7] > v[6]))   return true;
     else   return false;
    }

    boolean method2(int[] v){
      if (v.length <= 4)   return false;
     else   if ((v.length == 5) && (v[0] > 0) && (v[1] > v[0])&& (v[2] > v[1])&& (v[3] > v[2])&& (v[4] > v[3]))   return true;
     else   if ((v.length == 6) && (v[0] > 0) && (v[1] > v[0])&& (v[2] > v[1])&& (v[3] > v[2])&& (v[4] > v[3])&& (v[5] > v[4]))   return true;
     else   return false;
    }
}
