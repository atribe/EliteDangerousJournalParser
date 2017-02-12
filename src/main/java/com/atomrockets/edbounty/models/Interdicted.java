package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Interdicted extends AbstractEvent {
    private boolean submitted;
    private String interdictor;
    @JsonProperty("Interdictor_Localised")
    private String interdictorLocalised;
    @JsonProperty("IsPlayer")
    private boolean player;
    private String faction;
}
