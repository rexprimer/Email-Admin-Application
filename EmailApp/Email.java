package EmailApp;

import java.util.Scanner;

public class Email{
        private String firstName;
        private String lastName;
        private String password;
        private int defaultPasswordlength = 10;
        private String email;
        private String Department;
        private int mailboxCapasity = 500;
        private String aternateEmail;
        private String CompanySuffixe = "company.com";

        //Constructor for email
        public Email( String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            //System.out.println("EMAIL CREATED : " +this.firstName +" " +this.lastName);

            //Call a method asking for department - return the department
            this.Department = setDepartment();
            //System.out.println("Department : " +this.Department);

            //Call a method that returns a random password
            this.password = randomPassword(defaultPasswordlength);
            //System.out.println("Password : " +this.password);

            //Call a method to return an email;
            email = firstName.toLowerCase() + lastName.toLowerCase() +"@" +Department +"." +CompanySuffixe;
            //System.out.println("Your email is :" +email);
        }
       //Ask for Department
        private String setDepartment(){
            System.out.print("Department CODES : \n1 Sales \n2 Dev \n3 ITES \n4 HR \n0 NON \n\nEnter Department Code : ");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            in.close();
            if(depChoice == 1) return "Sales";
            else  if(depChoice == 2) return "Development";
            else if(depChoice == 3) return"ITES";
            else if(depChoice == 4) return "HR";
            else return "";
        }
        // generate random password
        private String randomPassword(int length){
            String passwordSet = "1234567890!@#$%^&*()qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
            char[] password =  new char[length];
            for(int i = 0; i < length; i++)
            {
                int rand = (int) Math.random() * passwordSet.length();      // generating random index based on above string.
                password[i] = passwordSet.charAt(i);
            }
            return password.toString();

        }
        //Set the mailbox capasity
        public void setMailboxCapacity(int capacity){
            this.mailboxCapasity = capacity;
        }
        //set the alternate Email
        public void setAlternateEmail(String AltEmail){
            this.aternateEmail = AltEmail;
        }
        //Change the password
        public void changePassword(String password)
        {
            this.password = password;
        }
        public int getMialboxCapacity(){ return mailboxCapasity;}
        public String getAlternateEmail(){ return aternateEmail;}
        public String getPassword(){return password;}

        public String showInfo(){
            return "\nDisplay Name  : " +firstName +" " +lastName +
                   "\nCompany Email : " +email +
                   "\nPassword      : " +password +
                   "\nMailbox Capacity : " +mailboxCapasity;





        }

        
}