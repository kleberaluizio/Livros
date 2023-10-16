public class InventoryCalculator {
    public static void main(String[] args) {

        double sum = 0;
        int count = 0;

        while(count < 35){
            double bookValue = 59.90;
            sum+= bookValue;
            count++;
        }

        System.out.println("The total inventory's value is "+ sum);

        if(sum < 150){
            System.out.println("Our inventory is too low!");
        } else if (sum >= 2000){
            System.out.println("Our inventory is too high");
        } else {
            System.out.println("Our inventory is good");
        }

        for(int i = 0; i <= 10; i++){
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
    }
}
