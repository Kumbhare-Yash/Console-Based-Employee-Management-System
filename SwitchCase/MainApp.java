package SwitchCase;

import java.util.ArrayList;
import java.util.Scanner;
import Login.LOGINpGE;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		ArrayList<Employee> arrList = new ArrayList<Employee>();
		LOGINpGE l=new LOGINpGE();
		
	
		int Choo;
		
		do {
			System.out.println("Enter Username : ");
			String us=sc.next();
					
			if(l.getUserName().equals(us) || l.getUserName().equals(null)) {
				
				System.out.println("Enter Password : ");
				String pw=sc.next();
				if(l.getPassWord().equals(pw) || l.getPassWord().equals(null)) {
					System.out.println("login sucessfully\n");
					do{

						System.out.println("Enter Your CHOICE \n1.Add Details\n2.Delete DETAILS\n3.Display Details\n4.Update Details\n5.Test Mode ON\n6.Test Mode OFF\n0.Exit");
						
						Choo=sc.nextInt();
						
						switch (Choo) {
						case 1:
							int op;
							do {
								
								

								System.out.println("Choice one of the following :"
										+"\n 1.Manager"
										+ "\n 2.Salesexe"
										+ "\n 3. Devloper"
										+"\n0.exit"
										);
								op=sc.nextInt();
								
								System.out.println("----------------------------------------------------");
								
								
								if(op==1) {
									System.out.println("----------------------------------------------------");
									System.out.println("ENTER NO OF MANAGER YOU WANT TO ADD");
									System.out.println("----------------------------------------------------");
							        int n=sc.nextInt();
							        sc.nextLine();
									for(int i1=0;i1<n;i1++) {
										
										System.out.println("Enter Employee Information!!!");
										System.out.println("-----------------------------------------------");
										
										
//										System.out.println("Enter Employee Id :");
//										int id=sc.nextInt();
										
										System.out.println("------------------------------------");
										System.out.println("Enter Employee Name :");
										String name=sc.next();
										
										System.out.println("----------------------------------------------------");
										System.out.println("Enter Employee Basic Salary :");
										int bsal=sc.nextInt();
										
										System.out.println("--------------------------------------------------------");
																	
										System.out.println("Enter Incentive Ammount of Manager");
										double inc=sc.nextDouble();
										System.out.println("-----------------------------------------------");
										
									//	arrList.add(new Manager(id,name,bsal,inc));
										arrList.add(new Manager (name, bsal,inc));
														
										}
									}
								else if(op==2) {
									System.out.println("----------------------------------------------------");
									System.out.println("ENTER NO OF SALESEXECUTIVE YOU WANT TO ADD ");
									System.out.println("----------------------------------------------------");
							        int n=sc.nextInt();
							        sc.nextLine();
									for(int i1=0;i1<n;i1++) {
									
									System.out.println("Enter Employee Information!!!");
									System.out.println("-----------------------------------------------");
									
									
//									System.out.println("Enter Employee Id :");
//									int id=sc.nextInt();
									
									System.out.println("-----------------------------------------------");
									System.out.println("Enter Employee Name :");
									String name=sc.next();
									
									System.out.println("-----------------------------------------------");
									System.out.println("Enter Employee Basic Salary :");
									int bsal=sc.nextInt();
									
									System.out.println("-----------------------------------------------");
									
									System.out.println("Enter Travell Allowance for Salesexe :");
									double ta=sc.nextDouble();
									System.out.println("-----------------------------------------------");
									
									//arrList.add(new Salesexe(id, name, bsal,ta));
									arrList.add(new Salesexe(name, bsal,ta));
							
									}																																				
								}else if(op==3) {
									System.out.println("----------------------------------------------------");
									System.out.println("ENTER NO OF DEVELOPER YOU WANT TO ADD");
									System.out.println("----------------------------------------------------");
							        int n=sc.nextInt();
							        sc.nextLine();
									for(int i1=0;i1<n;i1++) {
									
									System.out.println("Enter Employee Information!!!");
									System.out.println("-----------------------------------------------");
									
									
//									System.out.println("Enter Employee Id :");
//									int id=sc.nextInt();
									
									System.out.println("-----------------------------------------------");
									System.out.println("Enter Employee Name :");
									String name=sc.next();
									
									System.out.println("-----------------------------------------------");
									System.out.println("Enter Employee Basic Salary :");
									int bsal=sc.nextInt();
									
									System.out.println("------------------------------------------------");
									
									
									System.out.println("Enter Night work Allowance for Devloper");
									double na=sc.nextDouble();
									System.out.println("---------------------------------------------------------");
									
									//arrList.add(new Devloper (id,name, bsal,na));
									arrList.add(new Devloper(name,bsal,na));
									
									}
								}
							}while(op != 0);
							
							break;
							
						case 2:
							
						if(arrList.isEmpty()) {
							System.err.println("Nothing TO Delete In List");
						}else {
							int delete;
							do {
								
								
								System.out.println("ENTER THE CHOISE :\n0.exit\n1.Delete By ID\n2.Delete By Name");
								delete = sc.nextInt();
								switch(delete){
								
								case 1:
									 System.out.println("Enter Employee Id You Want to Delete: ");
		                             int D_ID = sc.nextInt();
		                             
		                             int flag = 0;
		                             for (int i = 0; i < arrList.size(); i++) {
		                                 Object obj = arrList.get(i);
		                                 
		                                 if (obj instanceof Manager && ((Manager) obj).getEmpId() == D_ID) {
		                                     arrList.remove(i);
		                                     flag = 1;
		                                     break;
		                                 } else if (obj instanceof Salesexe && ((Salesexe) obj).getEmpId() == D_ID) {
		                                     arrList.remove(i);
		                                     flag = 1;
		                                     break;
		                                 } else if (obj instanceof Devloper && ((Devloper) obj).getEmpId() == D_ID) {
		                                     arrList.remove(i);
		                                     flag = 1;
		                                     break;
		                                 }
		                             }
		                             
		                             if (flag == 1) {
		                                 System.out.println("Employee with ID " + D_ID + " deleted successfully.");
		                             } else {
		                                 System.out.println("Employee with ID " + D_ID + " not found.");
		                             }
									break;
								
								case 2:
									
									 System.out.println("Enter Employee Name You Want to Delete: ");
		                             String D_NAME = sc.nextLine();
		                             
		                             int flag1 = 0;
		                             for (int i = 0; i < arrList.size(); i++) {
		                                 Object obj = arrList.get(i);
		                                 
		                                 if (obj instanceof Manager && ((Manager) obj).getEmpName().equals(D_NAME)) {
		                                     arrList.remove(i);
		                                     flag1 = 1;
		                                     break;
		                                 } else if (obj instanceof Salesexe && ((Salesexe) obj).getEmpName().equals(D_NAME)) {
		                                     arrList.remove(i);
		                                     flag1 = 1;
		                                     break;
		                                 } else if (obj instanceof Devloper && ((Devloper) obj).getEmpName().equals(D_NAME)) {
		                                     arrList.remove(i);
		                                     flag1 = 1;
		                                     break;
		                                 }
		                             }
		                             
		                             if (flag1 == 1) {
		                                 System.out.println("Employee with name " +D_NAME + " deleted successfully.");
		                             } else {
		                                 System.out.println("Employee with name " +D_NAME + " not found.");
		                             }
							
									break;
									
								case 0:
										break;
								}	
							}while(delete !=0);
						}
						break;
							
						case 3:
						    if (arrList.isEmpty()) {
						        System.err.println("The list is empty. Nothing to display.");
						    } else {
						        int displayOption;
						        do {
						            System.out.println("Choose how to display the list:");
						            System.out.println("1. Display  by sorted Name");
						            System.out.println("2. Display  by Department");
						            System.out.println("0. Exit");
						            displayOption = sc.nextInt();
						            
						            switch (displayOption) {
						                case 1:
						                    arrList.sort((o1, o2) -> o1.getEmpName().compareToIgnoreCase(o2.getEmpName()));
						                    System.out.println("Employees sorted by Name:");
						                    for (Object o : arrList) {
						                        System.out.println(o);
						                        System.out.println("-----------------------------------------------");
						                    }
						                    break;
						                
						                case 2: 						                	
						                    System.out.println("-----------------\nManagers:");
						                    for (Employee emp : arrList) {
						                        if (emp instanceof Manager) {
						                            System.out.println(emp);
						                        }
						                    }

						                    System.out.println("-----------------\nSales Executives:");
						                    for (Employee emp : arrList) {
						                        if (emp instanceof Salesexe) {
						                            System.out.println(emp);
						                        }
						                    }

						                    System.out.println("-----------------\nDevelopers:");
						                    for (Employee emp : arrList) {
						                        if (emp instanceof Devloper) {
						                            System.out.println(emp);
						                        }
						                    }
						                    break;
						                case 0:
						                    
						                    break;
						                    
						                default:
						                    System.out.println("Invalid option. Please enter a valid choice.");
						                    break;
						            }
						        } while (displayOption != 0);
						    }
						    break;

						case 4:  
						   if(arrList.isEmpty()) {
							   System.err.println("No employee details to Update.");
						   }else {
							   System.out.println("------Enter Employee ID You Want to Update-------");
							    int U_ID = sc.nextInt();

							    boolean updateFound = false;

							    for (int i = 0; i < arrList.size(); i++) {
							        Object obj = arrList.get(i);

							        if (obj instanceof Manager && ((Manager) obj).getEmpId() == U_ID) {
							        	System.out.println("Updating Developer Details:\nChoose what to update:\n1. Name\n2. Basic Salary\n3.Allowance");
							            
							            int updateChoice = sc.nextInt();
							            sc.nextLine();

							            switch (updateChoice) {
							                case 1:
							                    System.out.print("Enter New Name: ");
							                    String newName = sc.nextLine();
							                    ((Manager) obj).setEmpName(newName);
							                    break;
							                case 2:
							                    System.out.print("Enter New Basic Salary: ");
							                    int newBasicSalary = sc.nextInt();
							                    ((Manager) obj).setBasicSal(newBasicSalary);
							                    break;
							                case 3:
							                    System.out.print("Enter New Incentive: ");
							                    double newIncentive = sc.nextDouble();
							                    ((Manager) obj).setInc(newIncentive);
							                    break;
							                default:
							                    System.out.println("Invalid option.");
							                    break;
							            }

							            updateFound = true;
							            break;
							        }
							        else if (obj instanceof Salesexe && ((Salesexe) obj).getEmpId() == U_ID) {
							        	System.out.println("Updating Developer Details:\nChoose what to update:\n1. Name\n2. Basic Salary\n3.Allowance");
							            
							            int updateChoice = sc.nextInt();
							            sc.nextLine();

							            switch (updateChoice) {
							                case 1:
							                    System.out.print("Enter New Name: ");
							                    String newName = sc.nextLine();
							                    ((Salesexe) obj).setEmpName(newName);
							                    break;
							                case 2:
							                    System.out.print("Enter New Basic Salary: ");
							                    int newBasicSalary = sc.nextInt();
							                    ((Salesexe) obj).setBasicSal(newBasicSalary);
							                    break;
							                case 3:
							                    System.out.print("Enter New Travel Allowance: ");
							                    double newTravelAllowance = sc.nextDouble();
							                    ((Salesexe) obj).setTra(newTravelAllowance);
							                    break;
							                default:
							                    System.out.println("Invalid option.");
							                    break;
							            }

							            updateFound = true;
							            break;
							        }
							        else if (obj instanceof Devloper && ((Devloper) obj).getEmpId() == U_ID) {
							            System.out.println("Updating Developer Details:\nChoose what to update:\n1. Name\n2. Basic Salary\n3.Allowance");
							            int updateChoice = sc.nextInt();
							            sc.nextLine();

							            switch (updateChoice) {
							                case 1:
							                    System.out.print("Enter New Name: ");
							                    String newName = sc.nextLine();
							                    ((Devloper) obj).setEmpName(newName);
							                    break;
							                case 2:
							                    System.out.print("Enter New Basic Salary: ");
							                    int newBasicSalary = sc.nextInt();
							                    ((Devloper) obj).setBasicSal(newBasicSalary);
							                    break;
							                case 3:
							                    System.out.print("Enter New Night Allowance: ");
							                    double newNightAllowance = sc.nextDouble();
							                    ((Devloper) obj).setNa(newNightAllowance);
							                    break;
							                default:
							                    System.out.println("Invalid option.");
							                    break;
							            }

							            updateFound = true;
							            break;
							        }
							    }

							    if (updateFound) {
							        System.out.println("Employee with ID " + U_ID + " updated successfully.");
							    } else {
							        System.out.println("Employee with ID " + U_ID + " not found.");
							    }
						   }
						    break;

						case 5:
							arrList.add(new Salesexe( "name2", 12000, 4030));
							arrList.add(new Manager( "name1", 34033,3040));
							arrList.add(new Devloper("name3", 23000, 2030));
							arrList.add(new Devloper("name5", 35000, 4430));
							arrList.add(new Salesexe("name4", 15666,  2230));
							arrList.add(new Salesexe("Alice", 14500, 2500));
							arrList.add(new Manager("Bob", 42000, 3000));
							arrList.add(new Manager("Charlie", 29000, 4000));
							arrList.add(new Devloper("Diana", 32000, 5000));
							arrList.add(new Salesexe("Eve", 17500, 3000));
							System.err.println("==========================");
							System.err.println("Test Mode Entered.");
							System.err.println("==========================");
							break;
//							
						case 6:
							
							if(arrList.isEmpty()) {
								System.err.println("Test Mode Already off");
							}else {
						        arrList.clear(); 
								System.err.println("==========================");
						        System.err.println("Test Mode Exited.");
								System.err.println("==========================");
							}
						    break;
							
						default:
							break;
						}
						
					}while(Choo !=0);


				}
				else {
					System.err.println("invalid Password\n Try Again");
				}
			}
			else {
				System.err.println("invalid username\n  Try Again");
			}
			sc.close();
		}while(true);
		
	}
	
}