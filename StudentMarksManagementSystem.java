import java.util.*;
class StudentMarksManagementSystem{
	//-------------------- Sort in Database Management System Marks ------------------------------------------------------
	
	public static void sortinDatabaseManagementSystemMarks(String studentID[] , int studentMarks[][] , double sortDBMS[][]  ){
		
		for (int i = 0; i < sortDBMS.length; i++){
				sortDBMS[i][1] = -1;
		}
		for (int i = 0; i < studentMarks.length; i++){
				sortDBMS[i][0] = i;
				sortDBMS[i][1] = studentMarks[i][1];
		}
		for(int i=sortDBMS.length; i>0; i--){
			double max=sortDBMS[0][1];
			double in=sortDBMS[0][0];
			
			int index=0;
			for(int j=1; j<i; j++){
				if(sortDBMS[j][1]>max){
					max=sortDBMS[j][1];
					in=sortDBMS[j][0];
					index=j;
				}
			}
			sortDBMS[index][1]=sortDBMS[i-1][1];
			sortDBMS[index][0]=sortDBMS[i-1][1];
			sortDBMS[i-1][1]=max;
			sortDBMS[i-1][0]=in;
		}
	}
	
	//-------------------- 10 Print Best in Database Management System ------------------------------------------------------
	
	public static void bestinDatabaseManagementSystem(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[] ){
		Scanner input = new Scanner (System.in);
		
		char answer = 'Y';
		L1:for (int m = 0; answer == 'Y'; m++){
			printOptionTopic(optionKey , topic);
			
			double sortDBMS[][] = new double [studentID.length][2];
			//--- sortPFM[i][0] = Index Of Student ID From studentID Array 
			//--- sortPFM[i][1] = Database Management System Marks
			
			sortinDatabaseManagementSystemMarks(studentID , studentMarks , sortDBMS);
			
			System.out.println(" +----------+-----------------------------+--------------+--------------+");
			System.out.println(" | ID       | Name                        | DBMS Marks   | PF Marks   |");
			System.out.print  (" +----------+-----------------------------+--------------+--------------+");
			System.out.println();
			
			L2:for (int i = (sortDBMS.length-1) ; 0 <= i; i--){
			
				if ( (sortDBMS[i][1] != (-1)) ){
				
					int index =(int) sortDBMS[i][0] ;
					System.out.print(" | ");
					
					System.out.printf("%-9s" ,studentID[index]);
					System.out.print("| ");
					System.out.printf("%-28s" , studentName[index]);
					System.out.print("|");
					System.out.printf("%13d" , (int)studentMarks[index][1]);
					System.out.print(" |");
					System.out.printf("%13d" , (int)studentMarks[index][0]);
					System.out.print(" |");
					
					System.out.println();
					
				}else{
					break L2;
				}
			}
			
			System.out.print  (" +----------+-----------------------------+--------------+--------------+");
			
			System.out.println();
			System.out.println();
			
			System.out.print("Do yiu want to go back to main menu ? (Y/n) : ");
			answer = input.next().charAt(0);
			
			if (answer == 'Y'){
				clearConsole();
				
			}else{
				break L1;
			}
		}
	}
	
	//-------------------- Sort In Programming Fundamental Marks ------------------------------------------------------
	
	public static void sortinProgrammingFundamentalMarks(String studentID[] , int studentMarks[][] , double sortPFM[][]  ){
		
		for (int i = 0; i < sortPFM.length; i++){
				sortPFM[i][1] = -1;
		}
		for (int i = 0; i < studentMarks.length; i++){
				sortPFM[i][0] = i;
				sortPFM[i][1] = studentMarks[i][0];
		}
		for(int i=sortPFM.length; i>0; i--){
			double in=sortPFM[0][0];
			double max=sortPFM[0][1];
			
			int index=0;
			for(int j=1; j<i; j++){
				if(sortPFM[j][1]>max){
					max=sortPFM[j][1];
					in=sortPFM[j][0];
					index=j;
				}
			}
			sortPFM[index][1]=sortPFM[i-1][1];
			sortPFM[index][0]=sortPFM[i-1][1];
			sortPFM[i-1][1]=max;
			sortPFM[i-1][0]=in;
		}
	}
	
	//-------------------- 09 Print Best In Programming Fundamentals ------------------------------------------------------
	
