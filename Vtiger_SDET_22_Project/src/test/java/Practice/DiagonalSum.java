package Practice;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
        int i,j,row,col,sum=0,total=0,totalsum=0;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

    System.out.println("Enter the elements of the matrix") ;
    for(i=0;i<row;i++)
    { 
     for(j=0;j<col;j++)
     { 
         mat[i][j] = sc.nextInt();
    }
}

    System.out.println("The elements of the matrix") ;
    for(i=0;i<row;i++)
    { 
     for(j=0;j<col;j++)
     { 
       System.out.print(mat[i][j]+"\t");
    }
      System.out.println("");
}

    
    for(i=0;i<row;i++)
    { 
     for(j=0;j<col;j++)
     { 
    	 if(i==j) //this condition checks for diagonal
    		 sum = sum + mat[i][j];
    		 if ((i + j) == (2))
    			total=total+mat[i][j]; 
    		 
    	 }
    }
    System.out.println("SUM of  FIRST DIAGONAL elements of the matrix = "+sum) ;
    System.out.println("SUM of SECOND DIAGONAL elements of the matrix = "+total) ;
    System.out.println(totalsum=sum+total);
}

    

	}


