package models;

import java.util.Date;

public class AuditedModel  {
    public Boolean isActive;

    public Date created;
    public Date updated;
    public Date deleted;

    public String createdBy;
    public String updatedBy;
    public String deletedBy;

    public boolean isDeleted() {
        return deleted != null;
    }

    // TODO: Add set and get for these objects 
}