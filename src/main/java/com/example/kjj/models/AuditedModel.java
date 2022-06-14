package com.example.kjj.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AuditedModel  {
    @Getter
    @Setter
    @Column
    public Boolean isActive;

    @Getter @Setter
    @Column
    public Date created;

    @Getter @Setter
    @Column
    public Date updated;

    @Getter @Setter
    @Column
    public Date deleted;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    @Getter @Setter
    @Column
    public String createdBy;

    @Getter @Setter
    @Column
    public String updatedBy;

    @Getter @Setter
    @Column
    public String deletedBy;

    @Getter @Setter
    @Column
    public SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public String getMSQCreated() {
        return sdf.format(created);
    }
    // ' YYYY-MM-DD hh:mm:ss ' 

    public String getMSQDeleted() {
        return sdf.format(deleted);
    }
    // ' YYYY-MM-DD hh:mm:ss '

    public String getMSQUpdated() {
        return sdf.format(updated);
    }
    // ' YYYY-MM-DD hh:mm:ss '

    public boolean isDeleted() {
        return deleted != null;
    }

    // TODO: Add set and get for these objects DONE
}

