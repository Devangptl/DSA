public class Subset {

    public static void findSubset(String str , String ans ,  int i){
        //base case
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //recursion 
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //No choice
        findSubset(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "Devang";

        findSubset(str, "", 0);
        //TimeComplexity = O(n * 2^n)
        //spaceComplexity = O(n)

    }

}
