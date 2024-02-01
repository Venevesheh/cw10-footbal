package org.example;

import Utility.ApplicationContext;
import model.Contract;
import model.Member;
import service.contract.ContractService;
import service.member.MemberService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MemberService memberService = ApplicationContext.getMemberServiceImpel();
        ContractService contractService= ApplicationContext.getContractServiceImpel();

        Member member = new Member("kimia","player",1);
        memberService.save(member);
//        Contract contract = new Contract();
    }
}