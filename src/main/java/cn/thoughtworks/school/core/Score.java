package cn.thoughtworks.school.core;

public class Score implements Comparable<Score> {

    private int score;

    private Score(int score) {
        this.score = score;
    }

    public static Score valueOf(String score) {
        return new Score(Integer.valueOf(score));
    }

    public static Score valueOf(int score) {
        return new Score(score);
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Score o) {
        return Integer.compare(score, o.score);
    }

    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
