package bootcamp.data;

public class Processor {
    double[] array;

    public Processor(double[] array) {
        this.array = array.clone();
    }

    public Summary process() {
        int i = 0;
        double min = array[0];
        double max = array[0];
        double sum = 0;
        double count = array.length;

        while ( i <= array.length - 1) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
            sum += array[i];
            i++;
        }
        double average = sum / array.length;
        return new Summary(min, max, sum, count, average);
    }

    public double getValue(int index) {
        return array[index];
    }
}
