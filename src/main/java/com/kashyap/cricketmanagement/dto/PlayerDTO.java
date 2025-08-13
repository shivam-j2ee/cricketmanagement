package com.kashyap.cricketmanagement.dto;

public class PlayerDTO {

    private Long playedId;
    private String playerName;
    private Integer score;

    public PlayerDTO() {
    }
    public PlayerDTO(Long playedId, String playerName, Integer score) {
        this.playedId = playedId;
        this.playerName = playerName;
        this.score = score;
    }

    public Long getPlayedId() {
        return playedId;
    }

    public void setPlayedId(Long playedId) {
        this.playedId = playedId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playedId=" + playedId +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                '}';
    }
}
