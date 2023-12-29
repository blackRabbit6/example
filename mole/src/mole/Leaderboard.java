package mole;

import java.util.List;
import java.util.ArrayList;

public class Leaderboard {
	 private List<PlayerInfo> leaderboard = new ArrayList<>();

	    public void addScore(PlayerInfo player) {
	        leaderboard.add(player);
	        leaderboard.sort(null);

	        if (leaderboard.size() > 10) {
	            leaderboard.remove(leaderboard.size() - 1);
	        }
	    }

	    
	    public String getLeaderboardText() {
	        if (leaderboard.isEmpty()) {
	            return "순위 없음";
	        }

	        StringBuilder leaderboardText = new StringBuilder("순위표:\n");
	        for (int rank = 0; rank < leaderboard.size(); rank++) {
	            PlayerInfo player = leaderboard.get(rank);
	            leaderboardText.append(rank + 1).append(". ").append(player.getId()).append(": ").append(player.getScore()).append("\n");
	        }
	        return leaderboardText.toString();
	    }
}
