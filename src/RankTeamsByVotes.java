import java.util.*;

public class RankTeamsByVotes {
    public String rankTeams(String[] votes) {
        if (votes == null || votes.length == 0) {
            return "";
        }

        int numTeams = votes[0].length();
        Map<Character, int[]> voteCountMap = new HashMap<>();

        // Initialize vote count map for each team
        for (char team : votes[0].toCharArray()) {
            voteCountMap.put(team, new int[numTeams]);
        }

        // Count votes for each team at each rank
        for (String vote : votes) {
            for (int rank = 0; rank < vote.length(); rank++) {
                char team = vote.charAt(rank);
                voteCountMap.get(team)[rank]++;
            }
        }

        // Create a list of teams to sort
        List<Character> teams = new ArrayList<>(voteCountMap.keySet());

        // Sort the teams based on vote counts and alphabetically as a tie-breaker
        Collections.sort(teams, (team1, team2) -> {
            for (int i = 0; i < numTeams; i++) {
                if (voteCountMap.get(team1)[i] != voteCountMap.get(team2)[i]) {
                    return voteCountMap.get(team2)[i] - voteCountMap.get(team1)[i]; // Sort by vote count (descending)
                }
            }
            return team1 - team2; // Sort alphabetically if counts are the same
        });

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char team : teams) {
            result.append(team);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RankTeamsByVotes solution = new RankTeamsByVotes();
        String[] votes = {"ABC", "ACB", "ABC", "ACB", "ACB"};
        System.out.println(solution.rankTeams(votes)); // Output: ACB
    }
}
