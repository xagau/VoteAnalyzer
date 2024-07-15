import java.util.HashMap;
import java.util.Map;

public class MajorityAnswer {
    public static void main(String[] args) {
        // Test the function with an array of Vote objects
        Vote[] votes = {
                new Vote(1, 123, "Alice"),
                new Vote(2, 123, "Bob"),
                new Vote(1, 123, "Charlie"),
                new Vote(2, 123, "David"),
                new Vote(1, 123, "Eve")
        };
        Result result = calculateMajorityAnswer(votes);
        System.out.println("Winning Selection: " + result.getWinningSelection());
        System.out.println("Majority Percentage: " + result.getMajorityPercentage());
    }

    public static Result calculateMajorityAnswer(Vote[] votes) {
        if (votes == null || votes.length == 0) {
            return null;
        }

        HashMap<Integer, Integer> selectionCounts = new HashMap<>();

        for (Vote vote : votes) {
            int selection = vote.getSelection();
            selectionCounts.put(selection, selectionCounts.getOrDefault(selection, 0) + 1);
        }

        Map.Entry<Integer, Integer> majorityEntry = null;
        int totalVotes = 0;
        for (Map.Entry<Integer, Integer> entry : selectionCounts.entrySet()) {
            totalVotes += entry.getValue();
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        int winningSelection = majorityEntry.getKey();
        double majorityPercentage = (double) majorityEntry.getValue() / totalVotes * 100;

        return new Result(winningSelection, majorityPercentage);
    }
}