package whiteRabbit;

public enum Music {
    POP("Поп"),
    RAP("Реп"),
    CLASSIC("Классическая"),
    ROCK("Рок");

    private String s;

    Music(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}
