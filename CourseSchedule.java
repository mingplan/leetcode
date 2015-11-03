package leetcode;

public class CourseSchedule {
	
	public static void main(String[] args){
		int[][] p = {{0,1},{3,1},{1,3},{3,2}};
		CourseSchedule course = new CourseSchedule();
		course.canFinish(4, p);
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if(prerequisites.length==0){
			return true;
		}
		boolean[] visited = new boolean[prerequisites.length];
		boolean[] visitedp = new boolean[numCourses];
		for(int i=0;i<prerequisites.length;i++){
			visited[i] = false;
		}
		for(int i=0;i<numCourses;i++){
			visitedp[i] = false;
		}
		return dfs(0,prerequisites,visited,visitedp);
		
	}
	
	public boolean dfs(int i,int[][] pre,boolean[] visited,boolean[] visitedp){
		int s = pre[i][0];
		int e = pre[i][1];
		visited[i]=true;
		visitedp[s]=true;
		if(visitedp[e]){
			return false;
		}
		boolean flag = true;
		for(int j=0;j<pre.length;j++){
			if(!visited[j]){
				if(pre[j][0]==e){
					flag = false;
				   return dfs(j,pre,visited,visitedp);
				}
			}
		}
		if(flag){
			int k =0;
			boolean f = false;
			for(int j=0;j<visited.length;j++){
				if(!f&&visited[j]==false){
					k=j;
					f=true;
				}
				visited[j] = false;
			}
			for(int j=0;j<visitedp.length;j++){
				visitedp[j] = false;
			}
			return dfs(k,pre,visited,visitedp);
		}
		return true;
	}

}
