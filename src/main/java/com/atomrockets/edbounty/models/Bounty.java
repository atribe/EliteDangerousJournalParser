package com.atomrockets.edbounty.models;

import com.atomrockets.edbounty.models.submodels.Rewards;
import lombok.Data;

import java.util.List;

@Data
public class Bounty extends AbstractEvent {
    private int reward;
    private List<Rewards> rewards;
    private String target;
    private long totalReward;
    private String victimFaction;
    private int sharedWithOthers;
}
