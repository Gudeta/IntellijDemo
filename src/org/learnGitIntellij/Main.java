package org.learnGitIntellij;

import java.util.ArrayList;
import java.util.List;

public class Main {


    List<String> voterList=new ArrayList<>();

    public Main(){
        voterList.add("v1");
        voterList.add("v2");
        voterList.add("v3");
        voterList.add("v4");
        voterList.add("v5");
    }
    public static void main(String[] args) {
        Main voters=new Main();
        System.out.println(voters.voterList);
        removeVoter(voters);


    }

    private static void removeVoter(Main voters) {
        voters.voterList.remove("v1");
        System.out.println(voters.voterList);
    }
}
