package Utility;

import service.city.CityService;
import service.contract.ContractService;
import service.member.MemberService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Menu {
    private final ContractService contractService = ApplicationContext.getContractServiceImpel();
    private final MemberService memberService = ApplicationContext.getMemberServiceImpel();

    private final CityService cityService = ApplicationContext.getCityServiceImpel();
    public Menu() {
    }

    public void MainMenu(){
        CountOfTeamsInCit();
    }

    public void CoachMaxSalary(){ memberService.maxCoachsalary();}

    public void PlayerMaxSalary() {memberService.maxPlayerInSemester();}

    public void CountOfTeamsInCit(){cityService.CountOfTeamsInCit();}


}
