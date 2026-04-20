class Solution {

    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    // HashMap<Character , Integer> map1 = new HashMap<>();
    // HashMap<Character , Integer> map2 = new HashMap<>();
    // public HashMap<Character, Integer> buildMap(String s){
    //     HashMap<Character , Integer> map = new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         if(map.isEmpty()) map.put(s.charAt(i),1);
    //         else if(!map.isEmpty() && !map.containsKey(s.charAt(i))){
    //             map.put(s.charAt(i),1);
    //         }
    //         else{
    //             int val = map.get(s.charAt(i));
    //             val++;
    //             map.put(s.charAt(i),val);
    //         }
    //     }
    //     return map;
    // }

    public int[] returnArray(String s){
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int val = arr[s.charAt(i)-'a'];
            val++;
            arr[s.charAt(i)-'a'] = val;
        }
        return arr;
    }

    public boolean isAnagram(String s, String t) {
        // map1 = buildMap(s);
        // map2 = buildMap(t);

        // HashMap<Character , Integer> maplen = new HashMap<>();

        // if(s.length() >= t.length()) maplen=map1;
        // else maplen = map2;

        // for(Map.Entry<Character, Integer> map: maplen.entrySet()){
        //     if(!map2.containsKey(map.getKey()) || map2.get(map.getKey())!=map.getValue()) return false;
        // }

        // return true;

        arr1 = returnArray(s);
        arr2 = returnArray(t);

        int[] arr = new int[26];
        String str = "";

        if(s.length() >=t.length()) {str = s; arr = arr1;}
        else {str = t; arr = arr2;}

        for(int i=0;i<str.length();i++){
            if(arr1[str.charAt(i)-'a'] != arr2[str.charAt(i)-'a'] ) return false;
        }
        return true;

    }
}
