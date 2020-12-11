import java.util.Scanner;

public class Challenge472_Caminando_voy
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int desnivel=0, mayor=0, menor=0, cotas=0, cota=0;

        System.out.print("Introduzca el desnivel: ");
       
        while(sc.hasNext())
        {
            menor=0;
            mayor=0;
            System.out.print("Introduzca el desnivel: ");
            desnivel=sc.nextInt();
            System.out.print("Introduzca las cotas ");
            cotas=sc.nextInt();
            sc.nextLine();
            
            for(int i=0;i<cotas;i++)
            {
                cota = sc.nextInt();
                if(cota<menor)
                    menor=cota;
                    
                if(cota>mayor)
                    mayor=cota;
            }
            
        
            if((mayor-menor)>300)
            {
                System.out.print("NO APTA");
            }
            else
                System.out.print("APTA");
             
        }
        
    }
}
