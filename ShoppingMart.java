import java.util.*;

class Fashion 
{
    int size,choice,choice4,  quantity, price, choice2, choice3, brand, choice5, brands, choice6, choice7;
   char choice1;
   float ftotal=0;
    Scanner ss = new Scanner(System.in);
    float fashion()
    {
                
                    System.out.println("\n\t\t** Fashion Products **\t\t\n");
                    System.out.println("1.Male");
                    System.out.println("2.Female\n");
				 System.out.print("Select the Fashion Category : ");
                    Scanner sc= new Scanner(System.in);
                    choice1=sc.next().charAt(0);
                    if(choice1=='1')
                    {
					System.out.println("\n");

                        System.out.println("*** Mens Product ***\n");
                        System.out.println("1.Shirts");
                        System.out.println("2.Jeans");
                        System.out.println("3.T-Shirts");
                        System.out.println("4.Under Garments");
                        System.out.println("5.Footwear \n");
                        System.out.print("Enter Your choice : ");
                        choice2=sc.nextInt(); // choice2 for accepting menu no. of Mens 
                        System.out.print("\033[H\033[2J");
                    System.out.flush();
                        
                        switch(choice2)
                        {
                            case 1:
                                System.out.print("Enter Size of Shirt(36,38,40,42,44) : ");
                                size=sc.nextInt();
                                if(size==36)
                                {   
                                    System.out.println("Price is : 250Rs");
                                    price=250;
                                    System.out.print("Enter Quantity :");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                else if(size==38)
                                {
                                    System.out.println("Price is : 300Rs");
                                    price=260;
                                    System.out.print("Enter Quantity :");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                else if(size==40)
                                {
                                    System.out.println("Price is : 350Rs");
                                    price=300;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                else if(size==42)
                                {
                                    System.out.println("Price is : 400Rs");
                                    price=350;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                else if(size==44)
                                {
                                    System.out.println("Price is : 450Rs");
                                    price=400;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                break;
                            case 2:
                                System.out.print("Enter Size of Jeans(36,38,40,42,44) : ");
                                size=sc.nextInt();
                                if(size==36)
                                {
                                    System.out.println("Price is : 650Rs");
                                    price=650;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==38)
                                {
                                    System.out.println("Price is : 700Rs");
                                    price=700;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==40)
                                {
                                    System.out.println("Price is : 800Rs");
                                    price=800;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==42)
                                {
                                    System.out.println("Price is : 900Rs");
                                    price=900;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==44)
                                {
                                    System.out.println("Price is : 1000Rs");
                                    price=1000;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                break;

                            case 3:
                                System.out.print("Enter Size of T-Shirt(36,38,40,42,44) : ");
                                size=sc.nextInt();
                                if(size==36)
                                {
                                    System.out.println("Price is : 250Rs");
                                    price=250;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==38)
                                {
                                    System.out.println("Price is : 260Rs");
                                    price=260;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==40)
                                {
                                    System.out.println("Price is : 300Rs");
                                    price=300;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==42)
                                {
                                    System.out.println("Price is : 350Rs");
                                    price=350;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==44)
                                {
                                    System.out.println("Price is : 400Rs");
                                    price=400;
                                    System.out.print("Enter Quantity : ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                break;

                            case 4:
                                System.out.println("1.UpperWear\n");
                                System.out.println("2.LowerWear\n");
                                System.out.print("Enter Choice : ");
                                choice3=sc.nextInt();
                                System.out.print("\033[H\033[2J");
                    System.out.flush();
                                if(choice3==1)
                                {
                                    System.out.print("Enter Size of UpperWear(80,85,90,95,100) : ");
                                    size=sc.nextInt();
                                    if(size==80)
                                    {
                                        System.out.println("Price is : 100Rs");
                                        price=100;
                                        System.out.print("Enter Quantity : ");
                                        quantity=sc.nextInt();
                                        ftotal=quantity*price;
                                        System.out.println("Total Price is :"+quantity*price);
                                    }
                                    if(size==85)
                                    {
                                        System.out.println("Price is : 130Rs");
                                        price=130;
                                        System.out.print("Enter Quantity : ");
                                        quantity=sc.nextInt();
                                        ftotal=quantity*price;
                                        System.out.println("Total Price is :"+quantity*price);
                                    }
                                    if(size==90)
                                    {
                                        System.out.println("Price is : 150Rs");
                                        price=150;
                                        System.out.print("Enter Quantity :");
                                        quantity=sc.nextInt();
                                        ftotal=quantity*price;
                                        System.out.println("Total Price is :"+quantity*price);
                                    }
                                    if(size==95)
                                    {
                                        System.out.println("Price is : 170Rs");
                                        price=170;
                                        System.out.print("Enter Quantity : ");
                                        quantity=sc.nextInt();
                                        ftotal=quantity*price;
                                        System.out.println("Total Price is :"+quantity*price);
                                    }
                                    if(size==100)
                                    {
                                        System.out.println("Price is : 200Rs");
                                        price=200;
                                        System.out.print("Enter Quantity : ");
                                        quantity=sc.nextInt();
                                        ftotal=quantity*price;
                                        System.out.println("Total Price is :"+quantity*price);
                                    }
                                }
                                 if(choice3==2)
                                    {
                                        System.out.print("Enter Size of LowerWear(80,85,90,95,100,110,120) : ");
                                        size=sc.nextInt();
                                        if(size==80)
                                        {
                                            System.out.println("Price is : 100Rs");
                                            price=100;
                                            System.out.print("Enter Quantity : ");
                                            quantity=sc.nextInt();
                                            ftotal=quantity*price;
                                            System.out.println("Total Price is :"+quantity*price);
                                        }
                                        if(size==90)
                                        {
                                            System.out.println("Price is : 130Rs");
                                            price=130;
                                            System.out.print("Enter Quantity : ");
                                            quantity=sc.nextInt();
                                            ftotal=quantity*price;
                                            System.out.println("Total Price is :"+quantity*price);
                                        }
                                        if(size==100)
                                        {
                                            System.out.println("Price is : 150Rs");
                                            price=150;
                                            System.out.print("Enter Quantity : ");
                                            quantity=sc.nextInt();
                                            ftotal=quantity*price;
                                            System.out.println("Total Price is :"+quantity*price);
                                        }
                                        if(size==110)
                                        {
                                            System.out.println("Price is : 170Rs");
                                            price=170;
                                            System.out.print("Enter Quantity : ");
                                            quantity=sc.nextInt();
                                            ftotal=quantity*price;
                                            System.out.println("Total Price is :"+quantity*price);
                                        }
                                        if(size==120)
                                        {
                                            System.out.println("Price is : 200Rs");
                                            price=200;
                                            System.out.print("Enter Quantity : ");
                                            quantity=sc.nextInt();
                                            ftotal=quantity*price;
                                            System.out.println("Total Price is :"+quantity*price);
                                        }

                                    }
                                    break;
                                        
                                    case 5:
                                        System.out.println("Please Select Category\n");
                                        System.out.println("1.Sandles \n 2.Shoes ");
                                        System.out.print("Enter Your Choice : ");
                                        choice4=sc.nextInt();
                                        System.out.print("\033[H\033[2J");
                    System.out.flush();
                                        if(choice4==1)
                                        {
                                            System.out.println("1.Paragon");
                                            System.out.println("2.SparX");
                                            System.out.println("3.Bata");
									 System.out.print("Select the Brand Of sandle You Want : ");
                                            brand=sc.nextInt();
                                            if(brand==1)
                                            {
                                                System.out.print("Plz Enter Size of Sandles(5,6,7,8,9,10,11,12) : ");
                                                size=sc.nextInt();
                                                if(size==5)
                                                {
                                                    System.out.println("Price is : 300Rs");
                                                    price=300;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==6)
                                                {
                                                    System.out.println("Price is : 350Rs");
                                                    price=350;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==7)
                                                {
                                                    System.out.println("Price is : 400Rs");
                                                    price=400;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==8)
                                                {
                                                    System.out.println("Price is : 450Rs");
                                                    price=450;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==9)
                                                {
                                                    System.out.println("Price is : 500Rs");
                                                    price=500;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==10)
                                                {
                                                    System.out.println("Price is : 550Rs");
                                                    price=550;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==11)
                                                {
                                                    System.out.println("Price is : 600Rs");
                                                    price=500;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==12)
                                                {
                                                    System.out.println("Price is : 700Rs");
                                                    price=700;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                            }
                                            if(brand==2)
                                            {
                                                    System.out.print("Plz Enter Size of Sandles(5,6,7,8,9,10,11,12) :");
                                                    size=sc.nextInt();
                                                    if(size==5)
                                                    {
                                                        System.out.println("Price is : 500Rs");
                                                        price=500;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==6)
                                                    {
                                                        System.out.println("Price is : 550Rs");
                                                        price=550;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==7)
                                                    {
                                                        System.out.println("Price is : 600Rs");
                                                        price=600;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==8)
                                                    {
                                                        System.out.println("Price is : 650Rs");
                                                        price=650;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==9)
                                                    {
                                                        System.out.println("Price is : 700Rs");
                                                        price=700;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==10)
                                                    {
                                                        System.out.println("Price is : 750Rs");
                                                        price=750;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==11)
                                                    {
                                                        System.out.println("Price is : 800Rs");
                                                        price=800;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==12)
                                                    {
                                                        System.out.println("Price is : 900Rs");
                                                        price=900;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                            }
if(brand==3)
                                                {
                                                    System.out.print("Plz Enter Size of Sandles(5,6,7,8,9,10,11,12) : ");
                                                    size=sc.nextInt();
                                                    if(size==5)
                                                    {
                                                        System.out.println("Price is : 500Rs");
                                                        price=500;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==6)
                                                    {
                                                        System.out.println("Price is : 550Rs");
                                                        price=550;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==7)
                                                    {
                                                        System.out.println("Price is : 600Rs");
                                                        price=600;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==8)
                                                    {
                                                        System.out.println("Price is : 650Rs");
                                                        price=650;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==9)
                                                    {
                                                        System.out.println("Price is : 700Rs");
                                                        price=700;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==10)
                                                    {
                                                        System.out.println("Price is : 750Rs");
                                                        price=750;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==11)
                                                    {
                                                        System.out.println("Price is : 800Rs");
                                                        price=800;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                    if(size==12)
                                                    {
                                                        System.out.println("Price is : 900Rs");
                                                        price=900;
                                                        ftotal=price;
                                                        System.out.println("Total Price is :"+price);
                                                    }
                                                }
                                            }    
                                            if(choice4==2)
                                        {
                                            {    
                                                System.out.print("Plz Enter Size of Shoes(5,6,7,8) : ");
                                                size=sc.nextInt();
                                                if(size==5)
                                                {
                                                    System.out.println("Price is : 500Rs");
                                                    price=500;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==6)
                                                {
                                                    System.out.println("Price is : 550Rs");
                                                    price=550;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==7)
                                                {
                                                    System.out.println("Price is : 600Rs");
                                                    price=600;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                                if(size==8)
                                                {
                                                    System.out.println("Price is : 650Rs");
                                                    price=650;
                                                    ftotal=price;
                                                    System.out.println("Total Price is :"+price);
                                                }
                                            }
                                        }                             
                                    
                                    
                                            break;
                                
                                    default:  
                                    System.out.println("Invalid Choice");
                        
                    }
                }        //************************************************************** */
                    if(choice1=='2')
                    {
                        System.out.println("* Females Product *");
                        System.out.println("1.Tops");
                        System.out.println("2.Jeans");
                        System.out.println("3.T-Shirts");
                        System.out.println("4.Footwear");
                        System.out.print("Enter Your choice :");
                        choice6=sc.nextInt();       //choice6 for female product menu
                        System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                        switch(choice6)
                        {
                            case 1:
                                System.out.print("Enter Size of Tops(6,8,10,12,14) : ");
                                size=sc.nextInt();
                                if(size==6)
                                {
                                    System.out.println("Price is : 350Rs");
                                    price=250;
                                    System.out.print("Enter Quantity: ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==8)
                                {
                                    System.out.println("Price is : 400Rs");
                                    price=260;
                                    System.out.print("Enter Quantity: ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==10)
                                {
                                    System.out.println("Price is : 450Rs");
                                    price=300;
                                    System.out.print("Enter Quantity: ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==12)
                                {
                                    System.out.println("Price is : 500Rs");
                                    price=350;
                                    System.out.print("Enter Quantity: ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                if(size==14)
                                {
                                    System.out.println("Price is : 550Rs");
                                    price=400;
                                    System.out.print("Enter Quantity: ");
                                    quantity=sc.nextInt();
                                    ftotal=quantity*price;
                                    System.out.println("Total Price is :"+quantity*price);
                                }
                                break;
                            case 2:
                            System.out.print("Enter Size of Jeans(30,32,34,36,38) : ");
                            size=sc.nextInt();
                            if(size==30)
                            {
                                System.out.println("Price is : 650Rs");
                                price=650;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==32)
                            {
                                System.out.println("Price is : 700Rs");
                                price=700;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==34)
                            {
                                System.out.println("Price is : 800Rs");
                                price=800;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==36)
                            {
                                System.out.println("Price is : 900Rs");
                                price=900;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==38)
                            {
                                System.out.println("Price is : 1000Rs");
                                price=1000;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            break;

                            case 3:
                            System.out.print("Enter Size of T-Shirts(12,14,16,18,20) : ");
                            size=sc.nextInt();
                            if(size==12)
                            {
                                System.out.println("Price is : 250Rs");
                                price=250;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==14)
                            {
                                System.out.println("Price is : 260Rs");
                                price=260;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==16)
                            {
                                System.out.println("Price is : 300Rs");
                                price=300;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==18)
                            {
                                System.out.println("Price is : 350Rs");
                                price=350;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                            if(size==20)
                            {
                                System.out.println("Price is : 400Rs");
                                price=400;
                                System.out.print("Enter Quantity: ");
                                quantity=sc.nextInt();
                                ftotal=quantity*price;
                                System.out.println("Total Price is :"+quantity*price);
                            }
                         
                            break;
                        
                            case 4:
                            System.out.println("Please Select Category\n");
                            System.out.println("1.Sandles \n 2.Shoes ");
                            System.out.print("Enter Your Choice: ");
                            choice4=sc.nextInt();
                            System.out.print("\033[H\033[2J");
                    System.out.flush();
                            if(choice4==1)
                            {
                                
                                System.out.println("1.Paragon");
                                System.out.println("2.SparX");
                                System.out.println("3.Bata");
						   System.out.print("Which Brand Of sandle You Want:  ");
                                brand=sc.nextInt();
                                System.out.print("\033[H\033[2J");
                    System.out.flush();
                                if(brand==1)
                                {
                                    System.out.print("Plz Enter Size of Sandles(5,6,7,8,9,10,11,12) : ");
                                    size=sc.nextInt();
                                    if(size==5)
                                    {
                                        System.out.println("Price is : 300Rs");
                                        price=300;
                                       ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==6)
                                    {
                                        System.out.println("Price is : 350Rs");
                                        price=350;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==7)
                                    {
                                        System.out.println("Price is : 400Rs");
                                        price=400;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==8)
                                    {
                                        System.out.println("Price is : 450Rs");
                                        price=450;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==9)
                                    {
                                        System.out.println("Price is : 500Rs");
                                        price=500;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==10)
                                    {
                                        System.out.println("Price is : 550Rs");
                                        price=550;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==11)
                                    {
                                        System.out.println("Price is : 600Rs");
                                        price=500;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==12)
                                    {
                                        System.out.println("Price is : 700Rs");
                                        price=700;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                }
                                if(brand==2)
                                {
                                        System.out.print("Plz Enter Size of Sandles(5,6,7,8,9,10,11,12) : ");
                                        size=sc.nextInt();
                                        if(size==5)
                                        {
                                            System.out.println("Price is : 500Rs");
                                            price=500;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==6)
                                        {
                                            System.out.println("Price is : 550Rs");
                                            price=550;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==7)
                                        {
                                            System.out.println("Price is : 600Rs");
                                            price=600;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==8)
                                        {
                                            System.out.println("Price is : 650Rs");
                                            price=650;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==9)
                                        {
                                            System.out.println("Price is : 700Rs");
                                            price=700;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==10)
                                        {
                                            System.out.println("Price is : 750Rs");
                                            price=750;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==11)
                                        {
                                            System.out.println("Price is : 800Rs");
                                            price=800;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==12)
                                        {
                                            System.out.println("Price is : 900Rs");
                                            price=900;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                }
                                    if(brand==3)
                                    {
                                        System.out.print("Plz Enter Size of Sandles(5,6,7,8,9,10,11,12) : ");
                                        size=sc.nextInt();
                                        if(size==5)
                                        {
                                            System.out.println("Price is : 500Rs");
                                            price=500;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==6)
                                        {
                                            System.out.println("Price is : 550Rs");
                                            price=550;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==7)
                                        {
                                            System.out.println("Price is : 600Rs");
                                            price=600;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==8)
                                        {
                                            System.out.println("Price is : 650Rs");
                                            price=650;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==9)
                                        {
                                            System.out.println("Price is : 700Rs");
                                            price=700;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==10)
                                        {
                                            System.out.println("Price is : 750Rs");
                                            price=750;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==11)
                                        {
                                            System.out.println("Price is : 800Rs");
                                            price=800;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                        if(size==12)
                                        {
                                            System.out.println("Price is : 900Rs");
                                            price=900;
                                            ftotal=price;
                                            System.out.println("Total Price is :"+price);
                                        }
                                    }
                                }    
                                if(choice4==2)
                            {
                                {    
                                    System.out.print("Plz Enter Size of Shoes(5,6,7,8) : ");
                                    size=sc.nextInt();
                                    if(size==5)
                                    {
                                        System.out.println("Price is : 500Rs");
                                        price=500;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==6)
                                    {
                                        System.out.println("Price is : 550Rs");
                                        price=550;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==7)
                                    {
                                        System.out.println("Price is : 600Rs");
                                        price=600;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                    if(size==8)
                                    {
                                        System.out.println("Price is : 650Rs");
                                        price=650;
                                        ftotal=price;
                                        System.out.println("Total Price is :"+price);
                                    }
                                }                       
                            }
                            break;
                                default:System.out.println("Invalid Choice");
                    }            
        }
     return ftotal;    
    }

}

class Grocery extends Fashion
{
   float grocery()
    {
        int chh,dal;
        float gtotal=0;
        System.out.println("\t\t** Grocery Products **\t\t");
        System.out.println("Select the Grocery You Want?");
        System.out.println("1.Wheat");
        System.out.println("2.Rice");
        System.out.println("3.Pulses");
        System.out.println("4.Wheat Flour");
        System.out.println("5.Groundnaut Oil");
        System.out.println("6.Soyabean Oil");
        System.out.print("Please Enter your choice: ");
        Scanner s = new Scanner(System.in);
        chh=s.nextInt();
        System.out.print("\033[H\033[2J");
                    System.out.flush();
        switch(chh)
        {
            case 1:
                    System.out.println("1kg = 40Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s.nextInt();
                    gtotal=quantity*40;
                    System.out.println("Total Price is : " + quantity*40);
                    break;
            case 2:
                    System.out.println("1kg = 50Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s.nextInt();
                    gtotal=quantity*50;
                    System.out.println("Total Price is : " + quantity*50);
                    break;
            case 3:
                    
                    System.out.println("1.Moong Dal");
                    System.out.println("2.Harbhara Dal");
                    System.out.println("3.Udid Dal");
                    System.out.println("4.Masoor Dal");
				 System.out.print("Which Type Of Pulses You want: ");
                    dal=s.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    switch(dal)
                    {
                        case 1:
                                System.out.println("1kg =140Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s.nextInt();
                                gtotal=quantity*140;
                                System.out.println("Total Price is : " + quantity*140);
                                break;
                        case 2:
                                System.out.println("1kg =63Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s.nextInt();
                                gtotal=quantity*63;
                                System.out.println("Total Price is : " + quantity*63);
                                break;
                        case 3:
                                System.out.println("1kg =115Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s.nextInt();
                                gtotal=quantity*115;
                                System.out.println("Total Price is : " + quantity*115);
                                break;
                        case 4:
                                System.out.println("1kg =108Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s.nextInt();
                                gtotal=quantity*108;
                                System.out.println("Total Price is : " + quantity*108);
                                break;
                        default:
                                System.out.println("Invalid choice");
                    }
                    break;
                  
            case 4:
                    System.out.println("1kg = 59Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s.nextInt();
                    gtotal=quantity*59;
                    System.out.println("Total Price is : " + quantity*59);
                    break;
            case 5:
                    System.out.println("1kg = 220Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s.nextInt();
                    gtotal=quantity*220;
                    System.out.println("Total Price is : " + quantity*220);
                    break;
            case 6:
                    System.out.println("1kg = 190Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s.nextInt();
                    gtotal=quantity*190;
                    System.out.println("Total Price is : " + quantity*190);
                    break;
            default:
                    System.out.println("Invalid Choice");
        }
        return gtotal;
    }
}
    
class FAndV extends Grocery
{   
    int cch,cch1,cch2;
    float fvtotal=0;
    float fAndV()
    {
        System.out.println("1.Fruits");
        System.out.println("2.Vegatables");
	   System.out.print("Choose What You Want: ");
        Scanner s1 = new Scanner(System.in);
        cch=s1.nextInt();
        System.out.print("\033[H\033[2J");
                    System.out.flush();
        switch(cch)
        {
            case 1:
                   
                    System.out.println("1.Banana");
                    System.out.println("2.Apple");
                    System.out.println("3.Mango");
                    System.out.println("4.Strawberry");
                    System.out.println("5.grapes");
                    System.out.print("Select The Fruits Which You Want: ");
                    cch1=s1.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    switch(cch1)
                    {
                        case 1:
                                System.out.println("1dozen = 40Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s1.nextInt();
                                fvtotal=quantity*40;
                                System.out.println("Total Price is : " + quantity*40);
                                break;
                        case 2:
                                System.out.println("1kg =120Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s1.nextInt();
                                fvtotal=quantity*120;
                                System.out.println("Total Price is : " + quantity*120);
                                break;   
                        case 3:
                                System.out.println("1kg =80Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s1.nextInt();
                                fvtotal=quantity*80;
                                System.out.println("Total Price is : " + quantity*80);
                                break;         
                        case 4:
                                System.out.println("1kg =200Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s1.nextInt();
                                fvtotal=quantity*200;
                                System.out.println("Total Price is : " + quantity*200);
                                break;  
                        case 5:
                                System.out.println("1kg =60Rs");
                                System.out.print("Enter how many Quantity you want :");
                                quantity=s1.nextInt();
                                fvtotal=quantity*60;
                                System.out.println("Total Price is : " + quantity*60);
                                break;      
                        default:
                                System.out.println("Invalid Choice");
                                
                    }
                    break;
             case 2:
                            System.out.println("1.Tomato");
                            System.out.println("2.Potato");
                            System.out.println("3.Ginger");
                            System.out.println("4.Onion");
                            System.out.println("5.LadyFinger");
						System.out.print("Select The Vegetables Which You Want: ");
                            cch2=s1.nextInt();
                            System.out.print("\033[H\033[2J");
                    System.out.flush();

                            switch(cch2)
                            {
                                case 1:
                                        System.out.println("1kg = 30Rs");
                                        System.out.print("Enter how many Quantity you want :");
                                        quantity=s1.nextInt();
                                        fvtotal=quantity*30;
                                        System.out.println("Total Price is : " + quantity*30);
                                        break;
                                case 2:
                                        System.out.println("1kg =20Rs");
                                        System.out.print("Enter how many Quantity you want :");
                                        quantity=s1.nextInt();
                                        fvtotal=quantity*20;
                                        System.out.println("Total Price is : " + quantity*20);
                                        break;   
                                case 3:
                                        System.out.println("1kg =160Rs");
                                        System.out.print("Enter how many Quantity you want :");
                                        quantity=s1.nextInt();
                                        fvtotal=quantity*160;
                                        System.out.println("Total Price is : " + quantity*160);
                                        break;         
                                case 4:
                                        System.out.println("1kg =30Rs");
                                        System.out.print("Enter how many Quantity you want :");
                                        quantity=s1.nextInt();
                                        fvtotal=quantity*30;
                                        System.out.println("Total Price is : " + quantity*30);
                                        break;  
                                case 5:
                                        System.out.println("1kg =15Rs");
                                        System.out.print("Enter how many Quantity you want :");
                                        quantity=s1.nextInt();
                                        fvtotal=quantity*15;
                                        System.out.println("Total Price is : " + quantity*15);
                                        break;      
                                default:
                                        System.out.println("Invalid Choice");
                            }
                            break;
                 default:System.out.println("Invalid Choice");       



        }
        return fvtotal;
    }
}
class Utensils
{
    int cc,cc1;
    float utotal=0;
    float utensils()
    {
        int quantity;
       
        System.out.println("1.Pan");
        System.out.println("2.Bowl");
        System.out.println("3.Spoon");
        System.out.println("4.Steel Glass");
        System.out.println("5.Steel Plates");
        System.out.println("6.Kadhai");
	   System.out.print("Enter WHich Type Of Utensils: ");
        Scanner s1 = new Scanner(System.in);
        cc=s1.nextInt();
        System.out.print("\033[H\033[2J");
                    System.out.flush();
        switch(cc)
        {
            case 1:
                    System.out.println("1 unit = 600Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s1.nextInt();
                    utotal=quantity*600;
                    System.out.println("Total Price is : " + quantity*600);
                    break;
            case 2:
                    System.out.println("1 unit =200Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s1.nextInt();
                    utotal=quantity*200;
                    System.out.println("Total Price is : " + quantity*200);
                    break;   
            case 3:
                    System.out.println("1 unit =20Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s1.nextInt();
                    utotal=quantity*20;
                    System.out.println("Total Price is : " + quantity*20);
                    break;         
            case 4:
                    System.out.println("1 unit =50Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s1.nextInt();
                    utotal=quantity*50;
                    System.out.println("Total Price is : " + quantity*50);
                    break;  
            case 5:
                    System.out.println("1 unit =250Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s1.nextInt();
                    utotal=quantity*250;
                    System.out.println("Total Price is : " + quantity*250);
                    break;     
            case 6:
                    System.out.println("1 unit =900Rs");
                    System.out.print("Enter how many Quantity you want :");
                    quantity=s1.nextInt();
                    utotal=quantity*900;
                    System.out.println("Total Price is : " + quantity*900);
                    break;      
            default:
                    System.out.println("Invalid Choice");
        }

        return utotal;
        }

    }

class BeautyProduct
{
    float btotal=0;
    float beautyProduct()
    {
        System.out.println("1.Perfume");
        System.out.println("2.Eye Liner");
        System.out.println("3.Lipstick");
        System.out.println("4.Foundation");
        System.out.println("5.Mascara");
        System.out.println("6.FaceWash");
	   System.out.print("Enter the category Of beauty products :");
        Scanner sc = new Scanner(System.in);
        int c1=sc.nextInt();
        System.out.print("\033[H\033[2J");
                    System.out.flush();

        switch(c1)
        {
            case 1:
                    
                    System.out.println("1.Male");
                    System.out.println("2.Female");
				 System.out.print("Select the Category: ");
                    int c2 =sc.nextInt();
                    switch(c2)
                    {
                        case 1:
                                System.out.println("**** Male Perfumes ****");
                                System.out.println("1.Fogg");
                                System.out.println("2.Park Avenue");
                                System.out.println("3.Engage");
                                System.out.println("4.Denver");
						   System.out.print("Select the Perfume : ");
                                int c3 =sc.nextInt();
                                System.out.print("\033[H\033[2J");
                    System.out.flush();
                                switch(c3)
                                {
                                    case 1:
                                            System.out.println("1 Unit = 200Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            int quantity =sc.nextInt();
                                            btotal=quantity*200;
                                            System.out.println("Total Price Is : "+quantity*200);
                                            break;
                                     case 2:
                                            System.out.println("1 unit =350Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            quantity=sc.nextInt();
                                            btotal=quantity*350;
                                            System.out.println("Total Price is : " + quantity*350);
                                            break;  
                                    case 3:
                                            System.out.println("1 unit =200Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            quantity=sc.nextInt();
                                            btotal=quantity*200;
                                            System.out.println("Total Price is : " + quantity*200);
                                            break;  
                                    case 4:
                                            System.out.println("1 unit =300Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            quantity=sc.nextInt();
                                            btotal=quantity*300;
                                            System.out.println("Total Price is : " + quantity*300);
                                            break;  
                                   default:
                                            System.out.println("Invalid Choice");
                                    
                                }
							break;
                         case 2:
                                
                                System.out.println("**** Female Perfumes ****");
                                System.out.println("1.Engage ON Floral");
                                System.out.println("2.Bella Vita Organic Glam");
                                System.out.println("3.Avon");
                                System.out.println("4.SKINN Tales");
                                System.out.print("Select the Perfume: ");
                                int c4 =sc.nextInt();
                                System.out.print("\033[H\033[2J");
                    System.out.flush();
                                switch(c4)
                                {
                                    case 1:
                                            System.out.println("1 Unit = 200Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            int quantity =sc.nextInt();
                                            btotal=quantity*200;
                                            System.out.println("Total Price Is : "+quantity*200);
                                            break;
                                    case 2:
                                            System.out.println("1 unit =350Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            quantity=sc.nextInt();
                                            btotal=quantity*350;
                                            System.out.println("Total Price is : " + quantity*350);
                                            break;  
                                    case 3:
                                            System.out.println("1 unit =200Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            quantity=sc.nextInt();
                                            btotal=quantity*200;
                                            System.out.println("Total Price is : " + quantity*200);
                                            break;  
                                    case 4:
                                            System.out.println("1 unit =300Rs");
                                            System.out.print("Enter how many Quantity you want :");
                                            quantity=sc.nextInt();
                                            btotal=quantity*300;
                                            System.out.println("Total Price is : " + quantity*300);
                                            break;  
                                    default:
                                            System.out.println("Invalid Choice");
                                    
                                }

                    }
				break;
                case 2:
                        System.out.println("1 Unit = 200Rs");
                        System.out.print("Enter how many Quantity you want : ");
                        int quantity =sc.nextInt();
                        btotal=quantity*200;
                        System.out.println("Total Price Is : "+quantity*200);
                        break;
                case 3:
                        System.out.println("1 Unit = 400Rs");
                        System.out.print("Enter how many Quantity you want : ");
                        quantity =sc.nextInt();
                        btotal=quantity*400;
                        System.out.println("Total Price Is : "+quantity*400);
                        break;
                case 4:
                        System.out.println("1 Unit = 500Rs");
                        System.out.print("Enter how many Quantity you want : ");
                        quantity =sc.nextInt();
                        btotal=quantity*500;
                        System.out.println("Total Price Is : "+quantity*500);
                        break;
                case 5:
                        System.out.println("1 Unit = 200Rs");
                        System.out.print("Enter how many Quantity you want :");
                        quantity =sc.nextInt();
                        btotal=quantity*200;
                        System.out.println("Total Price Is : "+quantity*200);
                        break;
                case 6:
                        System.out.println("1.Male");
                        System.out.println("2.Female");
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
					System.out.print("Select the Category: ");
                         c2 =sc.nextInt();
                        switch(c2)
                        {
                            case 1:
                                    System.out.println("**** Male Facewash ****");
                                    System.out.println("1.Nivea");
                                    System.out.println("2.Mamaearth");
                                    System.out.println("3.Garnier");
                                    System.out.println("4.Beardo");
							  System.out.print("Select the Facewash : ");
                                     int c3 =sc.nextInt();
                                     System.out.print("\033[H\033[2J");
                                     System.out.flush();
                                    switch(c3)
                                    {
                                        case 1:
                                                System.out.println("1 Unit = 300Rs");
                                                System.out.print("Enter how many Quantity you want :");
                                                 quantity =sc.nextInt();
                                                 btotal=quantity*300;
                                                System.out.println("Total Price Is : "+quantity*300);
                                                break;
                                         case 2:
                                                System.out.println("1 unit =350Rs");
                                                System.out.print("Enter how many Quantity you want :");
                                                quantity=sc.nextInt();
                                                btotal=quantity*350;
                                                System.out.println("Total Price is : " + quantity*350);
                                                break;  
                                        case 3:
                                                System.out.println("1 unit =400Rs");
                                                System.out.print("Enter how many Quantity you want :");
                                                quantity=sc.nextInt();
                                                btotal=quantity*400;
                                                System.out.println("Total Price is : " + quantity*400);
                                                break;  
                                        case 4:
                                                System.out.println("1 unit =450Rs");
                                                System.out.print("Enter how many Quantity you want :");
                                                quantity=sc.nextInt();
                                                btotal=quantity*450;
                                                System.out.println("Total Price is : " + quantity*450);
                                                break;  
                                       default:
                                                System.out.println("Invalid Choice");
                                        
                                    }
						break;
                             case 2:
                                    
                                    System.out.println("**** Female Facewash ****");
                                    System.out.println("1.L'oreal");
                                    System.out.println("2.NIVEA Women Face Was");
                                    System.out.println("3.Dove");
                                    System.out.println("4.Glow & lovely");
                                    System.out.print("Select the Facewash: ");
                                    int c4 =sc.nextInt();
                                    switch(c4)
                                    {
                                        case 1:
                                                System.out.println("1 Unit = 200Rs");
                                                System.out.println("Enter how many Quantity you want :");
                                                 quantity =sc.nextInt();
                                                 btotal=quantity*200;
                                                System.out.println("Total Price Is : "+quantity*200);
                                                break;
                                        case 2:
                                                System.out.println("1 unit =350Rs");
                                                System.out.println("Enter how many Quantity you want :");
                                                quantity=sc.nextInt();
                                                btotal=quantity*350;
                                                System.out.println("Total Price is : " + quantity*350);
                                                break;  
                                        case 3:
                                                System.out.println("1 unit =325Rs");
                                                System.out.print("Enter how many Quantity you want :");
                                                quantity=sc.nextInt();
                                                btotal=quantity*325;
                                                System.out.println("Total Price is : " + quantity*325);
                                                break;  
                                        case 4:
                                                System.out.println("1 unit =300Rs");
                                                System.out.print("Enter how many Quantity you want :");
                                                quantity=sc.nextInt();
                                                btotal=quantity*300;
                                                System.out.println("Total Price is : " + quantity*300);
                                                break;  
                                        default:
                                                System.out.println("Invalid Choice");
                                        
                                    }
							break;
    							default:
                                                System.out.println("Invalid Choice");
                        }
        }
        return btotal;
    }
}
interface TestBill
{
     void bill(double f,double g,double fv,double u,double b);
}
class ShoppingMart 
{
  double discount=0,totald=0;
    public void bill(double f,double g,double fv,double u,double b)
    {
	   System.out.println("\n\n==========================================================================");
        System.out.println("\n      ****** Bill ******       ");
        System.out.println("Fashion Products      : Rs. " +f);
        System.out.println("Grocery Products      : Rs. " +g);
        System.out.println("Fruits And Vegetables : Rs. " +fv);
        System.out.println("Utensils              : Rs. " +u);
        System.out.println("Beauty Products       : Rs. " +b);
        System.out.println("Total Bill            : Rs. "+(f+g+fv+u+b));
        discount=((f+g+fv+u+b)*5)/100;
        System.out.println("Discount  (5%)        : Rs. "+discount);
        totald=(f+g+fv+u+b)-discount;
        System.out.println("Discounted Price is   : Rs. "+totald);
        double total=(totald*18)/100;

        System.out.println("Total GST             :Rs. " + total);
        System.out.println("Total Bill With GST & Discount :Rs.  "+(totald+total));

        System.out.println("\n\t :) You Have Saved :)  : Rs. "+ discount);

	   System.out.println("\n");

        System.out.println("\t\t !!!...Please Visit Again...!!!");
	   System.out.println("=============================================================================");

    }
    public static void main(String[] args) 
    {
        ShoppingMart sm=new ShoppingMart();
        double fsum=0,gsum=0,fvsum=0,usum=0,bsum=0;
        Fashion F = new Fashion();
        Grocery G = new Grocery();
        FAndV FV = new FAndV();
        Utensils U = new Utensils();
        BeautyProduct B = new BeautyProduct();
        int choi,d;

        do{
                System.out.println("\n\t\t** Shopping Mart **\t\t\n");
                System.out.println("1.Fashion");
                System.out.println("2.Grocery");
                System.out.println("3.Fruits And Vegetables");
                System.out.println("4.Utensils");
                System.out.println("5.Beauty Products \n");
			  System.out.print("Select The Product Category Which You Want : ");
                Scanner s = new Scanner(System.in);
                choi=s.nextInt();
                System.out.print("\033[H\033[2J");
                    System.out.flush();
              
                
                switch(choi)
                {
                        case 1: fsum=fsum+(F.fashion());
                                break;
                        case 2:gsum=gsum + (G.grocery());
                                break;
                        case 3:fvsum=fvsum+(FV.fAndV());
                                break;
                        case 4:usum=usum + (U.utensils());
                                break;
                        case 5:bsum=bsum +(B.beautyProduct());
                                break; 
                        default:    
                                    System.out.println("***** Invalid Choice !! *****")  ;                 
                }
               
                    System.out.print("Do you Want to Continue Shopping (1 for Continue AND 0 For Stop ) : ");
                 d=s.nextInt(); 
                 
                
                
            }while(d==1);
           
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                
            sm.bill(fsum,gsum,fvsum,usum,bsum);
            
    }   
    
}
