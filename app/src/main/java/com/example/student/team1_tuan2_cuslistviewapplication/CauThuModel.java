package com.example.student.team1_tuan2_cuslistviewapplication;

import java.util.ArrayList;

public class CauThuModel {
    public static String[] name = new String[]{"Beckham", "Cryff", "Messi", "Pele","Ronaldo","Ronaldo_Beo","Zidane"};
    public static int[] img_cauthu = new int[]{R.drawable.ava_beckham, R.drawable.ava_cryff, R.drawable.ava_messi, R.drawable.ava_pele,R.drawable.ava_ronaldo,R.drawable.ava_ronaldo_beo,R.drawable.ava_zidane};
    public static  int[] img_flag = new int[]{R.drawable.flag_achentina,R.drawable.flag_brazil,R.drawable.flag_england,R.drawable.flag_france,R.drawable.flag_portugal,R.drawable.flag_france,R.drawable.flag_netheland};
    private static ArrayList<CauThu> ls = null;

    public static ArrayList<CauThu> getListCauThuDemo() {
        if (ls == null) {
            CauThuModel cauThuModel = new CauThuModel();
            cauThuModel.initCauThuList();
        }
        return ls;
    }

    private void initCauThuList() {
        ls = new ArrayList<CauThu>();
        for (int i = 0; i < name.length; i++) {
            CauThu c = new CauThu(name[i], img_cauthu[i],img_flag[i]);
            ls.add(c);
        }
    }

}
