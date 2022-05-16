package models;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.*;
public class AuditedModel  {
    public Boolean isActive;

    public Date created;
    public Date updated;
    public Date deleted;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public String createdBy;
    public String updatedBy;
    public String deletedBy;
    public SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public boolean getIsActive() { 
        return isActive; 
    }
    public void setIsActive(boolean isActive) {
            this.isActive = isActive;
    }


    public String getMSQCreated() {
        return sdf.format(created);
    }
    // ' YYYY-MM-DD hh:mm:ss ' 
    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public String getMSQDeleted() {
        return sdf.format(deleted);
    }
    // ' YYYY-MM-DD hh:mm:ss '

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {

        this.deleted = deleted;
    }

    public Date getUpdated() {
        return updated;
    }

    public String getMSQUpdated() {
        return sdf.format(updated);
    }
    // ' YYYY-MM-DD hh:mm:ss '
    public void setUpdated(Date updated) {

        this.updated = updated;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(String deletedByBy) {
        this.deletedBy = deletedByBy;
    }




    public boolean isDeleted() {
        return deleted != null;
    }

    // TODO: Add set and get for these objects DONE
}

