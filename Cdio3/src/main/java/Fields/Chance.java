package Fields;
import org.example.Die;
import gui_main.GUI;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.


public class Chance extends Field {
    //directory of variables
    private Die die8;
    GUI gui;
    private int[] bunke1, bunke2, bunke3, bunke4, bunke5, bunke6;
    private int cardsNumber;
    int Random;

    //is referenced in method getChanceCards, and is used to implement the return the action that getChancecards gives.
    public int getCardsNumber() {
        System.out.println(cardsNumber + "test n.2");
        return cardsNumber;
    }


    //this method randomly chooses an array element from the chancecard array list.
    public String getChancecards() {

        cardsNumber = (int) (Math.random() * 32 + 1);
        System.out.println(chancecards + "Første test");
        String cards =  chancecards[cardsNumber];
        return cards;
    }


    //this is the chancecard arraylist, those are given by the matador task requirements given in Materials>chancecards.txt
    public String[] chancecards = new String[]{
            "De har kørt frem for “fuldt stop”, Betal 1000 kroner i bøde\n",                           //1
            "Betal for vognvask og smøring kr 300\n",                                                  //2
            "Betal kr 200 for levering af 2 kasser øl\n",                                              //3
            "Betal 3000 for reparation af deres vogn\n",                                               //4
            "Betal 3000 for reparation af deres vogn\n",                                               //5
            "De har købt 4 nye dæk til Deres vogn, betal kr 1000\n",                                   //6
            "De har fået en parkeringsbøde, betal kr 200 i bøde\n",                                    //7
            "Betal deres bilforsikring, kr 1000\n",                                                    //8
            "De har været udenlands og købt for mange smøger, betal kr 200 i told.\n",                 //9
            "Tandlægeregning, betal kr 2000.\n",                                                       //10
            "De har vundet i klasselotteriet. Modtag 500 kr.\n",                                       //11
            "De har vundet i klasselotteriet. Modtag 500 kr.\n",                                       //12
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",                              //13
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",                              //14
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken\n",                              //15
            "De have en række med elleve rigtige i tipning, modtag kl 1000\n",                         //16
            "Grundet dyrtiden har De fået gageforhøjelse, modtag kr 1000.\n",                          //17
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.\n",                   //18
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.\n",                   //19
            "De har solg nogle gamle møbler på auktion. Modtag 1000 kr af banken.\n",                  //20
            "Værdien af egen avl fra nyttehaven udgør 200 som de modtager af banken\n",                //21
            "Ryk frem til START\n",                                                                    //22
            "Ryk frem til START\n",                                                                    //23
            "Ryk tre felter frem\n",                                                                   //24
            "Ryk tre felter tilbage\n",                                                                //25
            "Ryk tre felter tilbage \n",                                                               //26
            "Ryk frem til Frederiksberg Allé. Hvis De passere START, indkasser da 4000 kr.\n",         //27
            "Ryk frem til Grønningen, hvis De passerer start indkasser da kr 4000\n",                  //28
            "Ryk frem til Vimmelskaftet, hvis de passerer start indkasser da kr 4000\n",               //29
            "Ryk frem til Strandvejen. Hvis De passere START, indkasser da 4000 kr.\n",                //30
            "Tag til Rådhuspladsen\n",                                                                 //31
            "Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.\n",                       //32
            "Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.\n"};                      //33


    //This method, does the absolutely amazing work, that it replicates a bundle of cards,
    //by putting the card you pick up, when landing on the "prøv lykken" field, on the bottom of the bundle.
    //this is a clear example of "pure fabrication" in GRASP
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