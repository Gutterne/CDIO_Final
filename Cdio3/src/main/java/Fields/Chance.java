package Fields;
import org.example.Die;
import org.example.Player;
import gui_main.GUI;

public class Chance extends UnbuyableField {
    private Die die8;
    GUI gui;
    private   int [] bunke1,bunke2,bunke3,bunke4,bunke5,bunke6;


    public String getChancecards() {
        String cards = chancecards[(int) (Math.random() * 44 + 1)];
        return cards;
        }


    public String[] chancecards = new String[] {"Oliepriserne er steget, og De skal betale kr 500 pr hus og kr 2000 pr hotel\n",
            "Ejendomsskatten er steget. Ekstraudgifterne er: 800 kr pr hus, 2300 kr pr hotel.\n",
            "De har kørt frem for “fuldt stop”, Betal 1000 kroner i bøde\n",
            "Betal for vognvask og smøring kr 300\n",
            "Betal kr 200 for levering af 2 kasser øl\n",
            "Betal 3000 for reparation af deres vogn\n",
            "Betal 3000 for reparation af deres vogn\n",
            "De har købt 4 nye dæk til Deres vogn, betal kr 1000\n",
            "De har fået en parkeringsbøde, betal kr 200 i bøde\n",
            "Betal deres bilforsikring, kr 1000\n",
            "De har været udenlands og købt for mange smøger, betal kr 200 i told.\n",
            "Tandlægeregning, betal kr 2000.\n",
            "De har vundet i klasselotteriet. Modtag 500 kr.\n",
            "De har vundet i klasselotteriet. Modtag 500 kr.\n",
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",
            "Kommunen har eftergivet et kvartals skat. Hæv i banken 3000 kr.\n",
            "De have en række med elleve rigtige i tipning, modtag kl 1000\n",
            "Grundet dyrtiden har De fået gageforhøjelse, modtag kr 1000.\n",
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.\n",
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.\n",
            "De har solg nogle gamle møbler på auktion. Modtag 1000 kr af banken.\n",
            "Værdien af egen avl fra nyttehaven udgør 200 som de modtager af banken\n",
            "De modtager “Matador-legatet” på kr 40.000, men kun hvis værdier ikke overstiger 15.000 kr\n",
            "Det er deres fødselsdag. Modtag af hver medspiller 200 kr.\n",
            "De har lagt penge ud til et sammenskudsgilde. Mærkværdigvis betaler alle straks. Modtag fra hver medspiller 500 kr.\n",
            "De skal holde familiefest og får et tilskud fra hver medspiller på 500 kr.\n",
            "Ryk frem til START\n",
            "Ryk frem til START\n",
            "Ryk tre felter frem\n",
            "Ryk tre felter tilbage\n",
            "Ryk tre felter tilbage \n",
            "Ryk frem til Frederiksberg Allé. Hvis De passere START, indkasser da 4000 kr.\n",
            "Ryk frem til det nærmeste rederi og betal ejeren to gange den leje han ellers er berettiget til, hvis selskabet ikke ejes af nogen kan De købe det af banken.\n",
            "Ryk frem til det nærmeste rederi og betal ejeren to gange den leje han ellers er berettiget til, hvis selskabet ikke ejes af nogen kan De købe det af banken.\n",
            "Tag med Mols-Linien, flyt brikken frem og hvis De passerer START indkassér da kr 4000.\n",
            "Ryk frem til Grønningen, hvis De passerer start indkasser da kr 4000\n",
            "Ryk frem til Vimmelskaftet, hvis de passerer start indkasser da kr 4000\n",
            "Tag med den nærmeste færge, hvis de passerer start indkasser da kr 4000\n",
            "Ryk frem til Strandvejen. Hvis De passere START, indkasser da 4000 kr.\n",
            "Tag til Rådhuspladsen\n",
            "I anledning af kongens fødselsdag benådes De herved for fængsel. Dette kort kan opbevares indtil De får brug for det, eller De kan sælge det. (antal kort: 2)\n",
            "Gå i fængsel, De indkasserer ikke 4000 kr for at passere start. \n",
            "Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.\n"};

    private int randomBunke,nextCardUp;
    public Chance(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);
        die8 = new Die();
        bunke1 = new int[]{1,2,3,4,5,6,};
        bunke2 = new int[]{3,6,2,4,1,5};
        bunke3 = new int[]{5,6,2,3,1,4};
        bunke4 = new int[]{3,1,6,2,5,4};
        bunke5 = new int[]{6,4,2,5,3,1};
        bunke6 = new int[]{6,2,3,4,1,5};

    }


    public void landOndField(Player player10) {




    }
}