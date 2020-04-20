import java.util.Scanner;
public class Pattern
{
    public static void main(String[] args) {
  System.out.println("HI FRIENDS, I AM SAATHVIK😎"); 
  System.out.println("PLEASE ENTER YOUR NAME");
  Scanner sc=new Scanner(System.in);  
  String input=sc.nextLine();
  input=input.toUpperCase();
 if(!input.matches("[A-Z\\s]{1,}"))
 {
  System.out.println("Please enter valid name");
  return;  
 }
  for(int n=0;n<=input.length()-1;n++)
  {
     char ch=input.charAt(n);
     
     switch(ch)
     {
     case 'A':
          
       for(int i=1;i<=5;i++)  
       {
       for(int j=1;j<=5;j++)
       {
       if(i==1||j==1||i==3||j==5)
         System.out.print("##");
       else
         System.out.print("  ");
       }
       System.out.println();
       }     
    
    
       System.out.print("\n\n");
       break;
   
     
     case 'B':
        
       for(int i=1;i<=5;i++)  
       {
       for(int j=1;j<=5;j++)
       { 
       if(i==1||j==2||i==3||j==5||i==5)  
       { 
       if(i==3&&j==1)
         System.out.print("  ");
       else 
         System.out.print("##");
       }
       else 
         System.out.print("  ");
       }
       System.out.println();
       }
        
    
       System.out.print("\n\n");
       break;
     
    
     case 'C':
       
       for(int i=1;i<=5;i++)  
       {
       for(int j=1;j<=5;j++)
       {
       if(i==1||j==1||i==5)
         System.out.print("##");
       else
         System.out.print("  ");
       }
       System.out.println();
       }    
        
       System.out.print("\n\n");
       break;
        
     case 'D':
       
      for(int i=1;i<=5;i++)  
      {
      for(int j=1;j<=5;j++)
      {
      if(i==1||j==2||i==5||j==5)
        System.out.print("##");
      else
        System.out.print("  ");
      }
       System.out.println();
      }   
      
      
      System.out.print("\n\n");
      break;  
       
     case 'E':
     
      for(int i=1;i<=5;i++)  
     {
      for(int j=1;j<=5;j++)
     {
      if(i==1||j==1||i==3||i==5)
        System.out.print("##");
      else
        System.out.print("  ");
     }
     System.out.println();
     }  
     
     
     System.out.print("\n\n");
     break;
     
   case 'F':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||j==1||i==3)
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }     
    
     System.out.print("\n\n");
     break;
     
   case 'G':
    
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||j==1||i==3||i==5||i==4)
     {
     if((i==3&&j==2)||(i==5&&j==4)||(i==4&&j==2)||(i==4&&j==4))
       System.out.print("  ");
     else if((i==4&&j==3)||(i==4&&j==5))
       System.out.print("##");
     else
       System.out.print("##");
     }
     else
       System.out.print("  ");
     }
     System.out.println();
     }     
     
     System.out.print("\n\n");
     break;
   
   
   case 'H':
   
     for(int i=1;i<=5;i++) 
     {
     for(int j=1;j<=5;j++)
     {
     if(i==3||j==1||j==5)
       System.out.print("##");
     else 
       System.out.print("  ");
   
     }
     System.out.println();
     }  
     
     System.out.print("\n\n");
     break;    
   
   case 'I':
     
     
     for(int i=1;i<=5;i++) 
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||i==5||j==3)
       System.out.print("##");
     else 
       System.out.print("  ");
     }
     System.out.println();
     } 
   
     System.out.print("\n\n");
     break;
   
   case 'J':
   
     for(int i=1;i<=5;i++) 
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||j==3)
       System.out.print("##");
     else if((i==4&&j==1)||(i==5&&j==1)||(i==5&&j==2))
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }   
   
     System.out.print("\n\n");
     break;
    
   case 'K':
     
     for(int i=1;i<=5;i++)
     {
     for(int j=1;j<=5;j++)
     {
     if(j==1)
       System.out.print("##");
     else if((i==3&&j==2)||(i==1&&j==5)||(i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5)||(i==2&&j==4))
       System.out.print("##");
     else 
       System.out.print("  ");
          
     }
     System.out.println();
     }
     
     System.out.print("\n\n");
     break;
   
   case 'L':
     
     for(int i=1;i<=5;i++)
     {
     for(int j=1;j<=5;j++)
     {
     if(i==5||j==1)
       System.out.print("##");
     else
       System.out.print("  ");
          
     }
     System.out.println();
     }
   
     System.out.print("\n\n");
     break;
   
   case 'M':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(j==1||j==5)
       System.out.print("##");
     else if((i==3&&j==3)||(i==2&&j==2)||(i==2&&j==4))
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     } 
            
     System.out.print("\n\n");
     break;
   
   case 'N':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(j==1||j==5)
       System.out.print("##");
     else if(i==j)
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }        
   
     System.out.print("\n\n");
     break;
   
   case 'O':
   
     for(int i=1;i<=5;i++)
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||i==5||j==1||j==5)
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }
 
     System.out.print("\n\n");
     break;
   
   case 'P':
   
     for(int i=1;i<=5;i++)
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||i==3||j==1)
       System.out.print("##");
     else if(j==5&&i==2)
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }
    
     System.out.print("\n\n");
     break;
     
   case 'Q':
      
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==5||j==5)
     {
     if(i==5&&j==5)
        System.out.print("##");
     else
        System.out.print("  ");
     }
     else if((i==3&&j==2)||(i==2&&j==3))
       System.out.print("  ");
     else
       System.out.print("##");
     }
     System.out.println();
     }
     
     System.out.print("\n\n");
     break;
   
   case 'R':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
      if(i==1||j==1)
      {
      if(i==1&&j==5)
        System.out.print("  ");
      else
        System.out.print("##");
      }
      else if((i==3&&j==2)||(i==3&&j==3)||(i==2&&j==4)||(i==5&&j==5)||(i==4&&j==4))
        System.out.print("##");
      else
        System.out.print("  ");
      }
      System.out.println();
      }   
       
     System.out.print("\n\n");
     break; 
   
   case 'S':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||i==3||i==5)
       System.out.print("##");
     else if((i==2&&j==1)||(i==4&&j==5))
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }     
   
     System.out.print("\n\n");
     break;
     
   case 'T':
   
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||j==3)
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }    
     
     System.out.print("\n\n");
     break;
     
   case 'U':
   
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==5||j==1||j==5)
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }   
     
     System.out.print("\n\n");
     break;
     
     
   case 'V':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(i==1||i==2||i==3)
     {
     if(j==2||j==3||j==4)
       System.out.print("  ");
     else
       System.out.print("##");
     }
     else if((i==4&&j==2)||(i==4&&j==4)||(i==5&&j==3))
       System.out.print("##");
     else
       System.out.print("  ");
     } 
     System.out.println();
     }   
     
     System.out.print("\n\n"); 
     break;
   
   case 'W':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(j==1||j==5)
       System.out.print("##");
     else if((i==3&&j==3)||(i==4&&j==2)||(i==4&&j==4))
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }   
 
     System.out.print("\n\n");
     break;
     
   case 'X':
     
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(j==1||j==5)
     {
     if(i==2||i==3||i==4)
       System.out.print("  ");
     else
       System.out.print("##");
     }
     else if((i==3&&j==3)||(i==4&&j==2)||(i==4&&j==4)||(i==2&&j==2)||(i==2&&j==4))
       System.out.print("##");
     else
       System.out.print("  ");
     }
     System.out.println();
     }  
 
     System.out.print("\n\n");
     break;
 
   case 'Y':
   
     for(int i=1;i<=5;i++)  
     {
     for(int j=1;j<=5;j++)
     {
     if(j==1||j==5)
     {
     if(i==2||i==3||i==4)
       System.out.print("  ");
     else if(i==5&&j==5)
       System.out.print("  ");
     else
       System.out.print("##");
     }
    else if((i==3&&j==3)||(i==4&&j==2)||(i==2&&j==2)||(i==2&&j==4))
      System.out.print("##");
    else
      System.out.print("  ");
    }
    System.out.println();
    }      
     
    System.out.print("\n\n");
    break;
 
  case 'Z':
    
    for(int i=1;i<=5;i++)  
    {
    for(int j=1;j<=5;j++)
    {
    if(i==1||i==5)
      System.out.print("##");
    else if((i==2&&j==4)||(i==3&&j==3)||(i==4&&j==2))
      System.out.print("##");
    else
      System.out.print("  ");
    }
    System.out.println();
    }      
     
    System.out.print("\n\n");
    break;
    
  default:
    
    System.out.print("\n\n\n");
    break;
    
 
  }  
     
  }
  
             
    }
}