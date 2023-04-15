package com.bldea.crorepati.pkg1;
import java.util.Scanner;
public class Question {
	static String result;
	static String result2;
	static int count_life_line=3;
	static int aud_phn=1;
	static int cnt_50_50=1;
	static int skip_cnt=1;
	static Scanner sc=new Scanner(System.in);
	public static boolean fetchQuestion1(String name) throws Exception {
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(1000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(1000);
					return true;
				}
			}

		}


		return false;
	}
	public static boolean fetchQuestion2(String name) throws Exception {
		System.out.println("2.The band BTS having jimin,V,JK as 3 members is from which asian country?");
		System.out.println("a) North Korea\n"+
				"b)South Korea\n"+
				"c)Newyork\n"+
				"d)India\n"+
				"e)lifeline");
		result=sc.next();
		if(result.equalsIgnoreCase("b")) {
			Candidate.setAmount(5000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 87%\n" + "option c = 8%\n" + "option d = 6%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) North Korea\n" + "b)South Korea \n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) North Korea\n"+
												"b)South Korea\n"+
												"c)Newyork\n"+
												"d)India\n"+
												"e)lifeline");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) North Korea\n" + "d) South Korea\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) North Korea\n"+
												"b)South Korea\n"+
												"c)Newyork\n"+
												"d)India\n"+
												"e)lifeline");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) North Korea\n" + "b) South Korea\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) North Korea\n"+
												"b)South Korea\n"+
												"c)Newyork\n"+
												"d)India\n"+
												"e)lifeline");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) North Korea\n"+
												"b)South Korea\n"+
												"c)Newyork\n"+
												"d)India\n"+
												"e)lifeline");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) North Korea\n" + "b) South Korea\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) North Korea\n"+
												"b)South Korea\n"+
												"c)Newyork\n"+
												"d)India\n"+
												"e)lifeline");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) North Korea\n" + "b) South Korea\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) North Korea\n"+
												"b)South Korea\n"+
												"c)Newyork\n"+
												"d)India\n"+
												"e)lifeline");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(5000);
					return true;
				}
			}

		}


		return false;
	}
	
	
		public static boolean fetchQuestion3(String name)throws Exception
		{
			System.out.println("3. Which of the follwing are called key industrial Animals?");
			System.out.println("a) Producers\n"+
					"b)Tertiary Cosumers\n"+
					"c)Primary Consumers\n"+
					"d)None of these\n"+
					"e)life line" );
			result=sc.next();
			if(result.equalsIgnoreCase("c")) {
				Candidate.setAmount(10000);
				return true;
			}
			else if(result.equalsIgnoreCase("e")) {
				if(count_life_line>0){
					System.out.println("avaliable life lines are:\n"
							+"a. Audiance Phone\n"
							+"b. 50-50\n"
							+"c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 84%\n" + "option d = 6%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) Primary Consumers\n" + "b) Tertiary Consumers\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Producers\n"+
												"b)Tertiary Cosumers\n"+
												"c)Primary Consumers\n"+
												"d)None of these\n"+
												"e)life line" );
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c) Primary Consumers\n" + "b) Tertiary Consumers\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Producers\n"+
												"b)Tertiary Cosumers\n"+
												"c)Primary Consumers\n"+
												"d)None of these\n"+
												"e)life line" );
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c)Primary Consumers \n" + "b) Tertiary Consumers\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Producers\n"+
												"b)Tertiary Cosumers\n"+
												"c)Primary Consumers\n"+
												"d)None of these\n"+
												"e)life line" );
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Producers\n"+
												"b)Tertiary Cosumers\n"+
												"c)Primary Consumers\n"+
												"d)None of these\n"+
												"e)life line" );
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Primary Consumers\n" + "b) Tertiary Consumers\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Producers\n"+
												"b)Tertiary Cosumers\n"+
												"c)Primary Consumers\n"+
												"d)None of these\n"+
												"e)life line" );
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Primary Consumers\n" + "b)Tertiary Consumers\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Producers\n"+
												"b)Tertiary Cosumers\n"+
												"c)Primary Consumers\n"+
												"d)None of these\n"+
												"e)life line" );
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	}
	
	
	public static boolean fetchQuestion4(String name) throws Exception
	{
		System.out.println("4.B.C.Roy Award is given in the field of?");
		System.out.println("a)Music\n"+
				"b)Journalism\n"+
				"c)Medicine\n"+
				"d)Environment\n"+
				"e)life line" );
		result=sc.next();
		if(result.equalsIgnoreCase("c")) {
			Candidate.setAmount(20000);
			return true;
		}


		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
		
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(20000);
					System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 84%\n" + "option d = 6%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(20000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c) Medicine\n" + "a) Music\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(20000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Music\n"+
											"b)Journalism\n"+
											"c)Medicine\n"+
											"d)Environment\n"+
											"e)life line" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(20000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) Medicine\n" + "a) Music\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Music\n"+
											"b)Journalism\n"+
											"c)Medicine\n"+
											"d)Environment\n"+
											"e)life line" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c)Medicine \n" + "a)Muisc\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(20000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(20000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(20000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Music\n"+
											"b)Journalism\n"+
											"c)Medicine\n"+
											"d)Environment\n"+
											"e)life line" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(20000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Music\n"+
											"b)Journalism\n"+
											"c)Medicine\n"+
											"d)Environment\n"+
											"e)life line" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(20000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)Medicine\n" + "a) Music\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Music\n"+
											"b)Journalism\n"+
											"c)Medicine\n"+
											"d)Environment\n"+
											"e)life line" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)Medicine\n" + "a)Music\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Music\n"+
											"b)Journalism\n"+
											"c)Medicine\n"+
											"d)Environment\n"+
											"e)life line" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(20000);
				return true;
			}
		}

	}


	return false;
}


	
		
	public static boolean fetchQuestion5(String name)throws Exception
	{
		System.out.println("5.Which Scientist discovered the radioactive element radium?");
		System.out.println("a)Issac Newton\n"+
				"b)Albert Einstein\n"+
				"c)Benjamin Franklin\n"+
				"d)Marie Curie\n"+
				"e)life line\n");
		result=sc.next();
		if(result.equalsIgnoreCase("d")) {
			Candidate.setAmount(30000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(30000);
					System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 4%\n" + "option d = 69%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(30000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Issac Newton\n" + "d)Marie Curie\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(30000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Issac Newton\n"+
											"b)Albert Einstein\n"+
											"c)Benjamin Franklin\n"+
											"d)Marie Curie\n"+
											"e)life line\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(30000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Issac Newton\n" + "d)Marie Curie\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Issac Newton\n"+
											"b)Albert Einstein\n"+
											"c)Benjamin Franklin\n"+
											"d)Marie Curie\n"+
											"e)life line\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a)Issac Newton\n" + "d)Marie Curie\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(30000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 77%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(30000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Issac Newton\n"+
											"b)Albert Einstein\n"+
											"c)Benjamin Franklin\n"+
											"d)Marie Curie\n"+
											"e)life line\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(30000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 77%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Issac Newton\n"+
											"b)Albert Einstein\n"+
											"c)Benjamin Franklin\n"+
											"d)Marie Curie\n"+
											"e)life line\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(30000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 77%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Issac Newton\n" + "d) Marie Curie\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Issac Newton\n"+
											"b)Albert Einstein\n"+
											"c)Benjamin Franklin\n"+
											"d)Marie Curie\n"+
											"e)life line\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Issac Newton\n" + "d)Marie Curie\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(30000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 77%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Issac Newton\n"+
											"b)Albert Einstein\n"+
											"c)Benjamin Franklin\n"+
											"d)Marie Curie\n"+
											"e)life line\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(30000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(30000);
				return true;
			}
		}

	}


	return false;
}


	public static boolean fetchQuestion6(String name) throws Exception
	{
		System.out.println("6.Which was the first non test playing country to beat India in an International match?");
		System.out.println("a) Canada\n"+
				"b)Srilanka\n"+
				"c)Zimbabwe\n"+
				"d)East Africa\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("b")) {
			Candidate.setAmount(40000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 77%\n" + "option c = 4%\n" + "option d = 6%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(40000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)Srilanka\n" + "a) Canada\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(40000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Canada\n"+
											"b)Srilanka\n"+
											"c)Zimbabwe\n"+
											"d)East Africa\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(40000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)Srilanka\n" + "a) Canada\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Canada\n"+
											"b)Srilanka\n"+
											"c)Zimbabwe\n"+
											"d)East Africa\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("b)Srilanka \n" + "a) Canada\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(40000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(40000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Canada\n"+
											"b)Srilanka\n"+
											"c)Zimbabwe\n"+
											"d)East Africa\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(40000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Canada\n"+
											"b)Srilanka\n"+
											"c)Zimbabwe\n"+
											"d)East Africa\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(40000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)Srilanka\n" + "a)Canada\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Canada\n"+
											"b)Srilanka\n"+
											"c)Zimbabwe\n"+
											"d)East Africa\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b)Srilanka\n" + "a)Canada\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Canada\n"+
											"b)Srilanka\n"+
											"c)Zimbabwe\n"+
											"d)East Africa\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				Candidate.setAmount(40000);
				return true;
			}
		}

	}


	return false;
}


	public static boolean fetchQuestion7(String name) throws Exception
	{
		System.out.println("7.The most ElectroMagnetic element among the following is?");
		System.out.println("a)Sodium\n"+
				"b)Bromine\n"+
				"c)Fluorine\n"+
				"d)Oxygen\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("c")) {
			Candidate.setAmount(50000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 84%\n" + "option d = 6%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(50000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)Flourine\n" + "d)Oxygen\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(50000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Sodium\n"+
											"b)Bromine\n"+
											"c)Fluorine\n"+
											"d)Oxygen\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(50000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)Flourine\n" + "d)Oxygen\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Sodium\n"+
											"b)Bromine\n"+
											"c)Fluorine\n"+
											"d)Oxygen\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c)Flourine \n" + "d)Oxygen\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(50000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(50000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Sodium\n"+
											"b)Bromine\n"+
											"c)Fluorine\n"+
											"d)Oxygen\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(50000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Sodium\n"+
											"b)Bromine\n"+
											"c)Fluorine\n"+
											"d)Oxygen\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(50000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)Flourine\n" + "d)Oxygen\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Sodium\n"+
											"b)Bromine\n"+
											"c)Fluorine\n"+
											"d)Oxygen\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)Flourine\n" + "d)Oxygen\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)Sodium\n"+
											"b)Bromine\n"+
											"c)Fluorine\n"+
											"d)Oxygen\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(50000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(50000);
				return true;
			}
		}

	}


	return false;
}


	public static boolean fetchQuestion8(String name) throws Exception
	{
		System.out.println("8..MOV extension refers usually to what kind of file?");
		System.out.println("a)image file\n"+
				"b)Animation/Movie File\n"+
				"c)Audio file\n"+
				"d)MS office document\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("b")) {
			Candidate.setAmount(60000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 76%\n" + "option c = 4%\n" + "option d = 6%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(60000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)Audio file\n" + "b) Animation/movie file\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(60000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(60000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)image file\n"+
											"b)Animation/Movie File\n"+
											"c)Audio file\n"+
											"d)MS office document\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(60000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) audio file\n" + "b) Animation/Movie file\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)image file\n"+
											"b)Animation/Movie File\n"+
											"c)Audio file\n"+
											"d)MS office document\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c)audio file\n" + "b)Animation/Movie file\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(60000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(60000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(60000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)image file\n"+
											"b)Animation/Movie File\n"+
											"c)Audio file\n"+
											"d)MS office document\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(60000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(60000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)image file\n"+
											"b)Animation/Movie File\n"+
											"c)Audio file\n"+
											"d)MS office document\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(60000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(60000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Audio file\n" + "b)Animation/Movie file\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)image file\n"+
											"b)Animation/Movie File\n"+
											"c)Audio file\n"+
											"d)MS office document\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Audio file\n" + "b)Animation/Movie file\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(60000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)image file\n"+
											"b)Animation/Movie File\n"+
											"c)Audio file\n"+
											"d)MS office document\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(60000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				Candidate.setAmount(60000);
				return true;
			}
		}

	}


	return false;
}


	public static boolean fetchQuestion9(String name) throws Exception
	{
		System.out.println("9.Mughal emperor Akbar divided his empire into?");
		System.out.println("a) 8 provinces\n"+
				"b)5 provinces\n"+
				"c)12 provinces\n"+
				"d)10 provinces\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("c")) {
			Candidate.setAmount(70000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"1. Audiance Phone\n"
						+"2. 50-50\n"
						+"3. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 84%\n" + "option d = 6%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(70000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c) 12 provinces\n" + "b) 5 provinces\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(70000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(70000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 8 provinces\n"+
											"b)5 provinces\n"+
											"c)12 provinces\n"+
											"d)10 provinces\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(70000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)12 provinces\n" + "b)5 provinces\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 8 provinces\n"+
											"b)5 provinces\n"+
											"c)12 provinces\n"+
											"d)10 provinces\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c)12 provinces \n" + "b)5 provinces\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(70000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(70000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(70000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 8 provinces\n"+
											"b)5 provinces\n"+
											"c)12 provinces\n"+
											"d)10 provinces\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(70000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 8 provinces\n"+
											"b)5 provinces\n"+
											"c)12 provinces\n"+
											"d)10 provinces\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(70000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(70000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c)12 provinces\n" + "b)  provinces\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 8 provinces\n"+
											"b)5 provinces\n"+
											"c)12 provinces\n"+
											"d)10 provinces\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c)12 provinces\n" + "b)5 provinces\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(70000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 84%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 8 provinces\n"+
											"b)5 provinces\n"+
											"c)12 provinces\n"+
											"d)10 provinces\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(70000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(70000);
				return true;
			}
		}

	}


	return false;
}


	public static boolean fetchQuestion10(String name) throws Exception
	{
		System.out.println("10.The most efficient datatype for an variable that stores the letter C is the _____ datatype?");
		System.out.println("a)character\n"+
				"b)Double\n"+
				"c)Float\n"+
				"d)Long Integer\n"+
				"e)life line");
		result=sc.next();
		if(result.equalsIgnoreCase("a")) {
			Candidate.setAmount(100000);
			return true;
		}
		else if(result.equalsIgnoreCase("e")) {
			if(count_life_line>0){
				System.out.println("avaliable life lines are:\n"
						+"a. Audiance Phone\n"
						+"b. 50-50\n"
						+"c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 78%\n" + "option b = 7%\n" + "option c = 4%\n" + "option d = 6%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(100000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) character\n" + "c) Float\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(100000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)character\n"+
											"b)Double\n"+
											"c)Float\n"+
											"d)Long Integer\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(100000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Character\n" + "c) Float\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)character\n"+
											"b)Double\n"+
											"c)Float\n"+
											"d)Long Integer\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a)Character\n" + "c) Float\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(100000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(100000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)character\n"+
											"b)Double\n"+
											"c)Float\n"+
											"d)Long Integer\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(100000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)character\n"+
											"b)Double\n"+
											"c)Float\n"+
											"d)Long Integer\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(100000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Character\n" + "c) Float\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)character\n"+
											"b)Double\n"+
											"c)Float\n"+
											"d)Long Integer\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a)Character\n" + "c)Float\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 75%\n" + "option c = 4%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a)character\n"+
											"b)Double\n"+
											"c)Float\n"+
											"d)Long Integer\n"+
											"e)life line");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				Candidate.setAmount(100000);
				return true;
			}
		}

	}


	return false;
}
}

