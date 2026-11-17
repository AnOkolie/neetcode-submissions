class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int ind = 0;
        while(ind < n && intervals[ind][1] < newInterval[0]){
            list.add(intervals[ind++]);
        }
        list.add(newInterval);
        for(int i=ind; i<n;i++){
            int index = list.size()-1;
            if(list.get(index)[1] >= intervals[i][0]){
                list.get(index)[0] = Math.min(list.get(index)[0],intervals[i][0]);
                list.get(index)[1] = Math.max(list.get(index)[1],intervals[i][1]);
            }else{
                list.add(intervals[i]);
            }
        }
        return list.toArray(int[][]::new);
    }
}
