package Utility;

import service.contract.ContractService;
import service.member.MemberService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Menu {
    private final ContractService contractService = ApplicationContext.getContractServiceImpel();
    private final MemberService memberService = ApplicationContext.getMemberServiceImpel();

    public Menu() {
    }

    public void MainMenu(){
        PlayerMaxSalary();
    }

    public void CoachMaxSalary(){ memberService.maxCoachsalary();}

    public void PlayerMaxSalary() {memberService.maxPlayerInSemester();}

}
