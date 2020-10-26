public class GumballMachineTwo implements Machine
{

    private int num_gumballs;
    private int count = 0;
    private boolean has_quarter;

    public GumballMachineTwo( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true;
        else
            this.has_quarter = false ;
    }

    @Override
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            count = count + 1;
            if (this.num_gumballs > 0) {
                if (count % 2 == 0) {
                    this.has_quarter = false;
                    this.num_gumballs--;
                    System.out.println("Thanks for your quarters.  Gumball Ejected!");

                }
                else
                    System.out.println( "Please insert one more quarter.");
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert two quarters" ) ;
        }
    }
}
