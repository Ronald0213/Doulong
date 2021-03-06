package com.hotyi.hotyi.other.hotyiClass;

/**
 * Created by HOTYI on 2017/9/11.
 */

public class GuildInfo {
    String guildId;
    String ryGuildId;
    String logo;
    String name;
    String introduce;
    String leaderName;
    String membersNum;
    String status;
    String background;

    public GuildInfo(String guildId, String ryGuildId, String logo, String name, String introduce, String leaderName, String membersNum, String status, String background) {
        this.guildId = guildId;
        this.ryGuildId = ryGuildId;
        this.logo = logo;
        this.name = name;
        this.introduce = introduce;
        this.leaderName = leaderName;
        this.membersNum = membersNum;
        this.status = status;
        this.background = background;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getGuildId() {
        return guildId;
    }

    public void setGuildId(String guildId) {
        this.guildId = guildId;
    }

    public String getRyGuildId() {
        return ryGuildId;
    }

    public void setRyGuildId(String ryGuildId) {
        this.ryGuildId = ryGuildId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getMembersNum() {
        return membersNum;
    }

    public void setMembersNum(String membersNum) {
        this.membersNum = membersNum;
    }
}
