package com.atomrockets.edbounty.models;

import lombok.Data;

@Data
public class DockingRequested extends AbstractEvent {
    private String stationName;
}
