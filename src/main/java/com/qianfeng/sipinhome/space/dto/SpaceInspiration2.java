package com.qianfeng.sipinhome.space.dto;

import java.util.List;

public class SpaceInspiration2 {
    private long spaceId;
    private String spaceName;
    private String pic;
    private List<ComboBed> comboBeds;

    public long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(long spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public List<ComboBed> getComboBeds() {
        return comboBeds;
    }

    public void setComboBeds(List<ComboBed> comboBeds) {
        this.comboBeds = comboBeds;
    }
}
