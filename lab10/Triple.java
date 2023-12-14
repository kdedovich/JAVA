public class Triple<T> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    @Override
    public String toString() {
        if (first == null || second == null || third == null) {
            throw new RuntimeException("Impossible to perform toString");
        }
        return String.format("first: " + first.toString() +
                "second: " + second.toString() + "third: " + third.toString());
    }

    public T min() {
        if (!(first instanceof Comparable)){
            throw new RuntimeException("Impossible to perform min");
        }
        T ans = first;
        if (((Comparable)second).compareTo(ans) < 0) {
            ans = second;
        }
        if (((Comparable)third).compareTo(ans) < 0) {
            ans = (T) third;
        }
        return ans;
    }

    public T max() {
        if (!(first instanceof Comparable)){
            throw new RuntimeException("Impossible to perform max");
        }
        T ans = first;
        if (((Comparable)second).compareTo(ans) > 0) {
            ans = second;
        }
        if (((Comparable)third).compareTo(ans) > 0) {
            ans = (T) third;
        }
        return ans;
    }

    double mean(){
        if (!(first instanceof Number)) {
            throw new RuntimeException("Impossible to perform mean");
        }
        return (((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue()) / 3;
    }

    boolean isEquals(Triple<T> other) {
        return first.equals(other.first) && second.equals(other.second) && third.equals(other.third);
    }
}
