/*Write a program that generate 6*6 two-dimensional matrix,
filled with 0’s and 1’s , display the matrix, check every raw and column have an odd number’s of 1’s. */
public class RandomMatrixMaker
{
	public static void main(String[] args)
	{	int i,j;
		int[][] matrix = new int[6][6];
		int[] rsum = new int[6];
		int[] csum = new int[6];
		for(i=0; i<=4; i++)//for random matrix number generator.
		{
			for(j=0; j<=4; j++)
			{
			
			matrix[i][j] =(int)(Math.random()*2);
			}
		}
			int c=0;
			for(i=0; i<=5; i++)//arrange the random numbers in the matrix.
			{
				for(j=0; j<=5; j++)	
				{
					System.out.print("\t" + matrix[i][j]);
					if((c+1)%6==0)
					{
					System.out.print("\n");	
					}
					c++;
				}
			}
					for(i=0; i<=4; i++)//for row sum.
					{	int rowsum=0;
						for(j=0; j<=4; j++)
						{
							rowsum=rowsum+matrix[i][j];
						}
							rsum[i]=rowsum%2;
							//System.out.print("row"+(i+1)+" = "+ rsum[i] +"\t");
					}
					for(i=0; i<=4; i++)//to make 6th column according to matrix rows.
					{
					 if(rsum[i]==0)
								matrix[i][5]=1;
							else
								matrix[i][5]=0;
					}
					for(i=0; i<=5; i++)//for column sum.
					{	int colsum=0;
						for(j=0; j<=5; j++)
						{
							colsum=colsum+matrix[j][i];
						}
							csum[i]=colsum%2;
						
							//System.out.println("col"+(i+1)+" = "+ csum[i]);
					}
					for(j=0; j<=5; j++)//to make 6th row according to matrix columns.
					{
					if(csum[j]==0)
								matrix[5][j]=1;
							else
								matrix[5][j]=0;		
					}
					System.out.println();
					int d=0;
					for(i=0; i<=5; i++)//print the new matrix again.
						{
						for(j=0; j<=5; j++)	
						{	
							System.out.print("\t" + matrix[i][j]);
							if((d+1)%6==0)
							{
								System.out.print("\n");	
							}
								d++;
						}
						}
	}
}