	public static void bestinProgrammingFundamentals(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[] ){
		Scanner input = new Scanner (System.in);
		
		char answer = 'Y';
		L1:for (int m = 0; answer == 'Y'; m++){
			printOptionTopic(optionKey , topic);
			
			double sortPFM[][] = new double [studentID.length][2];
			//--- sortPFM[i][0] = Index Of Student ID From studentID Array 
			//--- sortPFM[i][1] = Programming Fundamentals Marks
		
			sortinProgrammingFundamentalMarks(studentID , studentMarks , sortPFM);
			
			System.out.println(" +----------+-----------------------------+--------------+--------------+");
			System.out.println(" | ID       | Name                        | PF Marks     | DBMS Marks   |");
			System.out.print  (" +----------+-----------------------------+--------------+--------------+");
			System.out.println();
			
			L22:for (int i = (sortPFM.length-1) ; 0 <= i; i--){
			
				if ( (sortPFM[i][1] != (-1)) ){
				
					int index =(int) sortPFM[i][0] ;
					System.out.print(" | ");
					
					System.out.printf("%-9s" ,studentID[index]);
					System.out.print("| ");
					System.out.printf("%-28s" , studentName[index]);
					System.out.print("|");
					System.out.printf("%13d" , (int)studentMarks[index][0]);
					System.out.print(" |");
					System.out.printf("%13d" , (int)studentMarks[index][1]);
					System.out.print(" |");
					
					System.out.println();
					
				}else{
					break L22;
				}
			}
			
			System.out.print  (" +----------+-----------------------------+--------------+--------------+");
			
			System.out.println();
			System.out.println();
			
			System.out.print("Do yiu want to go back to main menu ? (Y/n) : ");
			answer = input.next().charAt(0);
		
			if (answer == 'Y'){
				clearConsole();
			}else{
				break L1;
			}
		}
	}
	
	//-------------------- 08 Print Student Ranks ------------------------------------------------------
	
	public static void printStudentRanks(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[] , double totalAvgRank[][] , double rank[][]){
		Scanner input = new Scanner (System.in);
		
		char answer = 'Y';
		L1:for (int m = 0; answer == 'Y'; m++){
			printOptionTopic(optionKey , topic);
			System.out.println();
		
			int a = 1;
		
			System.out.println(" +--------+----------+-----------------------------+--------------+--------------+");
			System.out.println(" | Rank   | ID       | Name                        | Total Marks  | Avg. Marks   |");
			System.out.print  (" +--------+----------+-----------------------------+--------------+--------------+");
		
			System.out.println();
		
			L2:for (int i = (rank.length-1) ; 0 <= i; i--){
			
				if ( (rank[i][1] != (-2)) && (rank[i][1] != (-1)) ){
				
					int index =(int) rank[i][0] ;
					System.out.print(" | ");
					System.out.printf("%-7s" ,a);
					System.out.print("| ");
					System.out.printf("%-9s" ,studentID[index]);
					System.out.print("| ");
					System.out.printf("%-28s" , studentName[index]);
					System.out.print("|");
					System.out.printf("%13d" , (int)totalAvgRank[index][0]);
					System.out.print(" |");
					System.out.printf("%13.2f" , totalAvgRank[index][1]);
					System.out.print(" |");
					System.out.println();
					a ++ ;
				}else{
					break L2;
				}
			}
			System.out.println(" +--------+----------+-----------------------------+--------------+--------------+");
			System.out.println();
			System.out.println();
			System.out.print("Do yiu want to go back to main menu ? (Y/n) : ");
			answer = input.next().charAt(0);
		
			if (answer == 'Y'){
				clearConsole();
			}else{
				break L1;
			}
		}
	}
	
	//-------------------- 07 Print Student Details ------------------------------------------------------
	
