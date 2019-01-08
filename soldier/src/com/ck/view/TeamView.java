package com.ck.view;
import com.ck.domain.*;
import com.ck.service.*;

public class TeamView {
    private NameListService nls = new NameListService();
    private TeamService ts = new TeamService();

    public TeamView() {
    }

    public void enterMainMenu() {
        boolean loopFlag = true;
        char key = 0;

        do {
            if (key != '1') {
                this.listAllSoldiers();
            }

            System.out.print("1-特遣队列表  2-添加特遣队成员 3-删除特遣队成员  4-退出     请选择(1-4):");
            key = TSUtility.readMenuSelection();
            switch(key) {
            case '1':
                this.getAllTeam();
                break;
            case '2':
                this.addMember();
                break;
            case '3':
                this.deleteMember();
                break;
            case '4':
                System.out.print("确认是否退出(Y/N):");
                char c = TSUtility.readConfirmSelection();
                if (c == 'Y') {
                    loopFlag = false;
                }
            }
        } while(loopFlag);

    }

    public void deleteMember() {
        System.out.println("\n--------------------添加特遣队成员---------------------\b");
        System.out.print("请输入要删除的士兵TID：");
        int memberId = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N)：");
        char key = TSUtility.readConfirmSelection();
        if (key != 'N') {
            try {
                this.ts.removeMember(memberId);
                System.out.println("删除成功");
            } catch (TeamException var4) {
                System.err.println(var4.getMessage());
            }

            TSUtility.readReturn();
        }
    }

    public void addMember() {
        System.out.println("\n--------------------添加特遣队成员---------------------\b");
        System.out.print("请输入添加士兵的ID：");
        int id = TSUtility.readInt();

        try {
            Soldier soldier = this.nls.getSoldier(id);
            this.ts.addMember(soldier);
            System.out.println("添加成功");
        } catch (TeamException var3) {
            System.err.println("添加失败，原因：" + var3.getMessage());
        }

        TSUtility.readReturn();
    }

    public void getAllTeam() {
        System.out.println("\n--------------------特遣队成员列表---------------------\n");
        Infantry[] infantry = this.ts.getTeam();
        if (infantry.length == 0) {
            System.out.println("暂无人员信息！");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t战斗力\t兵种\t野外生存指数\t指挥等级");
        }

        for(int i = 0; i < infantry.length; ++i) {
            System.out.println(infantry[i].getDetailsForTeam());
        }

        System.out.println("----------------------------------------------------");
    }

    public void listAllSoldiers() {
        System.out.println("\n------------------------------特遣战队组建管理系统----------------------------\n");
        Soldier[] soldiers = this.nls.getAllSoldiers();
        if (soldiers.length == 0) {
            System.out.println("没有找到士兵！");
        } else {
            System.out.println("ID\t姓名\t年龄\t战斗力\t兵种\t状态\t野外生存\t指挥等级\t配备武器");
        }

        for(int i = 0; i < soldiers.length; ++i) {
            System.out.println(soldiers[i]);
        }

        System.out.println("-----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        TeamView tv = new TeamView();
        tv.enterMainMenu();
    }

}
