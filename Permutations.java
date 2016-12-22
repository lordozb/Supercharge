import java.util.*;

public class Solution {
	
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		while(true){
			int i = n - 1;
			while(i > 0 && arr[i - 1] > arr[i])
				i--;
			if(i <= 0)
				break;
			int j = n - 1;
			while(j > (i - 1) && arr[i - 1] > arr[j])
				j--;
			if(j == i-1)
				break;

			int temp = arr[j];
			arr[j] = arr[i - 1];
			arr[i - 1] = temp;

			for(int k = i; k < n - 1; k++){
				if(arr[k] > arr[k+1]){
					temp = arr[k+1];
					arr[k+1] = arr[k];
					arr[k] = temp;
				}
			}

			for(int k = 0; k < n; k++)
				System.out.print(arr[k]+" ");
			System.out.println();
		}	
	}	
}
