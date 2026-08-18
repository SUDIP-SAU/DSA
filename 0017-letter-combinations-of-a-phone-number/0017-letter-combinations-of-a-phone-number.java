class Solution {
    public List<String> letterCombinations(String digits) {

        HashMap<Character,String> hm = new HashMap<>();

        hm.put('2' , "abc");
        hm.put('3' , "def");
        hm.put('4' , "ghi");
        hm.put('5' , "jkl");
        hm.put('6' , "mno");
        hm.put('7' , "pqrs");
        hm.put('8' , "tuv");
        hm.put('9' , "wxyz");

        List<String> list = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        combinations(digits, hm, list, 0, curr);
        
        return list;
    }
    

    public static void combinations(String digits, HashMap<Character,String> hm, List<String> list, int idx, StringBuilder curr) {

        if (idx == digits.length()) {

            list.add(new String(curr));

            return;
        }

        String val = hm.get(digits.charAt(idx));

        for(char ch : val.toCharArray()){

            curr.append(ch);
            
            combinations(digits, hm, list, idx+1, curr);

            curr.deleteCharAt(curr.length()-1);
        }
    }
}