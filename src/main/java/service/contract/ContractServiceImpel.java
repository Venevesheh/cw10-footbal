package service.contract;

import base.service.BaseServiceImpel;
import model.Contract;
import repository.contract.ContractRepository;

public class ContractServiceImpel extends BaseServiceImpel <Integer, Contract, ContractRepository> implements ContractService{
    public ContractServiceImpel(ContractRepository repository) {
        super(repository);
    }
}
