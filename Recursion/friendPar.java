public class friendPar {

    public static int friendParing(int n){


        //base
        if(n==1 | n==2){
            return n;
        }
        //choice 
        //single

        // int nm1 = friendParing(n-1);

        // // pair
        // int nm2 = friendParing(n-2);
        // int pair = (n-1) * nm2;

        // int totalPair = nm1 + pair;
        // return totalPair;

        return friendParing(n-1) + (n-1) * friendParing(n-2);

    }
    public static void main(String[] args) {

        System.out.println(friendParing(3));
    }
}
