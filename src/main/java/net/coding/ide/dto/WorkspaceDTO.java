/*
 * Copyright (c) 2014-2016 CODING.
 */

package net.coding.ide.dto;

import lombok.Data;

/**
 * Created by tan on 16/8/23.
 */
@Data
public class WorkspaceDTO {
    private String spaceKey;

    private String ownerName;

    private String projectName;

    private String projectIconUrl;

    private String projectHtmlUrl;

    private String encoding;

    private String workingStatus;

    private String description;
}