	public static void printStudentDetails(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[] , double totalAvg[][] , double rank[][]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
		char answer = 'Y';
		L1:for (int i = 0; answer == 'Y'; i++){
			L3:for(int m = 0 ; answer == 'Y' ; m++){
				System.out.print("Enter Student ID : ");
				String sID =input.next();
				boolean contains = true ;
				contains = Arrays.stream(studentID).anyMatch(sID::equals);
				
				if(contains){
					int index = -1;
					L2:for (int j = 0; j < studentID.length ; j++){
						index = j ;
						if (studentID[j].equals(sID) ){
							System.out.print("Student Name     : "+(studentName[index]));
							System.out.println();
						
							if( (studentMarks[index][0]) != -1 ){
						
								System.out.print ("+----------------------------------------+------------------+\n");
								System.out.printf("| Programming Fundamentals Marks         |%17d",(studentMarks[index][0]));
								System.out.println(" |");
								System.out.printf("| Database Management System Marks       |%17d",(studentMarks[index][1]));
								System.out.println(" |");
								System.out.printf("| Total Marks                            |%17d",(int)(totalAvg[index][0]));
								System.out.println(" |");
								System.out.print ("| Avg. Marks                             |");
								System.out.printf("%17.2f",totalAvg[index][1]);
								System.out.println(" |");
								System.out.printf("| Rank                                   |");
								
								int rankIndex = 0;
								for (int k = 0; k < rank.length; k++){
									if (rank[k][0] == ((double)index)){
										rankIndex = k ;
										break ;
									}
								}
								String ranks[] = new String []{"" , "(First)", "(second)" , "(third)", "( last )"} ;
								int num = 0;
								if ( (rank.length-1) == rankIndex ){
									num = 1;
									
								}else if ( (rank.length-2) == rankIndex ){
									if( rank[rank.length-2][1] == rank[rank.length-1][1] ){
										num = 1;
									}else{
										num = 2;
									}
									
								}else if ( (rank.length-3) == rankIndex ){
									if( rank[rank.length-3][1] == rank[rank.length-1][1] ){
										num = 1;
									}else if( rank[rank.length-3][1] == rank[rank.length-2][1] ){
										num = 2;
									}else{
										num = 3;
									}
									
								}else {
									int x = 0 ;
									for (int r = 0; r < rank.length; r++){
										if (rank[r][0] == -1 || rank[r][0] == -2){
											x = r+1;
										}
									}
									if (x == rankIndex ){
										num = 4;
									}
								}
									
								if (num == 1 || num == 2 || num == 3 || num == 4 ){
									System.out.printf( "%9d",( rank.length - rankIndex ));
									System.out.printf( " ");
									System.out.printf( "%8s",ranks[num]);
									System.out.println("|");
								}else {
									System.out.printf( "%17d",( rank.length - rankIndex ));
									System.out.println(" |");
								}
								
								System.out.println("+----------------------------------------+------------------+");
								System.out.println();
								System.out.println();
								System.out.print("DO you want to search another student details ? (Y/n)  ");
								answer = input.next().charAt(0);
								break L2;
								
							}else {
								System.out.println();
								System.out.print("Marks yet to be added");
								System.out.println();
								System.out.println();
								System.out.print("DO you want to search another student details ? (Y/n)  ");
								answer = input.next().charAt(0);
								System.out.println();
								System.out.println();
								break L3;
							}	
						}
					}
				}else{
					System.out.println();
					System.out.print("Invalaild Student ID.");
					System.out.println();
					System.out.println();
					System.out.print("DO you want to search another student details ? (Y/n) ");
					answer = input.next().charAt(0);
					System.out.println();
					System.out.println();
					if (answer == 'n'){
						break L3;
					}
				}
				if (answer == 'Y'){
					clearConsole();
					printOptionTopic(optionKey , topic);
				}else{
					break L1;
				}
			}
		}
	}
	
	//-------------------- Get Student Rank ------------------------------------------------------
	
	public static void getRank(double totalAvg[][] , double rank[][] ){
		
		for (int i = 0; i < totalAvg.length; i++){
				rank[i][0] = i;
				rank[i][1] = totalAvg[i][0];
		}
		
		for(int i=rank.length; i>0; i--){
			double max=rank[0][1];
			double in=rank[0][0];
			
			int index=0;
			for(int j=1; j<i; j++){
				if(rank[j][1]>max){
					max=rank[j][1];
					in=rank[j][0];
					index=j;
				}
			}
			rank[index][1]=rank[i-1][1];
			rank[index][0]=rank[i-1][1];
			rank[i-1][1]=max;
			rank[i-1][0]=in;
		}
	}
	
	//-------------------- Find Total , Average And Store totalAvg 2D array    ------------------------------------------------------
	
