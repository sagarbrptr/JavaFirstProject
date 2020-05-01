package com.sapient.week4;

import java.util.Scanner;

public class Matrix {
	private int[][] matrix;
	private int rowSize,colSize;
	
	Matrix()
	{
		rowSize=3;
		colSize=3;
		this.matrix= new int[3][3];
	}
	Matrix(int row,int col)
	{
		rowSize=row;
		colSize=col;
		this.matrix= new int[row][col];
	}
	Matrix(Matrix that)
	{
		this.rowSize=that.rowSize;
		this.colSize=that.colSize;
		this.matrix=that.matrix;
	}
	Matrix(int[][] mat)
	{
		this.matrix=mat;
		this.rowSize=mat.length;
		this.colSize=mat[0].length;
	}
	public void readMatrix()
	{
		System.out.println("Enter row and col size of matrix : ");
		Scanner scanner = new Scanner(System.in);
		rowSize=scanner.nextInt();
		colSize=scanner.nextInt();
		this.matrix= new int[rowSize][colSize];
		System.out.println("Enter matrix row wise : \n");
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<colSize;j++)
				matrix[i][j]=scanner.nextInt();
		}
		scanner.close();
	}
	public void displayMatrix()
	{
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<colSize;j++)
				System.out.print(matrix[i][j]+ " ");
			System.out.println();
		}
	}
	public int[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	public int getRowSize() {
		return rowSize;
	}
	public void setRowSize(int rowSize) {
		this.rowSize = rowSize;
	}
	public int getColSize() {
		return colSize;
	}
	public void setColSize(int colSize) {
		this.colSize = colSize;
	}
	public Matrix add(Matrix b)
	{
		Matrix res=null;
		if(b.getRowSize()!=this.rowSize || b.getColSize()!=this.colSize)
		{
			System.out.println("Error colsize and rowsize of the matrices didn't match.");
			return res;
		}
		int [][] resMatrix=new int[rowSize][colSize];
		int [][] bMatrix = b.getMatrix();
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<colSize;j++)
				resMatrix[i][j] = bMatrix[i][j] + this.matrix[i][j];
		}
		res = new Matrix(resMatrix);
		return res;
	}
	
	public Matrix multiply(Matrix b)
	{
		Matrix res=null;
		if(this.colSize!=b.getRowSize())
		{
			System.out.println("Error colsize of first matrix doesn't match with rowsize of the other matrix.");
			return res;
		}
		int [][] resMatrix=new int[rowSize][b.getColSize()];
		int [][] bMatrix = b.getMatrix();
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<b.getColSize();j++)
			{
				resMatrix[i][j] = 0;
				for(int k=0;k<colSize;k++)
					resMatrix[i][j]+=(matrix[i][k]*bMatrix[k][j]);
			}
		}
		res = new Matrix(resMatrix);
		return res;
	}
	public Boolean isScalor()
	{
		Boolean res=true;
		if(this.rowSize!=this.colSize)
			res=false;
		else
		{
			Boolean gotOneDiagonal=false;
			int diagonalElement = 0;
			for(int i=0;i<rowSize && res==true;i++)
			{
				for(int j=0;j<rowSize;j++)
				{
					if(i!=j)
					{
						if(matrix[i][j]!=0)
						{
							res=false;
							break;
						}
					}
					else
					{
						if(!gotOneDiagonal)
						{
							gotOneDiagonal=true;
							diagonalElement=matrix[i][j];
						}
						else if(matrix[i][j]!=diagonalElement)
						{
							res=false;
							break;
						}
							
					}
						
				}
			}
				
		}
		return res;
	}
}
