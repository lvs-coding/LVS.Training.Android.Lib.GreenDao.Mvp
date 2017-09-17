package com.example.greendaomvptraining.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "plant")
public class Plant {

    @NotNull
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "plant_id")
    private Long plantId;

    @NotNull
    @Property(nameInDb = "date_added")
    private String dateAdded;

    @Generated(hash = 868411306)
    public Plant(@NotNull Long id, Long plantId, @NotNull String dateAdded) {
        this.id = id;
        this.plantId = plantId;
        this.dateAdded = dateAdded;
    }

    @Generated(hash = 878011190)
    public Plant() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlantId() {
        return this.plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public String getDateAdded() {
        return this.dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
}