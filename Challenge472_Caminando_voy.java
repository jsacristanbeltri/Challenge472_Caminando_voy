//Jorge Sacristan Beltri


import java.util.Scanner;

public class Challenge472_Caminando_voy
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int desnivel=0, cotas=0, cota1=0, cota2=0, temp=0;
        boolean valido=true;
       
        while(sc.hasNext())
        {
            desnivel=sc.nextInt();
            cotas=sc.nextInt();
    
            valido=true;
            temp=0;
            
            cota1=sc.nextInt();
          
            for(int i=1;i<cotas;i++)
            {
                cota2 = sc.nextInt();
                
                if(cota2>cota1)
                {
                    temp+=Math.abs(cota2-cota1);
                    
                }
                else
                {
                   temp=0;
                }
                
                if(temp>desnivel)
                {
                    valido=false;
                    sc.nextLine();
                    break;
                }
                cota1=cota2;      
            }   
          System.out.println( (valido) ? "APTA" : "NO APTA" );
             
        }
        
    }
}

