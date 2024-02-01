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
        CoachMaxSalary();
    }

    public void CoachMaxSalary(){
        try {
            ResultSet resultSet = memberService.maxCoachsalary();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("name") + " | ");
                System.out.println(resultSet.getInt("salary") + " | ");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
