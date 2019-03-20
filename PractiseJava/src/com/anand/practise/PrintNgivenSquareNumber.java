package com.anand.practise;

public class PrintNgivenSquareNumber {

	public static void main(String[] args) {
		int N = 6;
		//1.Print N thats 
		StringBuilder sb = new StringBuilder(N*2*N*2);
		for(int i = N; i>(1); i--) //Print upper part
		{
			for(int j = N; j >i; j--) sb.append(j +" ");
			for(int j = 0; j<(i*2)-1; j++) sb.append(i+" ");
			for(int j = i+1; j<=N; j++)	sb.append(j+" ");
			sb.append("\n");
		}
		for(int i = 1; i<=(N); i++)// print lower part
		    {
		        for(int j = N; j>i; j--)
		            sb.append(j+" ");
		        for(int j = 0; j<(i*2)-1; j++)
		            sb.append(i+" ");
		        for(int j = i+1; j <=N; j++)
		            sb.append(j+" ");
		        sb.append("\n");
		    }
		System.out.print(sb);
	}
}