package Utility;

import connection.DBConfig;
import repository.city.CityRepository;
import repository.city.CityRepositoryImpl;
import repository.contract.ContractRepository;
import repository.contract.ContractRepositoryImpel;
import repository.member.MemberRepository;
import repository.member.MemberRepositoryImpel;
import service.city.CityService;
import service.city.CityServiceImpl;
import service.contract.ContractService;
import service.contract.ContractServiceImpel;
import service.member.MemberService;
import service.member.MemberServiceImpel;

import java.sql.Connection;

public class ApplicationContext {
    private static final Connection CONNECTION;
    private static final ContractRepository CONTRACT_REPOSITORY;
    private static final ContractService CONTRACT_SERVICE;
    private static  final  MemberRepository MEMBER_REPOSITORY;
    private static final MemberService MEMBER_SERVICE;
    private static final CityRepository CITY_REPOSITORY;
    private static final CityService CITY_SERVICE;


    static {
        CONNECTION = DBConfig.getConnection();
        CONTRACT_REPOSITORY = new ContractRepositoryImpel(CONNECTION) ;
        CONTRACT_SERVICE = new ContractServiceImpel(CONTRACT_REPOSITORY);
        MEMBER_REPOSITORY = new MemberRepositoryImpel(CONNECTION);
        MEMBER_SERVICE = new MemberServiceImpel(MEMBER_REPOSITORY);
        CITY_REPOSITORY = new CityRepositoryImpl(CONNECTION);
        CITY_SERVICE = new CityServiceImpl(CITY_REPOSITORY);

    }
    public static ContractService getContractServiceImpel(){
        return CONTRACT_SERVICE;
    }

    public static MemberService getMemberServiceImpel(){
        return MEMBER_SERVICE;
    }

    public static CityService getCityServiceImpel(){
        return CITY_SERVICE;
    }

}
