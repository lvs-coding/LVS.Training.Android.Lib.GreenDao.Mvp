package com.example.greendaomvptraining.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "flag")
public class Flag {

    @NotNull
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "flag_id")
    private Long flagId;

    @Generated(hash = 258799048)
    public Flag(@NotNull Long id, Long flagId) {
        this.id = id;
        this.flagId = flagId;
    }

    @Generated(hash = 325057191)
    public Flag() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlagId() {
        return this.flagId;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }


}