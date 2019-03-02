package com.example.student.team1_tuan2_cuslistviewapplication;

import java.util.ArrayList;

public class PlayerModel {
    public static String[] name = new String[]{"Beckham", "Messi", "Ronaldo"};
    public static int[] img = new int[]{R.drawable.ava_beckham, R.drawable.ava_messi, R.drawable.ava_ronaldo};
    private static ArrayList<Player> ls = null;

    public static ArrayList<Player> getListPlayerDemo() {
        if (ls == null) {
            PlayerModel pModel = new PlayerModel();
            pModel.initPlayerList();
        }
        return ls;
    }

    private void initPlayerList() {
        ls = new ArrayList<Player>();
        for (int i = 0; i < name.length; i++) {
            Player p = new Player(name[i], img[i]);
            ls.add(p);
        }
    }

    public static ArrayList<Player> getList() {
        return ls;
    }
}
