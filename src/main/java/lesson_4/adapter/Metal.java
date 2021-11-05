package lesson_4.adapter;

public abstract class Metal {
    private long weight;

    public Metal(long weight) {
        this.weight = weight;
    }

    public long getWeight(){
        return weight;
    }
}
