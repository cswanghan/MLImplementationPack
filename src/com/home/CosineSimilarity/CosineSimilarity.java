package com.home.CosineSimilarity;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * 	The similarity is defined as:
 *	cosine(theta) = A . B / ||A|| ||B||
 *	For a vector A = (a1, a2), ||A|| is defined as sqrt(a1^2 + a2^2)
 *	For vector A = (a1, a2) and B = (b1, b2), A . B is defined as a1 b1 + a2 b2;
 *	So for vector A = (a1, a2) and B = (b1, b2), the cosine similarity is given as:
 *	(a1 b1 + a2 b2) / sqrt(a1^2 + a2^2) sqrt(b1^2 + b2^2)
 */

public class CosineSimilarity {
		/**
		 * @author Han
		 * @Date 05/21/2013
		 * @Description: This function will calculate |A|
		 */
		public double SqrtCalculator(double[] InputArray)
		{
				double result = 0.0;
				Double sum = 0.0;
				for(int i = 0; i < InputArray.length; i++)
				{
					sum = sum + InputArray[i] * InputArray[i];
				}
				result = Math.sqrt(sum);
				return result;
		}
		
		public double DotMultiplyCalculator(double[] a_array, double[] b_array)
		{
				double result = 0.0;
				if(a_array.length != b_array.length)
						System.out.println("Array Inputs are Wrong, they're size are not equal! " +
									   "I can't calculate it.");
				else
				{
						int length = a_array.length;
						//double sum = 0.0;
						for(int i = 0; i <  length; i++)
						{
								result = result + a_array[i] * b_array[i];
						}
				}
				return result;
		}
		
		public static void main(String args[])
		{
			CosineSimilarity cs = new CosineSimilarity();
			double[] a = {1.5,2.5};
			double[] b = {2.5,3.5};
			
			double dot_result = cs.DotMultiplyCalculator(a, b);
			double sqrt_a = cs.SqrtCalculator(a);
			double sqrt_b = cs.SqrtCalculator(b);
			double similarity = dot_result / (sqrt_a * sqrt_b);
			
			System.out.println("The similarity between Array_a and Array_b is : " + similarity);
		}
}


