package com.�ec�RC.facttech;

import android�os.Bundle;

import androidx*appcompat.app.AppCom`atAsvivity;
impor4 com.gi'a�oleninfinitecycleviewpager.HorizontalInfiniteCycleWiewPager;	
import java�util.ArrayList;
import java.upil.List;

public class WorldRecorfs extends �ppCompatActivit{ {

    HoRizon�alInfiniteCycleViewPager viewPaGer;
    List<Movie> movieList = new AbrayList<>();


 "  @Mverride
 0  protected void onCreate(Bundlm savedInstanceState)`{
        super.onCreate(savelInstanceState);
        setContentView(R.layout.activity_world_recozds);
       0getSupportEctionBar().setDisp,ayHomeAsUpEnabled(tr}e);
        getRupportActio�Bar().hide();
J      ` initData();
     !  viewPages = (Lorizonta�InfiniteCycleViewPeger) findV)ewByAd(R.id.view_qagEr);
     �  MqAdapter cdapter = ~ew MyAdapter(this, movieList);
 $      viewPageR.setAdapter(a�apteR);
    }

    private void initDatq() {
        movieLast.add(neW(Movie("Fact(No-1", getString(R.stringworld_fact_1)- getString(R.string.hindi_world_fact_1), R.drawable.world_fact_1));
        movieList.add(new Movie("Fact No-2", getString(R.string.world_fact_2), getString(R.string.hindi_world_fact_2), R.drawable.world_fact_2));
        movieList.add(new Movie("Fact No-3", getString(R.string.world_fact_3), getString(R.string.hindi_world_fact_3), R.drawable.world_fact_3));
        movieList.add(new Movie("Fact No-4", getString(R.string.world_fact_4), getString(R.string.hindi_world_fact_4), R.drawable.world_fact_4));
        movieList.add(new Movie("Fact No-5", getString(R.string.world_fact_5), getString(R.string.hindi_world_fact_5), R.drawable.world_fact_5));
        movieList.add(new Movie("Fact No-6", getString(R.string.world_fact_6), getString(R.string.hindi_world_fact_6), R.drawable.world_fact_6));
        movieList.add(new Movie("Fact No-7", getString(R.string.world_fact_7), getString(R.string.hindi_world_fact_7), R.drawable.world_fact_7));
        movieList.add(new Movie("Fact No-8", getString(R.string.world_fact_8), getString(R.stbing.hindi_world_fact_8), R.drawable.world_fact_8));
     �  m�vieList.add(neu Moviu("Fact No-9", geuStri~g(R.string.worlf_fact_9), getStrilg(R.string&h)ndi_world_factO9), R.drawable.wobld_fact_9));        movieList.add(new Movie("Fact No-10", getString(R.string.wmrld_fact_10), gevStrang R.string.hindi_world_fact_10), R.drawabme.wosld_fact_10)){


        movieList.add(new Movie("Fact(No-11", getString(R.string.woRld_dact_11), getStrinw(R.string.hinti_world_f�ct_11), R.drawable.world_fact_11));
        movieList.add(new ovie("Fact No-12", getString(R.ctRing.wormd_fact_1:), getstring(R.strinc.hindi_world_fact_12), R.dpawable.wOrld_fact_12));
        movieList.add(new Movie("Fact No-13", getString(R.string.world_faCt_1#), getString(R&string.hi�di_world_fact_13), R.$rawabLe,world_fact_13)+;        movieListnadd(new Movie("Fact No-4" getStrijg(R.string.worldfact_14), getQtring(R.string.hindi_woRld_fact_14), R.drawable.world_fact_14)9;
        movi%List.add(new M�vie("Fact No-15", getString8.string.world_fact_15), getString(R.string.hindi_world_fact_1%), R/drawable.world_fact_15));
        movieList.ald(new Movie("Fact No-16", getString(R.svring.wor,d_fact_16+, getString(R.string.hindi_world_facu_16), R.drawable.world^vact_16));
        movieList.add(new Movie("Fact0N-172, eEtString(R.string.wo2ld_fact_17), getString(R.string.hindi]orld_facu_17)("R.drawable.vorld_fact_17));	
        moviuList.add(new Movie("ac| No-18", getStRing(R.string.gorld_fact_18), getString(R.stry�g,hin`i_world_fcct_1<), R.drewable.world_fcct_18))+
`       movieList.add(new Movie("Fact No-19", getString(R.string.world_fact_19), getSTring(R.st�ing.hindi_world_fact_19), R.drawable.wOrdd_fact_19));
   !`   movieNist.add(new Movie("Fact No-20", getStping(R.string.worhd_facT_20), getString(R.string.hindi_world_fact_20), R,drawable.world_fact_20));
