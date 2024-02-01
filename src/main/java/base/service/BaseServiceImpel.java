package base.service;

import base.model.BaseEntity;
import base.repository.BaseRepository;

import java.io.Serializable;

public class BaseServiceImpel <ID extends Serializable, TYPE extends BaseEntity<ID>,
        R extends BaseRepository<ID, TYPE>> implements BaseService<ID,TYPE> {
    protected final R repository;

    public BaseServiceImpel(R repository) {
        this.repository = repository;
    }
    @Override
    public void save(TYPE entity) {
        repository.save(entity);
    }
    @Override
    public TYPE findById(ID id) {
        return repository.findById(id);
    }
}
