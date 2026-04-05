package unverified;

public class ClonePair4623 {

    boolean method1(int i){
    switch (i) {
    case 1:    return false;
    case 2:  return true;
    }
    if (i % 2 == 0) {
    return false;
    }
    for (int c=3; c <= Math.sqrt(i); c+=2) {
    if (i % c == 0) {
      return false;
    }
    }
    return true;
    }

    boolean method2(int N){
      if (N == 2 || N == 3)   return true;
      if (N == 1 || N % 2 == 0)   return false;
      for (int i=3; i * i <= N; i+=2)   if (N % i == 0)   return false;
      return true;
    }
}
