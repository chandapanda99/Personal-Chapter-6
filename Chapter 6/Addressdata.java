//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class Addressdata
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {


        //Address [] contacts = new Address [10];
        Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
        Address rHome = new Address ("4 Privet Drive", "Lynchburg","OH",60123);
        Address mHome = new Address ("1203 Main Street", "Euclid", "OH",60156);
        Address ken   = new Address ("915 Elm Street", "Homewood", "IL", 60424);
        Address dj   = new Address ("915 Maple Ave", "Homewood", "IL", 60518);
        Address Homes   = new Address ("221 B Baker Street", "London", "UK", 60518);
        Address Bob   = new Address ("124 Conch Street", "Bikini Bottom", "US", 61245);
        Address Ned   = new Address ("740 Evergreen Terrace", "Springfield", "US", 78204);
        Address Ed   = new Address ("9764 Jeopardy Lane","Chicago", "IL", 60678);


        Address [] contacts = {school,rHome,mHome,ken,Homes,Bob,Ned};

        //Sort the Addresses
 


        int hash1 = contacts[3].hash();
        for (Address a : contacts)
        {
            System.out.print(a.hash());
            System.out.println("-" + a.hash() % 30);
        }
        System.out.println(hash1);
        
        Address[] hash_array = new Address[3 * contacts.length];
        
        for (int i = 0; i < contacts.length; i++)
        {
            hash_array[contacts[i].hash()%30] = contacts[i];
        }
        
        for (Address me: hash_array)
        {
            System.out.println(me);
        }




   }
}
