class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int pos=-1;
        int dis=999999;
        for(int i=0;i<points.length;i++)
        {
            if(points[i][0]==x || points[i][1]==y)
            {
                int cal = Math.abs(x-points[i][0]) + Math.abs(y- points[i][1]);
                if(dis>cal)
                {
                    pos=i;
                    dis=cal;
                }
            }
        }
        return pos;
    }
}