
public class TowerOFhanoi {
	
	public static void towerofhanoi(int n,char from_rod,char to_rod,char aux_rod) {
		
		if(n==1) {
			
			System.out.println("Moving disk 1 from rod "+from_rod+"to dest "+to_rod);
		}
		else {
		towerofhanoi(n-1,from_rod,aux_rod,to_rod);
		System.out.println("Move disk "+n+"from source "+from_rod+"to dest"+to_rod);
		towerofhanoi(n-1,aux_rod,to_rod,from_rod);
		}
	}
	
	public static void main(String[] args) {
		
		 towerofhanoi(2,'A','B','C');
	}

}