	public static void getTotalAvg(String studentID[] , int studentMarks[][] ,double totalAvg[][] ){
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < totalAvg.length; i++){
				totalAvg[i][0] = -1;
		}
		
		int t=0;
		for (int i = 0; i < studentID.length ; i++){
			if (studentID[i] != null){
				int index = i ;
				int total = 0 ;
				for (int j = 0; j < studentMarks[index].length ; j++){
					total += studentMarks[index][j] ;
				}
				totalAvg[index][0] =(int) total;
				totalAvg[index][1] = (double)total/2;
				
				//--- studentMarks[i][0] = Total Marks
				//--- studentMarks[i][1] = Average Marks
				
			}
		}
	}
	
	//-------------------- 06. Delete Student With Marks  ------------------------------------------------------
	
	public static void deleteStudent(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
		char answer = 'Y';
		L1:for (int i = 0; answer == 'Y'; i++){
			L3:for(int m = 0 ; answer == 'Y' ; m++){
				System.out.print("Enter Student ID : ");
				String sID =input.next();
				boolean contains = true ;
				contains = Arrays.stream(studentID).anyMatch(sID::equals);
				
				if(contains){
					int index = -1;
					L2:for (int j = 0; j < studentID.length ; j++){
						index = j ;
						if (studentID[j].equals(sID) ){
							studentID[index] = null;
							for (int n = 0; n < studentMarks[index].length ; n++){
								studentMarks[index][n] = -1 ;
							}
							System.out.println("Student has been deleted successfully.");
							System.out.print("DO you want to add marks for another student ? (Y/n) ");
							answer = input.next().charAt(0);
							break L3;	
						}
					}	
				}else{
					System.out.print("Invalid Student ID. DO you want to search again ? (Y/n) ");
					answer = input.next().charAt(0);
					System.out.println();
					if (answer == 'n'){
						break L3;
					}
				}
			}
			if (answer == 'Y'){
				clearConsole();
				printOptionTopic(optionKey , topic);
			}else{
				break L1;
			}
		}
	}
	
	//-------------------- 05. Update Marks  ------------------------------------------------------
	
	public static void updateStudentMarks(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
		char answer = 'Y';
		L1:for (int i = 0; answer == 'Y'; i++){
			L3:for(int m = 0 ; answer == 'Y' ; m++){
				System.out.print("Enter Student ID : ");
				String sID =input.next();
				boolean contains = true ;
				contains = Arrays.stream(studentID).anyMatch(sID::equals);
				
				if(contains){
					int index = -1;
					L2:for (int j = 0; j < studentID.length ; j++){
						if (studentID[j].equals(sID) ){
							index = j ;
							System.out.print("Student Name     : "+(studentName[index]));
							System.out.println();
							System.out.println();
						
							if( (studentMarks[index][0]) != -1 ){	
								System.out.print("Programming Fundamentals Marks   : "+(studentMarks[index][0]));
								System.out.println();
								System.out.print("Database Management System Marks : "+(studentMarks[index][1]));
						
								System.out.println();
								System.out.println();
						
								boolean b =false;
								for (int n = 0; b==false; n++){
									System.out.print("Enter New Programming Fundamentals Marks   : ");
									int pFMarks =input.nextInt();
									if (0<=pFMarks && pFMarks<101){
										studentMarks[index][0] = pFMarks;
										b = true;
										int x =-1;
										for (int h = 0; x==-1; h++){
											System.out.print("Enter New Database Management System Marks : ");
											int dBMarks =input.nextInt();
											if (0<=dBMarks && dBMarks<101){
												studentMarks[index][1] = dBMarks;
												x=0;
												break ;
											}else {
												System.out.print("Invalid Marks , please enter correct marks.");
												System.out.println();
												System.out.println();
											}
										}
									}else {
										System.out.print("Invalid Marks , please enter correct marks.");
										System.out.println();
										System.out.println();
									}
								}
								System.out.println();
								System.out.println("Student details has been update successfilly. ");
						
							}else{
								System.out.println("This student's marks yet to be add.");
							}
							
							System.out.print("DO you want to add marks for another student ? (Y/n) ");
							answer = input.next().charAt(0);
							break L3;
						}	
					}
				}else{
					System.out.print("Invalaild Student ID. DO you want to search again ? (Y/n) ");
					answer = input.next().charAt(0);
					System.out.println();
					if (answer == 'n'){
						break L3;
					}
				}
			}
			if (answer == 'Y'){
				clearConsole();
				printOptionTopic(optionKey , topic);
			}else{
				break L1;
			}
		}
	}
	
	//-------------------- 04. Update Student Details  ------------------------------------------------------
	
	public static void updateStudentDetails(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
		char answer = 'Y';
		L1:for (int i = 0; answer == 'Y'; i++){
			L3:for(int m = 0 ; answer == 'Y' ; m++){
				System.out.print("Enter Student ID : ");
				String sID =input.next();
				boolean contains = true ;
				contains = Arrays.stream(studentID).anyMatch(sID::equals);
				
				if(contains){
					int index = -1;
					L2:for (int j = 0; j < studentID.length ; j++){
				
						if (studentID[j].equals(sID) ){
							index = j ;
							System.out.print(index);
							System.out.print("Student Name     : "+(studentName[index]));
							System.out.println();
							System.out.println();
							
							System.out.print("Enter the New Student Name     : ");
							studentName[index] = input.next();
							
							System.out.println();
							System.out.println();
							
							System.out.println("Student details has been update successfully. ");
							System.out.print("DO you want to add marks for another student ? (Y/n) ");
							answer = input.next().charAt(0);
							break L3;
						}
					}
				}else{
					System.out.print("Invalaild Student ID. DO you want to search again ? (Y/n) ");
					answer = input.next().charAt(0);
					System.out.println();
					if (answer == 'n'){
						break L3;
					}
				}
			}
			if (answer == 'Y'){
				clearConsole();
				printOptionTopic(optionKey , topic);
			}else{
				break L1;
			}
		}
	} 
	
	//-------------------- Add Marks Method Use For Option [03. Add Only Marks] ------------------------------------------------------
	
	public static char getMarksForAddOnlyMarks(String studentID[] , String studentName[] , int studentMarks[][] , char answer){
		Scanner input = new Scanner (System.in);

		L3:for(int m = 0 ; answer == 'Y' ; m++){
			System.out.print("Enter Student ID : ");
			String sID =input.next();
			boolean contains = true ;
			contains = Arrays.stream(studentID).anyMatch(sID::equals);
			if(contains){
				int index = -1;
				L2:for (int j = 0; j < studentID.length ; j++){
					
					if (studentID[j].equals(sID) ){
						index = j ;
						System.out.print("Student Name     : "+(studentName[index]));
						System.out.println();
						
						if (studentMarks[index][0] == -1){
							System.out.println();
							addMarks(studentID , studentMarks , index);
							System.out.println();
							System.out.print("Marks have been added.");
						}else{
							System.out.print("This student's marks have been alreday added.\nIf you want to update the marks , please use [4] update Marks option.");
							System.out.println();
							System.out.println();
					
						}
						System.out.print("DO you want to add marks for another student ? (Y/n) ");
						answer = input.next().charAt(0);
						break L3;
					}
				}
			}else{
				System.out.print("Invalaild Student ID. DO you want to search again ? (Y/n) ");
				answer = input.next().charAt(0);
				System.out.println();
				if (answer == 'n'){
					break L3;
				}	
			}
			
		}
			return answer;
	}
	
	//-------------------- 03. Add Only Marks ------------------------------------------------
	
	public static void addOnlyMarks(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
		char answer = 'Y';
		L1:for (int i = 0; answer == 'Y'; i++){
			answer = getMarksForAddOnlyMarks(studentID , studentName , studentMarks , answer);
			if (answer == 'Y'){
				clearConsole();
				printOptionTopic(optionKey , topic);
			}else{
				break L1;
			}
		}
	}
	
	//-------------------- Add Marks ------------------------------------------------------
	
	public static void addMarks(String studentID[] , int studentMarks[][] , int y ){
		Scanner input = new Scanner (System.in);
		boolean a =false;
		for (int i = 0; a==false; i++){
			System.out.print("Programming Fundamentals Marks   : ");
			int pFMarks =input.nextInt();
			if (0<=pFMarks && pFMarks<101){
				studentMarks[y][0] = pFMarks;
				a = true;
				int x =-1;
				for (int j = 0; x==-1; j++){
					System.out.print("Database Management System Marks : ");
					int dBMarks =input.nextInt();
					if (0<=dBMarks && dBMarks<101){
						studentMarks[y][1] = dBMarks;
						x=0;
						break ;
					}else {
						System.out.print("Invalid Marks , please enter correct marks.");
						System.out.println();
						System.out.println();
					}
				}
			}else {
				System.out.print("Invalid Marks , please enter correct marks.");
				System.out.println();
			}
			System.out.println();
		}
	}
	
	//-------------------- 02. Add New Student With Marks ----------------------------
	
	public static void addNewStudentWithMarks(String studentID[] , String studentName[] , int studentMarks[][] ,int optionKey , String topic[]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
		int y =-1;
		boolean contains =false;
		char answer = 'Y';
		L1:for (int i = 0; answer != 'n'; i++){
			contains = checkAndAddNewStudent(studentID , studentName );
			for (int j = 0; j < studentID.length; j++) {
				if (studentID[j] == null) {
					y = (j-1);
					break;
				}
			}
			L12:if (contains == false){
				addMarks(studentID , studentMarks , y);
				System.out.print("Student has been added successfully.");
				System.out.print(" DO you want to add a new Student (Y/n) ");
				answer = input.next().charAt(0);
				if (answer == 'Y'){
					clearConsole();
					printOptionTopic(optionKey , topic);
					break L12;
				}else{
					break L1;
				}
			}
		}
	}
	
	//-------------------- Check And Add New Student Without Marks ------------------
	
	public static boolean checkAndAddNewStudent(String studentID[] , String studentName[]){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Student ID   : ");
		String sID = input.next();
		boolean contains =false;
		int y =0 ;
		for (int i = 0; i < studentID.length; i++){
			if (studentID[i] == null) {
				y = i;
				break;
			}
		}
		L2:for (int j = 0; j < studentID.length; j++){
			contains = Arrays.stream(studentID).anyMatch(sID::equals);
			if (contains== true){
				break L2;
			}
		}
		if (contains){
			System.out.println("The Student ID already exists ");
			System.out.println();
		}else{
			studentID[y] = sID ;
			System.out.print("Enter Student Name : ");
			studentName[y] = input.next() ;
			System.out.println();
		}
		return contains;
	}
	
	//-------------------- Print Topic From Select Option ---------------------------
	
	public static void printOptionTopic(int optionKey , String topic[]){
		printPageHeadLine();
		String homeHead = topic[optionKey-1];
		printPageTopic(homeHead);
		printPageHeadLine();
		System.out.println();
	}
	
	//-------------------- 01. Add Only New Student ---------------------------------
	
	public static void addNewStudent(String studentID[] , String studentName[] ,int optionKey , String topic[]){
		Scanner input = new Scanner (System.in);
		printOptionTopic(optionKey , topic);
		
        int y =0;
        char answer = 'n';
        L1:for (int i = 0; y < studentID.length; i++){
			boolean contains = checkAndAddNewStudent(studentID , studentName);
			if (contains == false){
				System.out.print("Student has been added successfully.");
				System.out.print(" DO you want to add a new Student (Y/n) ");
				answer = input.next().charAt(0);
				if (answer == 'Y'){
					clearConsole();
					printOptionTopic(optionKey , topic);
				}else{
					break L1;
				}
				y++;
			}
		}
	}
	
	//-------------------- Clear Console Method -------------------------------------
	
	public final static void clearConsole(){
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
		}
	}
	
	//-------------------- Print Topic Of The Page ----------------------------------
	
	public static void printPageTopic(String head){
		System.out.print("|");
		int middleOfTopic = head.length()/2;
		int startPrint = 41-middleOfTopic;
		for(int i = 0 ; i < 81 ; i++){
			if(i==startPrint){
				System.out.print(head);
				i += head.length();
			}
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.println();
	}
	
	//-------------------- Print Topic Border Line ----------------------------------
	
	public static void printPageHeadLine(){
		for(int i = 0 ; i < 83 ; i++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	//-------------------- Print HomePage -------------------------------------------
	
	public static int printHomePage(){
		Scanner input = new Scanner (System.in);
		printPageHeadLine();
		String homeHead = "WELSOME TO GDSE MARKS MANAGEMENT SYSTEM";
		printPageTopic(homeHead);
		printPageHeadLine();
		System.out.println();
		String []topic = getTopic();
		for (int i = 0; i < 10 ; i=i+2){
			int length = topic[i].length();
			System.out.print(" ["+(i+1)+"] "+topic[i]);
			L1:for(int j = 0 ; j < 82  ; j++){
				if (length == 38){
					System.out.print(" ["+(i+2)+"] "+topic[i+1]);
					break L1;
				}
				System.out.print(" ");
				length +=1;
			}	
			System.out.println();
		}
		System.out.println();
		System.out.print(" Enter an option to continue > ");
		int optionKey = input.nextInt();
		return optionKey;
	}
	
	//-------------------- All Main Topic In The Program ----------------------------
	
	public static String[] getTopic(){
		String topic[] = new String [10]; 
		topic[0] = "Add New Student";
		topic[1] = "Add New Student With Marks";
		topic[2] = "Add Marks";
		topic[3] = "Update Student Details";
		topic[4] = "Update Marks";
		topic[5] = "Delete Student";
		topic[6] = "Print Student Details";
		topic[7] = "Print Student Rank";
		topic[8] = "Best in Programmig Fundamentails";
		topic[9] = "Best in Database Management System";
		return topic;
	}
	
	//-------------------- All Marks Assing in Negative Value -----------------------
	
	public static void assingNegativeValueForMarks(int studentMarks [][]){ 
		for (int i = 0; i < studentMarks.length ; i++){
			for (int j = 0; j < studentMarks[i].length; j++){
				studentMarks[i][j] = -1;
			}
		}
	}
	
	//-------------------- Main Method ----------------------------------------------
	
	public static void main(String[] args) {
		
		// you want to add more student change value of noOfStudent varible in only main metod 
		int noOfStudent = 20;
		int noOfSubject = 2;
		String studentID [] = new String [noOfStudent];
		String studentName [] = new String [noOfStudent];
		
		int studentMarks [][] = new int [noOfStudent][2];
		//--- studentMarks[i][0] = Programming Fundamentals Marks
		//--- studentMarks[i][1] = Database Management System Marks
		
		double totalAvg [][] = new double [noOfStudent][3];
		double rank[][] = new double [studentID.length][2];
		
		assingNegativeValueForMarks(studentMarks);
		String topic[] = new String [10];
		topic = getTopic();
		
		char answer = 'Y';
		for (int i = 0; answer =='Y'; i++){
			int optionKey = printHomePage();
			
			switch ( optionKey ) {
				
				case 1 : 
					clearConsole();
					addNewStudent(studentID , studentName , optionKey , topic);
					break;
					
				case 2 : 
					clearConsole();
					addNewStudentWithMarks(studentID , studentName , studentMarks , optionKey , topic);
					break;
					
				case 3 : 
					clearConsole();
					addOnlyMarks(studentID , studentName , studentMarks , optionKey , topic);
					break;
					
				case 4 : 
					clearConsole();
					updateStudentDetails(studentID , studentName , studentMarks , optionKey , topic);
					break;
					
				case 5 : 
					clearConsole();
					updateStudentMarks(studentID , studentName , studentMarks , optionKey , topic);
					break;
					
				case 6 : 
					clearConsole();
					deleteStudent(studentID , studentName , studentMarks , optionKey , topic);
					break;
					
				case 7 : 
					clearConsole();
					getTotalAvg(studentID , studentMarks , totalAvg);
					getRank(totalAvg , rank);
					printStudentDetails(studentID , studentName , studentMarks , optionKey , topic , totalAvg , rank);
					break;
				
				case 8 : 
					clearConsole();
					getTotalAvg(studentID , studentMarks , totalAvg);
					getRank(totalAvg , rank);
					printStudentRanks(studentID , studentName , studentMarks , optionKey , topic , totalAvg , rank);
					break;
				
				case 9 :
					clearConsole();
					bestinProgrammingFundamentals(studentID , studentName , studentMarks , optionKey , topic );
					break;
				
				case 10 :
					clearConsole();
					bestinDatabaseManagementSystem(studentID , studentName , studentMarks , optionKey , topic );
					break;
				
			}
			clearConsole();
		}
	}
}



