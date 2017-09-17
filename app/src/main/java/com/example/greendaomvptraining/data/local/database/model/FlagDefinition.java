package com.example.greendaomvptraining.data.local.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "flag_definition")
public class FlagDefinition {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "flag_definition_id")
    private Long flagDefinitionId;

    @Property(nameInDb = "flag_id")
    private Long flagId;

    @NotNull
    @Property(nameInDb = "definition")
    private String definition;

    @ToOne(joinProperty = "flagId")
    private Flag flag;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 942553518)
    private transient FlagDefinitionDao myDao;

    @Generated(hash = 842866171)
    public FlagDefinition(Long id, Long flagDefinitionId, Long flagId,
            @NotNull String definition) {
        this.id = id;
        this.flagDefinitionId = flagDefinitionId;
        this.flagId = flagId;
        this.definition = definition;
    }

    @Generated(hash = 1409436902)
    public FlagDefinition() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlagDefinitionId() {
        return this.flagDefinitionId;
    }

    public void setFlagDefinitionId(Long flagDefinitionId) {
        this.flagDefinitionId = flagDefinitionId;
    }

    public Long getFlagId() {
        return this.flagId;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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
    @Generated(hash = 518971847)
    public void setFlag(Flag flag) {
        synchronized (this) {
            this.flag = flag;
            flagId = flag == null ? null : flag.getId();
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
    @Generated(hash = 726546173)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFlagDefinitionDao() : null;
    }


}