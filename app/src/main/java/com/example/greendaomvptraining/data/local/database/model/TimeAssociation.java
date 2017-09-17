package com.example.greendaomvptraining.data.local.database.model;

import com.example.greendaomvptraining.data.local.database.model.Plant;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "time_association")
public class TimeAssociation {

    @Id(autoincrement = true)
    private long id;

    @Property(nameInDb = "time_association_id")
    private Long timeAssociationId;

    @NotNull
    @Property(nameInDb = "plant_id_before")
    private Long plantIdBefore;

    @NotNull
    @Property(nameInDb = "plant_id_after")
    private Long plantIdAfter;

    @NotNull
    @Property(nameInDb = "flag_id")
    private Long flagId;

    @ToOne(joinProperty = "plantIdBefore")
    private Plant plantBefore;

    @ToOne(joinProperty = "plantIdAfter")
    private Plant plantAfter;

    @ToOne(joinProperty = "flagId")
    private Flag flag;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 766295083)
    private transient TimeAssociationDao myDao;

    @Generated(hash = 1545309306)
    public TimeAssociation(long id, Long timeAssociationId,
            @NotNull Long plantIdBefore, @NotNull Long plantIdAfter,
            @NotNull Long flagId) {
        this.id = id;
        this.timeAssociationId = timeAssociationId;
        this.plantIdBefore = plantIdBefore;
        this.plantIdAfter = plantIdAfter;
        this.flagId = flagId;
    }

    @Generated(hash = 1783495671)
    public TimeAssociation() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getTimeAssociationId() {
        return this.timeAssociationId;
    }

    public void setTimeAssociationId(Long timeAssociationId) {
        this.timeAssociationId = timeAssociationId;
    }

    public Long getPlantIdBefore() {
        return this.plantIdBefore;
    }

    public void setPlantIdBefore(Long plantIdBefore) {
        this.plantIdBefore = plantIdBefore;
    }

    public Long getPlantIdAfter() {
        return this.plantIdAfter;
    }

    public void setPlantIdAfter(Long plantIdAfter) {
        this.plantIdAfter = plantIdAfter;
    }

    public Long getFlagId() {
        return this.flagId;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }

    @Generated(hash = 680350415)
    private transient Long plantBefore__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 907851291)
    public Plant getPlantBefore() {
        Long __key = this.plantIdBefore;
        if (plantBefore__resolvedKey == null
                || !plantBefore__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PlantDao targetDao = daoSession.getPlantDao();
            Plant plantBeforeNew = targetDao.load(__key);
            synchronized (this) {
                plantBefore = plantBeforeNew;
                plantBefore__resolvedKey = __key;
            }
        }
        return plantBefore;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 226107532)
    public void setPlantBefore(@NotNull Plant plantBefore) {
        if (plantBefore == null) {
            throw new DaoException(
                    "To-one property 'plantIdBefore' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.plantBefore = plantBefore;
            plantIdBefore = plantBefore.getId();
            plantBefore__resolvedKey = plantIdBefore;
        }
    }

    @Generated(hash = 201785864)
    private transient Long plantAfter__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1271852202)
    public Plant getPlantAfter() {
        Long __key = this.plantIdAfter;
        if (plantAfter__resolvedKey == null
                || !plantAfter__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PlantDao targetDao = daoSession.getPlantDao();
            Plant plantAfterNew = targetDao.load(__key);
            synchronized (this) {
                plantAfter = plantAfterNew;
                plantAfter__resolvedKey = __key;
            }
        }
        return plantAfter;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1960773893)
    public void setPlantAfter(@NotNull Plant plantAfter) {
        if (plantAfter == null) {
            throw new DaoException(
                    "To-one property 'plantIdAfter' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.plantAfter = plantAfter;
            plantIdAfter = plantAfter.getId();
            plantAfter__resolvedKey = plantIdAfter;
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
    @Generated(hash = 1982943872)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTimeAssociationDao() : null;
    }
}