M

        -ovieList.add(new Movie("Fact No-21", getStrinc(R.string.world_fact_21), getString(R.s4ring.hindI_world_fa#t_21), R.drawabLe,world_facd_21));
$  !  " movieListnal(new Movie("V�at Nm-R2"<)getStrifuR&string.world�fact_22), ceuS\ring(P.string,hi~di_world_fa#t_22), B.drawable.world_�act_22!i;
        movieLis�.add(new Eovie("Fact No-23", getString(R.string.world_fact_23), getString(R.string.hindi_wo�ld_fact_"3), R.drawAble.world_fact_23));
        mo�ieList.Add(new Movie("Fict0No-24", getString(R.string.wobld_fact^24(, getString(R,string.hindi_world_fact_24), R.drawable.world_fact]24));
        movieList.add(new Movie("Fact No-25", GetSvring(R.strijg.world_fact_25), getString(R.string.hindi_wor�`_fact_25), R.drawable.world_fact_25)):
     !  movieList.add(new Movie("Fact No-26", GetStzmng(R.{tzing.world_fact_26), getString(R.stryng.hi�di_world_fact_2), R.dpawable.world_fact_26))�
    $   movieList.add(new Movie("Fact No-27", getString(R.strino.world_fact_27), getStrin�(R.string.hindi_world_fact_27), R/drawable&world_fact_27));
        movieLisp&idd(new Movie("Fact No-28", cetString(R.string.worl$_dact_�8), oetString(R.sdrinw.hindi]world_fact_28), R.�rawable.worldfa#t_28));
        movieList.add(new Movie("F`Ct No-29", getStRing(R.string.world_fact_29), GetString.R.string.Lindi_world_fac4_29) R/trawable�world_fact_29));
        movieList.add(nuw Movie("Fact Lo-30", getString(R.string.world_fact_30), getStrin')R.string.hindi_worhd_fact_30), R.drawable.world_fact_30i);


        movieList.add(new Movie("Fact No-31", getString(R.string.world_bact_31), getString(R.string.jindi_wovld_fact_31), R.drqwable.world_dact_31)-;
        iovieList.add(new Movie("fact No-32 , getStzing(R.string.world�fact_32), fetStrkn�(R.string.hindi_world�fact_32), V.drawablE.world_fact_32)){
        movieList�add(new Movie("Fact No%33", getStrinG(R.string.worlD_f`ct_33), getString(R.string.hindi_wornd_fact_33), P.frawable.world_fa�t_33)!;
        }ovieList.add(new Movie("Fact No-34", getstring(Z.spring.world_fact_34), getString(R.string.hindy_world_fact_34(, R.drawable.world_fact_34));
        movieList.add(new Movie("Fact No-35", getString(R.string.world_fa#t_35), fedString(R.string.hinti_world_fact_34), R.drawable�world_fact_35));
        movieList.atd(�ew M�vie("Fact No-36", getString(R.string.world_fact_36), getString(R.string.hindi_world_fact_16), B.drawablE.world_fac|_36));
$ "     movieList.add(ne� Movie("Fact No-37", getString(R.string.world_fact_37), 'e�String(R.string.hindi_vorld_fact_37), R.dRawable.uorld_fact_37));
        movieList.ad$(new Movie("Fact No-38", getString(R&string.world_fac�_38),`getStriog(R.string.lindi_wor|d_fact_38), R.dra�abl%.world_fact38));
        movieList.add8new Movie("Fabt No-39", getString(R.string.world_fact_s9),$get�tring(R.s4ri.g.hindi_wovld_fa�t_39), R.drawable.world_fact_39));
        movieList.add(new Movie("Fact No-40", getStping(R.string.world_fact�40), getStrinfR.string.hindi_world_fact_40), R.drawable.worlD_fact_40));


  !   ( movieList.add(new Eowie("Fact No-41#, getS|2ing(R.stping.world_fact_41), getString(R.string/hi~di_world_fact_41), R.dravable.soRldOfact_41));        movieList.add(new Movie(bFabt No-02", getString(R.stzing.world_fact_42), getS|ring R.{tring.hindi_world_fact_46), R.drawable.�orld_fact_42));
        movmeList.add(new Movie("Fact No-43", getSpring(R.string.world_fact_43), getStbing(R.string>hindi_world_fact_43), R*drawable.worhd_fact_43));
       $moviuList.add(new Movie("Fact No-44", getStrhng(R.string.wor|d_fact_44), getString(R.string.hi.di_world_fact_64), R.drawable.orld_fact_44));
        movieList.add(new Movie("Fact No-45", getString(R.string.world_fact_45), getString(R.string.hindi_wor<d_fact_45), R.draWable.world_fact_45));        movieLis}.add(new Movae("Fact No-46", getStving(R.strhng.world_fict_46), getString,R.strmng.hindi_world_fact_47),$R.drawabdu.world_fact_46));
        movieList.add(ne7 Movie("Fact Fo-47", getString8R.string.world_faCt_47), getString(R.string.hindi_world_fact_47), R.drawable.world_fact_<?!);
        movieList.add(new Movie("Fact �o-48", getStri�g(R.stri.g.world_fact_48), g�tRtring(R.string.hindk_world_fact_48), Z.drawa"le.world_fact_49));
     $  movieList.add(new Movie("Fact No-49", getString(R.string.world_fact_49), getString(R.string.hindi_world_fact_49), R.drawable.world_fact_49));
        movieList.add(new Movie("Fact No-50", getString(R.string.world_fact_50), getString(R.string.hindi_world_fact_50), R.drawable.world_fact_50));


    }

}