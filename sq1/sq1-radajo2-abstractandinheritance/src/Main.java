abstract class BuyChicken {
    public abstract void totalPieces(float cock, float hen, float chicken, float money);
}
class Calculate extends BuyChicken {
    @Override
    public void totalPieces(float cock, float hen, float chicken, float money) {
        int cockin =(int) cock;
        int henin = (int) hen;
        int chickenin =(int) chicken;

        //to get the max value in each rooster

        String output="";
        if (cock > 1) {
            cockin= (int) (money/cockin);

            if (hen > 1) {
                henin= (int) (money/henin);
                if (chicken > 1) {
                    chickenin= (int) (money/chickenin);
                } else {
                    chicken = 10 * chicken;
                    chickenin = 100*(int) chicken;
                }
            } else {
                hen = 10 * hen;
                henin = 100*(int) hen;
            }
        } else {
            cock = 10 * cock;
            cockin = 100*(int) cock;
        }
        for(int x=cockin; x>=0; x--){
            for(int y=henin; y>=0; y--){
                for(int z=chickenin; z>=0; z-=3){
                    if((x*5+y*3+z/3)==100 && (x+y+z)==100){
                        System.out.println("You can buy a 100 yuan worth of "+x+" Cock, "+y+" Hen, and "+z+" Chicken with a total of 100 pieces.");
                        break;
                    }
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BuyChicken buyChicken = new Calculate();
        float cock=5;
        float hen =3;
        float chicken=(float)1/3;
        float money=100;
        buyChicken.totalPieces(cock,hen,chicken,money);
    }
}