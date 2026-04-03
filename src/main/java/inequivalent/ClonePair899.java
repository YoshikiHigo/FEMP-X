package inequivalent;

public class ClonePair899 {

    double[] method1(double[] data, int length) {
        double[] ans = new double[length];
        int debut;
        if (length - data.length < 0) debut = data.length - length;
        else debut = 0;
        System.arraycopy(data, debut, ans, -data.length + length + debut, data.length - debut);
        return (ans);
    }

    double[] method2(double[] data, int length) {
        double[] ans = new double[length];
        int debut;
        if (length - data.length < 0) debut = data.length - length;
        else debut = 0;
        System.arraycopy(data, 0, ans, 0, data.length - debut);
        return (ans);
    }
}
