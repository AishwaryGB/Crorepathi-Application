package com.bldea.crorepati.pkg1;
import java.util.Scanner;
public class CrorepatiApp {

	public static void main(String[] args)throws Exception {
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("lets Welcome our first candidate");
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name?");
		String name =sc.next();
		System.out.println("what is your age?");
		int age =sc.nextInt();
		System.out.println("what is your city?");
		String city=sc.next();
		System.out.println("what is your state?");
		String state =sc.next();

		Candidate c1=new Candidate(name,age,city,state);
		System.out.println("Congratulations for making it till here Mr/Ms."+c1.getName());
		System.out.println("The rules of the Game:");
		System.out.println("1. There will be 10 question which rewards a specific amount in"+"incremental order");
		System.out.println("2. The Game will contain 3 Lifelines."+"(Audiance Poll,50-50,and Skip Qestion");
		System.out.println("3. you can Quit Game at any Stage.");
		System.out.println("please Type 1 if you Wish to see the Reward per Question");
		int type_1=sc.nextInt();
		if(type_1==1)
		{
			System.out.println("Question-1:1000\n"+
					"Question-2:5000\n"+
					"Question-3:10000\n"+
					"Question-4:20000\n"+
					"Question-5:30000\n"+
					"Question-6:40000\n"+
					"Question-7:50000\n"+
					"Question-8:60000\n"+
					"Question-9:70000\n"+
					"Question-10:100000\n");
			System.out.println("Do you Wish to Continue??(type:YES/NO)");

		}
		else
		{
			System.out.println("Do you Wish to Continue??(type:YES/NO)"); 
		}
		String type_2=sc.next();
		if(type_2.equalsIgnoreCase("yes")==true)
		{
			System.out.println("lets begin the Game.");
			System.out.println("Here's your First Question.");

			boolean res1=Question.fetchQuestion1(c1.getName());
			if (res1==true)
			{
				System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
				System.out.println("Here is your next Question");
				boolean res2=Question.fetchQuestion2(c1.getName());
				if (res2==true)
				{
					System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
					System.out.println("Here is your next Question");
					boolean res3=Question.fetchQuestion3(c1.getName());
					if (res3==true)
					{
						System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
						System.out.println("Here is your next Question");
						boolean res4=Question.fetchQuestion4(c1.getName());
						if (res4==true)
						{
							System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
							System.out.println("Here is your next Question");
							boolean res5=Question.fetchQuestion5(c1.getName());
							if (res5==true)
							{
								System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
								System.out.println("Here is your next Question");

								boolean res6=Question.fetchQuestion6(c1.getName());
								if (res6==true)
								{
									System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
									System.out.println("Here is your next Question");
									boolean res7=Question.fetchQuestion7(c1.getName());
									if (res7==true)
									{
										System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
										System.out.println("Here is your next Question");
										boolean res8=Question.fetchQuestion8(c1.getName());
										if (res8==true)
										{
											System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
											System.out.println("Here is your next Question");
											boolean res9=Question.fetchQuestion9(c1.getName());
											if (res9==true)
											{
												System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
												System.out.println("Here is your next Question");
												boolean res10=Question.fetchQuestion10(c1.getName());
												if (res10==true)
												{
													System.out.println("Congratulations!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());

												}
												else
												{
													System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
												}
											}
											else
											{

												System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
											}
										}
										else
										{

											System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
										}
									}else
									{

										System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
									}
								}
								else
								{

									System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
								}
							}
							else
							{

								System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
							}
						}
						else
						{

							System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
						}
					}else
					{

						System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
					}
				}
				else
				{

					System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
				}
			}
			else
			{

				System.out.println("we are sorry!! your answer is incorrect\n"+"you have won Rs."+c1.getAmount());
			}
		}
		else
		{
			System.out.println("Thankyou for coming all the best");
		}
	}
}








