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
        return (this.min == summary.min || (Double.isNaN(this.min)) && Double.isNaN(summary.min))
                && (this.max == summary.max || (Double.isNaN(this.max)) && Double.isNaN(summary.max))
                && (this.sum == summary.sum || (Double.isNaN(this.sum)) && Double.isNaN(summary.sum))
                && (this.count == summary.count || (Double.isNaN(this.count)) && Double.isNaN(summary.count))
                && (this.average == summary.average || (Double.isNaN(this.average)) && Double.isNaN(summary.average));
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
