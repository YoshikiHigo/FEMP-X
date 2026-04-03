package equivalent;

public class ClonePair4925 {
    float method1(float t) {
        if (t < (1 / 2.75)) {
            return 7.5625f * t * t;
        } else if (t < 2 / 2.75) {
            return 7.5625f * (t -= (1.5 / 2.75)) * t + .75f;
        } else if (t < 2.5 / 2.75) {
            return 7.5625f * (t -= (2.25 / 2.75)) * t + .9375f;
        } else {
            return 7.5625f * (t -= (2.625 / 2.75)) * t + .984375f;
        }
    }

    float method2(float pPercentage) {
        if (pPercentage < (1f / 2.75f)) {
            return 7.5625f * pPercentage * pPercentage;
        } else if (pPercentage < (2f / 2.75f)) {
            final float t = pPercentage - (1.5f / 2.75f);
            return 7.5625f * t * t + 0.75f;
        } else if (pPercentage < (2.5f / 2.75f)) {
            final float t = pPercentage - (2.25f / 2.75f);
            return 7.5625f * t * t + 0.9375f;
        } else {
            final float t = pPercentage - (2.625f / 2.75f);
            return 7.5625f * t * t + 0.984375f;
        }
    }
}
