package com.example.greendaomvptraining.data.local.database.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import com.example.greendaomvptraining.data.local.database.model.Plant;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "plant_definition")
public class PlantDefinition {

    @NotNull
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "plant_definition_id")
    private Long plantDefinitionId;

    @NotNull
    @Property(nameInDb = "plant_id")
    private Long plantId;

    @NotNull
    @Property(nameInDb = "plant_definition")
    private String plantDefinition;

    @ToOne(joinProperty = "plantId")
    private Plant plant;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 653362362)
    private transient PlantDefinitionDao myDao;

    @Generated(hash = 673743108)
    public PlantDefinition(@NotNull Long id, Long plantDefinitionId,
            @NotNull Long plantId, @NotNull String plantDefinition) {
        this.id = id;
        this.plantDefinitionId = plantDefinitionId;
        this.plantId = plantId;
        this.plantDefinition = plantDefinition;
    }

    @Generated(hash = 309989786)
    public PlantDefinition() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlantDefinitionId() {
        return this.plantDefinitionId;
    }

    public void setPlantDefinitionId(Long plantDefinitionId) {
        this.plantDefinitionId = plantDefinitionId;
    }

    public Long getPlantId() {
        return this.plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public String getPlantDefinition() {
        return this.plantDefinition;
    }

    public void setPlantDefinition(String plantDefinition) {
        this.plantDefinition = plantDefinition;
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
    @Generated(hash = 1552358668)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPlantDefinitionDao() : null;
    }
}