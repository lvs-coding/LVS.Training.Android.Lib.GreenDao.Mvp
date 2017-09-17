package com.example.greendaomvptraining.data.local.database.model;

import com.example.greendaomvptraining.data.local.database.model.Plant;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "space_association")
public class SpaceAssociation {

    @NotNull
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "space_association_id")
    private Long spaceAssociationId;

    @NotNull
    @Property(nameInDb = "plant_id_1")
    private Long plantId1;

    @NotNull
    @Property(nameInDb = "plant_id_2")
    private Long plantId2;

    @NotNull
    @Property(nameInDb = "flag_id")
    private Long flagId;

    @ToOne(joinProperty = "plantId1")
    private Plant plant1;

    @ToOne(joinProperty = "plantId2")
    private Plant plant2;

    @ToOne(joinProperty = "flagId")
    private Flag flag;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 781292434)
    private transient SpaceAssociationDao myDao;

    @Generated(hash = 356759692)
    public SpaceAssociation(@NotNull Long id, Long spaceAssociationId,
            @NotNull Long plantId1, @NotNull Long plantId2, @NotNull Long flagId) {
        this.id = id;
        this.spaceAssociationId = spaceAssociationId;
        this.plantId1 = plantId1;
        this.plantId2 = plantId2;
        this.flagId = flagId;
    }

    @Generated(hash = 2042184735)
    public SpaceAssociation() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpaceAssociationId() {
        return this.spaceAssociationId;
    }

    public void setSpaceAssociationId(Long spaceAssociationId) {
        this.spaceAssociationId = spaceAssociationId;
    }

    public Long getPlantId1() {
        return this.plantId1;
    }

    public void setPlantId1(Long plantId1) {
        this.plantId1 = plantId1;
    }

    public Long getPlantId2() {
        return this.plantId2;
    }

    public void setPlantId2(Long plantId2) {
        this.plantId2 = plantId2;
    }

    public Long getFlagId() {
        return this.flagId;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }

    @Generated(hash = 1052878746)
    private transient Long plant1__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 470409716)
    public Plant getPlant1() {
        Long __key = this.plantId1;
        if (plant1__resolvedKey == null || !plant1__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PlantDao targetDao = daoSession.getPlantDao();
            Plant plant1New = targetDao.load(__key);
            synchronized (this) {
                plant1 = plant1New;
                plant1__resolvedKey = __key;
            }
        }
        return plant1;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1457129609)
    public void setPlant1(@NotNull Plant plant1) {
        if (plant1 == null) {
            throw new DaoException(
                    "To-one property 'plantId1' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.plant1 = plant1;
            plantId1 = plant1.getId();
            plant1__resolvedKey = plantId1;
        }
    }

    @Generated(hash = 267471689)
    private transient Long plant2__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 24455414)
    public Plant getPlant2() {
        Long __key = this.plantId2;
        if (plant2__resolvedKey == null || !plant2__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PlantDao targetDao = daoSession.getPlantDao();
            Plant plant2New = targetDao.load(__key);
            synchronized (this) {
                plant2 = plant2New;
                plant2__resolvedKey = __key;
            }
        }
        return plant2;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1276512140)
    public void setPlant2(@NotNull Plant plant2) {
        if (plant2 == null) {
            throw new DaoException(
                    "To-one property 'plantId2' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.plant2 = plant2;
            plantId2 = plant2.getId();
            plant2__resolvedKey = plantId2;
        }
    }

    @Generated(hash = 927640508)
    private transient Long flag__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 134323344)
    public Flag getFlag() {
        Long __key = this.flagId;
        if (flag__resolvedKey == null || !flag__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FlagDao targetDao = daoSession.getFlagDao();
            Flag flagNew = targetDao.load(__key);
            synchronized (this) {
                flag = flagNew;
                flag__resolvedKey = __key;
            }
        }
        return flag;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1100372232)
    public void setFlag(@NotNull Flag flag) {
        if (flag == null) {
            throw new DaoException(
                    "To-one property 'flagId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.flag = flag;
            flagId = flag.getId();
            flag__resolvedKey = flagId;
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
    @Generated(hash = 1069277530)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSpaceAssociationDao() : null;
    }
}