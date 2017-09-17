package com.example.greendaomvptraining.data.local.database.model;

import com.example.greendaomvptraining.data.local.database.model.Plant;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "picture")
public class Picture {

    @NotNull
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "picture_id")
    private Long pictureId;

    @NotNull
    @Property(nameInDb = "plant_id")
    private Long plantId;

    @NotNull
    @Property(nameInDb = "picture")
    private String picture;

    @ToOne(joinProperty = "plantId")
    private Plant plant;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 220989104)
    private transient PictureDao myDao;

    @Generated(hash = 1274898898)
    public Picture(@NotNull Long id, Long pictureId, @NotNull Long plantId,
            @NotNull String picture) {
        this.id = id;
        this.pictureId = pictureId;
        this.plantId = plantId;
        this.picture = picture;
    }

    @Generated(hash = 1602548376)
    public Picture() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPlantId() {
        return this.plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Generated(hash = 1388778300)
    private transient Long plant__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1280501457)
    public Plant getPlant() {
        Long __key = this.plantId;
        if (plant__resolvedKey == null || !plant__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PlantDao targetDao = daoSession.getPlantDao();
            Plant plantNew = targetDao.load(__key);
            synchronized (this) {
                plant = plantNew;
                plant__resolvedKey = __key;
            }
        }
        return plant;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 774591270)
    public void setPlant(@NotNull Plant plant) {
        if (plant == null) {
            throw new DaoException(
                    "To-one property 'plantId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.plant = plant;
            plantId = plant.getId();
            plant__resolvedKey = plantId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1412175658)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPictureDao() : null;
    }


}