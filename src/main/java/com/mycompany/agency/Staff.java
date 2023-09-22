package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        staffList[0] = new Executive ("Moaath Alrajab", "25 New Tree Line", "516-101-3131", "000-000-1234", 150);
        staffList[1] = new Intern ("Alex", "987 Wood Blvd.", "516-555-8374");
        staffList[2] = new Intern ("Ahmad", "321 Elm Lane", "516-555-7282");
        staffList[3] = new TempEmployee("Sam", "678 Fifth Ave.", "516-555-0690", "516-47-3625", 15.55);
        staffList[4] = new TempEmployee("William", "789 Off Rocker", "516-555-0000", "631-20-3040", 18);
        staffList[5] = new StaffEmployee("John", "456 Off Line", "516-555-0101", "516-65-4321", 1500);


        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
