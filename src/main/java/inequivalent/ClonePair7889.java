package inequivalent;

public class ClonePair7889 {

    double[] method1(double[][] audio_samples) {
        if (audio_samples.length == 1) return audio_samples[0];
        double number_channels = audio_samples.length;
        int number_samples = audio_samples[0].length;
        double[] samples_mixed_down = new double[number_samples];
        for (int samp = 0; samp < number_samples; samp++) {
            double total_so_far = 0.0;
            for (int chan = 0; chan < number_channels; chan++) total_so_far += audio_samples[chan][samp];
            samples_mixed_down[samp] = total_so_far / number_channels;
        }
        return samples_mixed_down;
    }

    double[] method2(double[][] a) {
        double[] res = new double[a[0].length];
        for (int j = 0; j < a[0].length; j++) {
            double sum = 0;
            int counter = 0;
            for (int i = 0; i < a.length; i++) {
                if (Double.isNaN(a[i][j]) || Double.isInfinite(a[i][j])) {
                    continue;
                }
                sum += a[i][j];
                counter += 1;
            }
            if (counter == 0) {
                res[j] = Double.NaN;
            } else {
                res[j] = sum / ((Integer) counter).doubleValue();
            }
        }
        return res;
    }
}
