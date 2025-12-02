package com.ttt.synctaskmanagement.models.enums;

import lombok.Getter;

@Getter
public enum ResourceType {
    USER("User");

    private final String label;

    ResourceType(String label) {
        this.label = label;
    }
}
