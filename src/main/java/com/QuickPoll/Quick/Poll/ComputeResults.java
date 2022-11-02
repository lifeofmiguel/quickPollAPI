package com.QuickPoll.Quick.Poll;

public class ComputeResults {
    private String totalVotes;
    private String results;

    public ComputeResults(String totalVotes, String results) {
        this.totalVotes = totalVotes;
        this.results = results;
    }

    public String getTotalVotes() {
        return totalVotes;
    }

    public String getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "ComputeResults{" +
                "totalVotes='" + totalVotes + '\'' +
                ", results='" + results + '\'' +
                '}';
    }
}
