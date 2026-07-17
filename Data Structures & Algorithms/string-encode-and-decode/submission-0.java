class Solution {

    public String encode(List<String> strs) {
        List<Integer> size = new ArrayList<Integer>();
        StringBuilder ans = new StringBuilder();

        //First we count the size of each string we encoding and save it in a list
        for(String str : strs){
            size.add(str.length());
        }

        //Then we create a new string where we will start by appending the character(number) of the length of the first string followed by a comma
        for(Integer i : size){
            ans.append(i);
            ans.append(",");
        }
        ans.append("#");
        //Repeat this for all the other strings sizes and end it with a "#" character

        //Then After the "#" we add append the strings and return the encoded string
        for(String str : strs){
            ans.append(str);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        //First we create a list of all the lengths of the strings
        List<Integer> size = new ArrayList<Integer>();
        List<String> res = new ArrayList<String>();
        int i = 0;
        //mistake made was trying to add a char to a List of type integer
        while(str.charAt(i) != '#'){
            StringBuilder len = new StringBuilder();
            while (str.charAt(i) != ','){
                len.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(len.toString()));
            i++;
        }
        i++;
        for(Integer sz : size){
            res.add(str.substring(i, i + sz));
            i += sz;        
        }

        return res;
        //Then with the known length of the respective strings we after the "#" we create a new string by grabbing the chunk using the known length of the substring
        //We repeat this for the other strings with their respective known lengths 
        //We return the strings in a list of strings
    }
}
