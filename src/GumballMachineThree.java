public class GumballMachineThree implements Machine {

    private int num_gumballs;
    private boolean has_coin;
    private int amount = 0;

    public GumballMachineThree(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_coin = false;
    }


    public void insertCoin(int coin)
    {
        if ( coin == 5 || coin == 10 || coin == 25 ) {
            this.has_coin = true;
            amount = amount + coin;
        }
        else
            this.has_coin = false;
    }

    @Override
    public void turnCrank()
    {
        if ( this.has_coin )
        {
            if ( this.num_gumballs > 0 )
            {
                if (amount <= 50)
                    System.out.println( "Please insert " + (50 - amount) + " cents" ) ;

                else {
                    this.num_gumballs--;
                    amount = 0;
                    System.out.println("Thanks for your coins.  Gumball Ejected!");
                }
            }
            else {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
            }
        }
        else {
            System.out.println( "Please insert fifty cents" ) ;
        }
    }
}
