package cn.thoughtworks.school.core;

public class Score {

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

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isBigger(Score score) {
        return this.score > score.score;
    }
}
