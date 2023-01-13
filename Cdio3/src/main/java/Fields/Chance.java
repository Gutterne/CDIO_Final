package Fields;
import org.example.Die;
import org.example.Player;
import gui_main.GUI;

import java.util.ArrayList;

public class Chance extends Field {
    private Die die8;
    GUI gui;
    private int[] bunke1, bunke2, bunke3, bunke4, bunke5, bunke6;

    public int getChanceNum() {
        return chanceNum;
    }

    private int chanceNum;


    public String getChancecards() {
        chanceNum = 12;
        //String cards = chancecards[(int) (Math.random() *  + 1)];
        String cards = chancecards[chanceNum];
        return cards;
    }


    public String[] chancecards = new String[]{
            "Oliepriserne er steget, og De skal betale kr 500 pr hus og kr 2000 pr hotel\n",           //0
            "Ejendomsskatten er steget. Ekstraudgifterne er: 800 kr pr hus, 2300 kr pr hotel.\n",      //1
            "De har kørt frem for “fuldt stop”, Betal 1000 kroner i bøde\n",                           //2
            "Betal for vognvask og smøring kr 300\n",                                                  //3
            "Betal kr 200 for levering af 2 kasser øl\n",                                              //4
            "Betal 3000 for reparation af deres vogn\n",                                               //5
            "Betal 3000 for reparation af deres vogn\n",                                               //6
            "De har købt 4 nye dæk til Deres vogn, betal kr 1000\n",                                   //7
            "De har fået en parkeringsbøde, betal kr 200 i bøde\n",                                    //8
            "Betal deres bilforsikring, kr 1000\n",                                                    //9
            "De har været udenlands og købt for mange smøger, betal kr 200 i told.\n",                 //10
            "Tandlægeregning, betal kr 2000.\n",                                                       //11
            "De har vundet i klasselotteriet. Modtag 500 kr.\n",                                       //12
            "De har vundet i klasselotteriet. Modtag 500 kr.\n",                                       //13
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",                              //14
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",                              //15
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",                              //16
            "Kommunen har eftergivet et kvartals skat. Hæv i banken 3000 kr.\n",                       //17
            "De have en række med elleve rigtige i tipning, modtag kl 1000\n",                         //18
            "Grundet dyrtiden har De fået gageforhøjelse, modtag kr 1000.\n",                          //19
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.\n",                   //20
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.\n",                   //21
            "De har solg nogle gamle møbler på auktion. Modtag 1000 kr af banken.\n",                  //22
            "Værdien af egen avl fra nyttehaven udgør 200 som de modtager af banken\n",                //23
            "De modtager “Matador-legatet” på kr 40.000, men kun hvis værdier ikke overstiger 15.000 kr\n", //24
            "Det er deres fødselsdag. Modtag af hver medspiller 200 kr.\n",                            //25
            "De har lagt penge ud til et sammenskudsgilde. Mærkværdigvis betaler alle straks. Modtag fra hver medspiller 500 kr.\n", //26
            "De skal holde familiefest og får et tilskud fra hver medspiller på 500 kr.\n",            //27
            "Ryk frem til START\n",                                                                    //28
            "Ryk frem til START\n",                                                                    //29
            "Ryk tre felter frem\n",                                                                   //30
            "Ryk tre felter tilbage\n",                                                                //31
            "Ryk tre felter tilbage \n",                                                               //32
            "Ryk frem til Frederiksberg Allé. Hvis De passere START, indkasser da 4000 kr.\n",         //33
            "Ryk frem til det nærmeste rederi og betal ejeren to gange den leje han ellers er berettiget til, hvis selskabet ikke ejes af nogen kan De købe det af banken.\n",  //34
            "Ryk frem til det nærmeste rederi og betal ejeren to gange den leje han ellers er berettiget til, hvis selskabet ikke ejes af nogen kan De købe det af banken.\n",    //35
            "Tag med Mols-Linien, flyt brikken frem og hvis De passerer START indkassér da kr 4000.\n",//36
            "Ryk frem til Grønningen, hvis De passerer start indkasser da kr 4000\n",                  //37
            "Ryk frem til Vimmelskaftet, hvis de passerer start indkasser da kr 4000\n",               //38
            "Tag med den nærmeste færge, hvis de passerer start indkasser da kr 4000\n",               //39
            "Ryk frem til Strandvejen. Hvis De passere START, indkasser da 4000 kr.\n",                //40
            "Tag til Rådhuspladsen\n",                                                                 //41
            "I anledning af kongens fødselsdag benådes De herved for fængsel. Dette kort kan opbevares indtil De får brug for det, eller De kan sælge det. (antal kort: 2)\n",  //42
            "Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.\n",                      //43
            "Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.\n"};                      //44

    private int randomBunke, nextCardUp;

    public Chance(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);
        die8 = new Die();
        bunke1 = new int[]{1, 2, 3, 4, 5, 6,};
        bunke2 = new int[]{3, 6, 2, 4, 1, 5};
        bunke3 = new int[]{5, 6, 2, 3, 1, 4};
        bunke4 = new int[]{3, 1, 6, 2, 5, 4};
        bunke5 = new int[]{6, 4, 2, 5, 3, 1};
        bunke6 = new int[]{6, 2, 3, 4, 1, 5};

    }



}