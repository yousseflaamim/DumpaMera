import java.io.IOException;
import java.util.Scanner;

public  class MenuOfTruck {

   public String nam = " ";
   //chose type of truck
    public String typOf_Truck() throws IOException {
        Van van=new Van();
        HeavyTruck heavyTruck=new HeavyTruck();
        SmallTruck smallTruck=new SmallTruck();
         this.nam=nam;
        System.out.println("which truck do you have");
        System.out.println("... 1  = Van ...");
        System.out.println("... 2  = Small truck... ");
        System.out.println("....3  = Heavy truck ...");
        System.out.println("....4 = back to menu....");

        // scanner of input customer

        Scanner scanner = new Scanner(System.in);
          int  name = scanner.nextInt();
//registration of the customer choice of truck and information
if (name==1||name==2||name==3||name==4)
            switch (name) {
                      case 1 :van.nameOf_truck();
                                van.sizOf_truck();
                             break;
                      case 2:smallTruck.nameOf_truck();
                                    smallTruck.sizOf_truck();
                                    break;
                      case 3:heavyTruck.nameOf_truck();
                                          heavyTruck.sizOf_truck();
                          break;
                      case 4:
                          ShowMenuOfParking.listOfMenuParkDump();
                             break;





            }


            return nam;
        }

    }






