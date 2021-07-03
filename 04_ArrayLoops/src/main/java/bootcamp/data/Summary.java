package bootcamp.data;

public class Summary {
    private final double min;
    private final double max;
    private final double sum;
    private final double count;
    private final double average;

    public Summary(double min, double max, double sum, double count, double average) {
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.count = count;
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summary summary = (Summary) o;
        return min == summary.min &&
                max == summary.max &&
                sum == summary.sum &&
                count == summary.count &&
                average == summary.average;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getSum() {
        return sum;
    }

    public double getCount() {
        return count;
    }

    public double getAverage() {
        return average;
    }
}
