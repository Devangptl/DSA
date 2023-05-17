public class RemDupli {

    public static void removeDuplicatChar(String str , int index , StringBuilder newStr , boolean map[]  ){
        //base case
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        if(map[currChar -'a'] == true){
            removeDuplicatChar(str, index+1, newStr, map);
        }
        else{
            map[currChar -'a'] = true;
            removeDuplicatChar(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {

        String str = "aaabbbcccddee";
        removeDuplicatChar(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
