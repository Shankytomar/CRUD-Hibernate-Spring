package com.crud.hiber.Hiber5;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
        ApplicationContext c = new ClassPathXmlApplicationContext("com/crud/hiber/Hiber5/cofig.xml");
    
        //Traveller t= new Traveller(1,"arjun singh","har ki dun");
        
        
//        int  i = td.insert(t);
//        System.out.print(i);
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        
        while(flag) {
        
        System.out.println("############### traveller CURD console ############### ");
        System.out.println("press 1 to insert  new  taveller");
        System.out.println("press 2 to fecth traveller");
        System.out.println("press 3 to get all travellers list");
        System.out.println("press 4 to delete traveller");
        System.out.println("press 5 to update traveller");
        System.out.println("press 6 to exit");
        int s =sc.nextInt();
        switch(s)
        {
        	case 1:{
                System.out.println("====== insert traveller ======");
                System.out.println("enter id");
                int id = sc.nextInt();
                System.out.println("enter name");
                String name = sc.next();
                System.out.println("enter package");
                String pack = sc.next();
                TravellerDaoImp td = c.getBean("TravellerDao",TravellerDaoImp.class);
                td.insert(new Traveller(id,name,pack));
                System.out.println("new traveller added");
                
                break;
        	}
            
        	case 2:
        	{
        		System.out.println("====== find  traveller ======");
                System.out.println("enter id");
                int id = sc.nextInt();
                TravellerDaoImp td = c.getBean("TravellerDao",TravellerDaoImp.class);
                Traveller t = td.getTraveller(id);
                System.out.println(t);
                
                break;
        	}
        	
        	case 3:
        	{
        		System.out.println("====== traveller list ======");
                TravellerDaoImp td = c.getBean("TravellerDao",TravellerDaoImp.class);
                List<Traveller> t = td.LoadAll();
                System.out.println(t);
                break;
        		
        	}
        	
        	case 4:
        	{
        		System.out.println("====== delete  traveller ======");
                System.out.println("enter id");
                int id = sc.nextInt();
                TravellerDaoImp td = c.getBean("TravellerDao",TravellerDaoImp.class);
                td.deleteTraveller(id);
                System.out.println("traveller deleted");
                 
                break;
        	}
        	case 5:{
                System.out.println("====== update traveller ======");
                System.out.println("enter id");
                int id = sc.nextInt();
                System.out.println("enter name");
                String name = sc.next();
                System.out.println("enter package");
                String pack = sc.next();
                TravellerDaoImp td = c.getBean("TravellerDao",TravellerDaoImp.class);
                td.update(new Traveller(id,name,pack));
                System.out.println(" traveller updated");
                break;
        	}
        	
        	case 6:
        	{
        		flag = false;
        		break;
             }
        	
        }//switch
        	
        
      }//while
        
      sc.close();
    }//main
}//class
