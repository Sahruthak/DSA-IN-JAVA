#Min Cost to Connect All Points
    
public class DisjointSet{
    int[] parent, rank;
    public DisjointSet(int n){
        parent = new int[n];
        rank = new int[n];
        Arrays.fill(rank, 0);
        for(int i=0; i<n ;i++)
            parent[i] = i;
    }
    public int findParent(int node){
        if(parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }
    public void union(int x, int y){
        int parentX = findParent(x);
        int parentY = findParent(y);
        if(parentX == parentY) return;
        if(rank[parentY] > rank[parentX]) parent[parentX] = parentY;
        else if(rank[parentY] < rank[parentX]) parent[parentY] = parentX;
        else{
            parent[parentY] = parentX;
            rank[parentY]++;
        }
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int edges = 0;
        int totalWeight = 0;
        DisjointSet set = new DisjointSet(points.length);
        Queue<int[]> queue = new PriorityQueue<int[]>((a, b)->a[2]-b[2]);

        for(int i=0; i<points.length; i++){
            int[] current = points[i];
            int x1 = current[0];
            int y1 = current[1];
            for(int j= i+1; j<points.length; j++){
                current = points[j];
                int x2 = current[0];
                int y2 = current[1];
                int weight = Math.abs(x1-x2)+Math.abs(y1-y2);
                queue.offer(new int[]{i, j, weight});
            }
        }

        while(!queue.isEmpty() && edges < points.length-1){
            int[] edge = queue.poll();
            int x = edge[0], y= edge[1];
            if(set.findParent(x) == set.findParent(y))
                continue;
            set.union(x, y);
            totalWeight += edge[2];
            edges++;
        }

        return totalWeight;
    }
}
