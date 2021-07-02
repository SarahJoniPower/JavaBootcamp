package bootcamp.data;

public class Process {
    double[] array;

    public Process(final double[] array) {
        this.array = array;
    }

    public Summary process() {
        int i = 0;
        double min = array[0];
        double max = array[0];
        double sum = 0;
        double count = 0;

        while (i <= array.length - 1) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
            sum += array[i];
            count++;
            i++;
        }

        double average = sum / array.length;
        return new Summary(min, max, count, sum, average);
    }

    public double getValue(int index) {
        return array[index];
    }
}
