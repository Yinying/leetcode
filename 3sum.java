public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        
        Arrays.sort(num);
        for (int i = 0; i < num.length-2; i++) {
            for (int j = i+1; j < num.length-1; j++) {
                for (int k = j+1; k < num.length; k++) {
                    if ( num[i] + num[j] + num[k] == 0) {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        
                        boolean duplicated = false;
                        for ( ArrayList<Integer> addedList: listOfList) {
                            if (list.equals(addedList)) {
                                duplicated = true;
                                break;
                            }
                        }
                        
                        if (! duplicated)
                            listOfList.add(list);
                    }
                }
            }
        }
        return listOfList;
    }
}