package mole;

public class PlayerInfo implements Comparable<PlayerInfo>{
	private String id;
    private int score;

    public PlayerInfo(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(PlayerInfo other) {
        return Integer.compare(other.score, this.score);
    }
}
