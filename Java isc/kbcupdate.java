import java.util.Scanner;

/**
 * Write a description of class kbcupdate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class kbcupdate
{
    
   
    
  
 String name;
 int choice;
 String res;
 int res1;
 double id,mobileno;
 
   Scanner sc=new Scanner(System.in);
   public void inputdetails(){
    System.out.println("Enter the Name of The User :--");
    name=sc.nextLine();
    System.out.println("Your ID is:-42069");
    System.out.println("Enter Your ID::______");
    id=sc.nextDouble();
    if(id!=42069){
    
    System.out.println("Wrong ID Enter the Correct One !");
    System.exit(0);
    }
    
    }
    public void life(){
    System.out.println("\n......");
    System.out.println("User You Have To Enter 1,2,3,4 For Choosing the Options in the Question");
    System.out.println("You Would Get a Life");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("..........................................................................");
    System.out.println("1 Question 10,000");
       System.out.println("2 Question 20,000");
       System.out.println("3 Question 30,000");
          System.out.println("4 Question 40,000");
             System.out.println("5 Question 80,000");
                System.out.println("6 Question 1,60,000");
                   System.out.println("7 Question 3,20,000");
                   
    System.out.println("8 Question 6,40,000");
    System.out.println("9 Question 12,50,000");
    System.out.println("10 Question 25,00,000");
    System.out.println("11 Question 50,00,000");
    System.out.println("12 Question 1 Crores");
    System.out.println("13 Question 3 Crores");
    System.out.println("14 Question 7 Crores");
    
    }
    public void lifeo(){
    
    
    }
    public void audience1(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 70 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->9 %");
    System.out.println("4--------->1 %");
    
    }
    public void friend1(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 1 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    public void option1(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

    System.out.println("1)Ankara 2)Istanbul 3)Damascus 4)Abu Dhabi");
       System.out.println("..........................................");

    
    }
    public void half1(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

    System.out.println("1)Ankara 2)Istanbul");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
    public void question1(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

    System.out.println("a)What is the Capital of Turkiye(Turkey)?");
       System.out.println("..........................................");

    }
    public void  check1(){
    kbcupdate ob=new kbcupdate();
    if(choice==1){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 10,000");
}
 else
    System.out.println("Wrong Answer !");
    
    }
    public void ans1(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience1();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend1();
    
    
    }
    if(res1==7){
    ob.half1();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
   
    System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
    
    }
    
}

    }
       public void half2(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

    System.out.println("1)Tim Berners-Lee 2)Mark Person");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience2(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 40 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->20 %");
    System.out.println("4--------->20 %");
    
    }
      public void friend2(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 2 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question2(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

    System.out.println("b)Who Invented Internet ?");
       System.out.println("..........................................");

    }    
    
    
       public void option2(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
      
    System.out.println("1)Tim Berners-Lee 2)Mark Person 3)Dam Housier 4)PrabuddhaTheLegend");
       System.out.println("..........................................");

    
    }
    public void ans2(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience2();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend2();
    
    
    }
    if(res1==7){
    ob.half2();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
}
  System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check2(){
    kbcupdate ob=new kbcupdate();
    if(choice==1){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 20,000");
}
 else
    System.out.println("Wrong Answer !");
    
    }
  public void half3(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

     System.out.println("2)1946 c)1945");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience3(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 10 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->60 %");
    System.out.println("4--------->10 %");
    
    }
      public void friend3(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 2 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question3(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

        System.out.println("c)When Was WHO founded ?");
       System.out.println("..........................................");

    }    
    
    
       public void option3(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
      
      System.out.println("1)1942 2)1946 c)1945 d)1948");    
       System.out.println("..........................................");

    
    }
    public void ans3(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience2();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend3();
    
    
    }
    if(res1==7){
    ob.half3();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check3(){
    kbcupdate ob=new kbcupdate();
    if(choice==3){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 30,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}
  public void half4(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

     System.out.println("a)Mount Everest b)Mount K2 ");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience4(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 20 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->60 %");
    System.out.println("4--------->0 %");
    
    }
      public void friend4(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 2 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question4(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

        System.out.println("d)What is the Highest Peak In the World");
       System.out.println("..........................................");

    }    
    
    
       public void option4(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
          System.out.println("a)Mount Everest b)Mount K2 c)Mount Fujii d)Mount Kilimanjaro");
  
       System.out.println("..........................................");

    
    }
    public void ans4(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience4();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend4();
    
    
    }
    if(res1==7){
    ob.half4();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check4(){
    kbcupdate ob=new kbcupdate();
    if(choice==1){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 40,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}
    
public void half5(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

     System.out.println(" c)Aleppo d)Damascus");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience5(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 50 %");
    System.out.println("2-------->30%");
    System.out.println("3-------->10 %");
    System.out.println("4--------->10 %");
    
    }
      public void friend5(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 3 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question5(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

        System.out.println("e)Capital City of Syria >?<");
       System.out.println("..........................................");

    }    
    
    
       public void option5(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
          System.out.println("a)Berlin b)New York c)Aleppo d)Damascus");
  
       System.out.println("..........................................");

    
    }
    public void ans5(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience5();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend5();
    
    
    }
    if(res1==7){
    ob.half5();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check5(){
    kbcupdate ob=new kbcupdate();
    if(choice==4){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 80,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}
public void half6(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

   
       System.out.println("a)206 b)204");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience6(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 20 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->25 %");
    System.out.println("4--------->35 %");
    
    }
      public void friend6(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 4 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question6(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
System.out.println("g)How many bones does a human adult have?");
       System.out.println("..........................................");

    }    
    
    
       public void option6(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
          System.out.println("a)206 b)204 c)202 d)208");
  
       System.out.println("..........................................");

    
    }
    public void ans6(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience6();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend6();
    
    
    }
    if(res1==7){
    ob.half6();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check6(){
    kbcupdate ob=new kbcupdate();
    if(choice==2){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 1,60,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}
public void half7(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

   
  System.out.println("c)CO d)HCl");
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience7(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 69 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->1 %");
    System.out.println("4--------->10 %");
    
    }
      public void friend7(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 3 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question7(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
   System.out.println("h)Which gases are responsible for global warming?");
       System.out.println("..........................................");

    }    
    
    
       public void option7(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
    System.out.println("a)h2 b)o2 c)CO d)HCl");
  
       System.out.println("..........................................");

    
    }
    public void ans7(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience7();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend7();
    
    
    }
    if(res1==7){
    ob.half7();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check7(){
    kbcupdate ob=new kbcupdate();
    if(choice==3){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 3,20,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}




public void half8(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

         System.out.println("a)George Mosley  c)Dimitri Mendeleev ");
  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience8(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 10 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->60 %");
    System.out.println("4--------->10 %");
    
    }
      public void friend8(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 3 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question8(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
   
        System.out.println("i)Who designed the periodic table?");
    
       System.out.println("..........................................");

    }    
    
    
       public void option8(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
      System.out.println("a)George Mosley b)Jefferson Thompson c)Dimitri Mendeleev d)Laymer");
  
       System.out.println("..........................................");

    
    }
    public void ans8(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience8();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend8();
    
    
    }
    if(res1==7){
    ob.half8();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check8(){
    kbcupdate ob=new kbcupdate();
    if(choice==3){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 6,40,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}



public void half9(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
    System.out.println(" c)3*10^8 ms d)none");

  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience9(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 90 %");
    System.out.println("2-------->5%");
    System.out.println("3-------->4 %");
    System.out.println("4--------->1 %");
    
    }
      public void friend9(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 4 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question9(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
   System.out.println("j)Speed Of Light ?");    
       System.out.println("..........................................");

    }    
    
    
       public void option9(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
     System.out.println("a)3*10^8 ms/s b)2*10^7 m/s c)3*10^8 ms d)none");
  
       System.out.println("..........................................");

    
    }
    public void ans9(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience9();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend9();
    
    
    }
    if(res1==7){
    ob.half9();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check9(){
    kbcupdate ob=new kbcupdate();
    if(choice==4){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 12,50,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}

public void half10(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

  System.out.println(" c)UV d)Temperatures");
  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience10(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 0 %");
    System.out.println("2-------->0%");
    System.out.println("3-------->100 %");
    System.out.println("4--------->0 %");
    
    }
      public void friend10(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 2 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question10(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
         System.out.println("k)What does the ozone layer protect us from?"); 
       System.out.println("..........................................");

    }    
    
    
       public void option10(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
     System.out.println("a)Insects b)Light c)UV d)Temperatures");
  
       System.out.println("..........................................");

    
    }
    public void ans10(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience10();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend10();
    
    
    }
    if(res1==7){
    ob.half10();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check10(){
    kbcupdate ob=new kbcupdate();
    if(choice==3){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 25,00,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}



public void half11(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");

      System.out.println("a)Rudyard Kipling b)Arthur Canon Doyle ");
  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience11(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 70 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->5 %");
    System.out.println("4--------->5 %");
    
    }
      public void friend11(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 1 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question11(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
   System.out.println("l)Who wrote 'The Jungle Book'?");
       System.out.println("..........................................");

    }    
    
    
       public void option11(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
     System.out.println("a)Rudyard Kipling b)Arthur Canon Doyle c)George Eliot d)Jane Austen");
  
       System.out.println("..........................................");

    
    }
    public void ans11(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience11();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend11();
    
    
    }
    if(res1==7){
    ob.half11();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check11(){
    kbcupdate ob=new kbcupdate();
    if(choice==1){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs  50,00,000");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}

public void half12(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
  System.out.println(" c)Asia d)Africa");
  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience12(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 1 %");
    System.out.println("2-------->20%");
    System.out.println("3-------->60 %");
    System.out.println("4--------->19 %");
    
    }
      public void friend12(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 3 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question12(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
    System.out.println("m)Which is the biggest continent in the world?");
       System.out.println("..........................................");

    }    
    
    
       public void option12(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
   System.out.println("a)Americas b)Antartica c)Asia d)Africa");
  
       System.out.println("..........................................");

    
    }
    public void ans12(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience2();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend12();
    
    
    }
    if(res1==7){
    ob.half12();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check12(){
    kbcupdate ob=new kbcupdate();
    if(choice==3){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 1 Crore");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}
public void half13(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
          System.out.println("b)Nile c)Amazon");

  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
    
    
    }
      public void audience13(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 2 %");
    System.out.println("2-------->78%");
    System.out.println("3-------->10 %");
    System.out.println("4--------->10 %");
    
    }
      public void friend13(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 2 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question13(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
            System.out.println("n)Which is longest river in the world?");
       System.out.println("..........................................");

    }    
    
    
       public void option13(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
    System.out.println("a)Ganges b)Nile c)Amazon d)Danube");
  
       System.out.println("..........................................");

    
    }
    public void ans13(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience13();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend13();
    
    
    }
    if(res1==7){
    ob.half13();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check13(){
    kbcupdate ob=new kbcupdate();
    if(choice==2){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 3 Crore");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}

public void half14(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
       

  
       System.out.println("..........................................");
    System.out.println("Enter Your Choice ");
    choice=sc.nextInt();
      System.out.println(" b)Japaesse c)Arabic ");
    
    }
      public void audience14(){
        kbcupdate ob=new kbcupdate();
    System.out.println("1--------> 2.5 %");
    System.out.println("2-------->60%");
    System.out.println("3-------->35 %");
    System.out.println("4--------->2.5 %");
    
    }
      public void friend14(){
    System.out.println("CALL INITIATING");
    System.out.println("Enter the phone number of Your Friend");
    mobileno=sc.nextDouble();
    
    System.out.println("Call Connecting ");
    System.out.println(".................");
    System.out.println("..................");
    System.out.println("Friend Says Option 2 is the Correct Answer ! ");
    System.out.println("User Now Enter(1,2,3,4)for the choosing the options");
       System.out.println("..........................................");

          System.out.println("..........................................");

    choice=sc.nextInt();
    
    }
    
  public void question14(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
             System.out.println("p)Tsunami is a word in which language?");
       System.out.println("..........................................");

    }    
    
    
       public void option14(){
    kbcupdate ob=new kbcupdate();
       System.out.println("..........................................");
   
         System.out.println("a)English b)Japaesse c)Arabic d)Hindi");
  
       System.out.println("..........................................");

    
    }
    public void ans14(){
    kbcupdate ob=new kbcupdate();
    System.out.println("..........................................");
    System.out.println("Enter (1,2,3,4)For Choosing the Options !");
    System.out.println("...........................................");  
    System.out.println("Can You Answer it?");
    System.out.println("Type (y) for yes and (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.out.println("What You Want To Select?");
    System.out.println("5) for Audience Poll 6) for call your friend 7) for 50:50 ");
    System.out.println("Enter Your  Response !");
    res1=sc.nextInt();
    if(res1==5){
    ob.audience14();
    System.out.println("Now Enter Your Chocie(1,2,3,4)");
    choice=sc.nextInt();
    }
    if(res1==6){
    ob.friend14();
    
    
    }
    if(res1==7){
    ob.half14();
    
    }
    }
    else{
    System.out.println("Enter Your Choice (1,2,3,4)");
    choice=sc.nextInt();
    
    
}
System.out.println("Do Want To Continue>< Press (y)for yes (n) for no");
    res=sc.next();
    if(res.equalsIgnoreCase("n")==true){
    System.exit(0);
}
}
   public void  check14(){
    kbcupdate ob=new kbcupdate();
    if(choice==2){
    System.out.println("Correct Answer ");
    System.out.println("Your Reward------->Rs 7 Crore");
   

    
    }
    else
    System.out.println("Wrong Answer !");
    
}










    public void main(){
        kbcupdate ob=new kbcupdate();
        
    ob.inputdetails();
    ob.life();
    ob.question1();
    ob.option1();
    ob.ans1();
    ob.check1();
    ob.question2();
    ob.option2();
    ob.ans2();
    ob.check2();
    ob.question3();
    ob.option3(); 
     ob.ans3();
     ob.check3();
    
     ob.question4();
     ob.option4();
     ob.ans4();
     ob.check4();
     
     ob.question5();
     ob.option5();
     ob.ans5();
     ob.check5();
     
     
     ob.question6();
     ob.option6();
     ob.ans6();
     ob.check6();
     
     
     ob.question7();
     ob.option7();
     ob.ans7();
     ob.check7();
     
     ob.question8();
     ob.option8();
     ob.ans8();
     ob.check8();
     
      
     ob.question9();
     ob.option9();
     ob.ans9();
     ob.check9();
     
       ob.question10();
          ob.option10();
       ob.ans10();
     ob.check10();
     
        ob.question11();
        ob.option11();
        ob.ans11();
     ob.check11();
     
            ob.question12();
          ob.option12();
            ob.ans12();
     ob.check12();
    
     
     
            ob.question13();
      ob.option13();
            ob.ans13();
     ob.check13();
    
    
    
            ob.question14();
             ob.option14();
            ob.ans14();
     ob.check14();
    }
}
