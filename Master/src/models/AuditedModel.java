package src.models;
import java.time.format.DateTimeFormatter;  
import java.util.Calendar;
import java.util.Date;
import java.util.
public class AuditedModel  {
    public Boolean isActive;

    public Date created;
    public Date updated;
    public Date deleted;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 

    public String createdBy;
    public String updatedBy;
    public String deletedBy;

    public boolean getIsActive() { 
        return isActive; 
    }

    public void setIsActive(boolean isActive) {
            this.isActive = isActive;
    }


    public Date getCreated() {
        return created;
    }
    // ' YYYY-MM-DD hh:mm:ss ' 
    public void setCreated() {
        this.created = Calendar.getInstance().getTime();  
    }



    public boolean isDeleted() {
        return deleted != null;
    }

    // TODO: Add set and get for these objects 
}