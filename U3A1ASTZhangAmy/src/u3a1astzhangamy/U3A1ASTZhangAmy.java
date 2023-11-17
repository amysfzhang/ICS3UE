/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3a1astzhangamy;
import java.util.Scanner;//Importing the scanner

/**
 *
 * @author Amy Zhang
 * Date: August 8th, 2023
 * A text-based adventure game about a public relations manager working on their company's public image
 * 
 */
public class U3A1ASTZhangAmy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Defining the Scanner to read user input
        
        System.out.println("Welcome to Amy's Adventure Text-Based Game. For a better experience, enlarge the output window");//Displaying title and tips for playing game
        System.out.println("                           Are you ready to play?");//First question for user to answer
        System.out.println("----------------------(Type \"Y\" for yes and \"N\" for no)-----------------------------");//Prompting the user to enter a "Y" or "N"
        String strResponse = input.next();//Declaring strResponse variable to read user's decision
        
        if(strResponse.equals("Y"))//This is the first if
        {   
            //Line break to seperate text, easier to read
            System.out.println("-----------------------------------------------------------------------------------------------");

            //Displaying story lines about first choice
            System.out.println("You are a public relations (PR) manager recently hired by Joe's Mart—a local supermarket chain."
                    + "\nOn your first day, one of your tasks includes dealing with online content."
                    + "\nYou come across a video that shows maggots in one of Joe's Mart's meat packets."
                    + "\nThe director suggests you report it for defamation, but you are not sure if that will only make it gain more attraction.");
            
            //Displayings lines to prompt user's input
            System.out.println("");//Blank line to seperate context from decision
            System.out.println("Do you report the video?");//Giving the user the question for their decision
            System.out.println("----------(Type \"Y\" for yes and \"N\" for no)--------------");//Prompting the user to enter "Y" or "N"
            
            strResponse = input.next();//Reading and storing user's decision in strResponse variable
            
            if(strResponse.equals("N"))//This is the second if 
            {
                //Line break to seperate text, easier to read
                System.out.println("-----------------------------------------------------------------------------------------------");

                //Displaying story lines about second choice
                System.out.println("Against the director's advice, you do not report the video."
                        + "\nThe following days, the video gains more and more views until it starts trending in your area."
                        + "\nThe director is furious with you for letting what should have been a simple task balloon into a big issue."
                        + "\nWhen a local news outlet asks for an interview about the maggot case, you are told to \"deal with what you started.\"");
                
                //Displayings lines to prompt user's input
                System.out.println("");//Blank line to seperate context from decision
                System.out.println("Do you agree to attend the interview?");//Giving the user the question for their decision
                System.out.println("----------(Type \"Y\" for yes and \"N\" for no)--------------");//Prompting the user to enter "Y" or "N"

                strResponse = input.next();//Reading and storing user's decision in strResponse variable

                if(strResponse.equals("Y"))//This is the third if 
                {
                    //Line break to seperate text, easier to read
                    System.out.println("-----------------------------------------------------------------------------------------------");

                    //Displaying story lines about third choice
                    System.out.println("You schedule a live appearance with the news outlet and arrive a couple minutes before."
                            + "\nThe floor manager tells you: \"It's your first time right? The questions might be a little... difficult.\""
                            + "\n"
                            + "\nThe interview starts off well with generic questions about the company and recent sales. However, the next question knocks the wind out of you:"
                            + "\n\"Is it true that we should be wary of not only maggots in our meat, but also the unfair wages of workers there?\""
                            + "\n"
                            + "\nYou've heard your co-workers talk about covering up these cases, but have never done it yourself."
                            + "\nAs a community member, you also wonder if it is true, but as the PR manager, should you be wondering that?");

                    //Displayings lines to prompt user's input
                    System.out.println("");//Blank line to seperate context from decision
                    System.out.println("Do you talk about the rumors during the interview?");//Giving the user the question for their decision
                    System.out.println("----------(Type \"Y\" for yes and \"N\" for no)--------------");//Prompting the user to enter "Y" or "N"

                    strResponse = input.next();//Reading and storing user's decision in strResponse variable
                    
                    if(strResponse.equals("Y"))//This is the forth if 
                    {
                        //Line break to seperate text, easier to read
                        System.out.println("-----------------------------------------------------------------------------------------------");

                        //Displaying story lines about forth choice
                        System.out.println("You decide against hiding the truth and tell the interviewer"
                                + "\n\"I can not confirm or deny it, but I do wonder it myself as well\""
                                + "\n"
                                + "\nAfter the interview, the public seemed quieter and you were glad to have finally wrapped up the maggots case."
                                + "\nHowever, your CEO suddenly calls you to their office the following day to \"talk\" to you."
                                + "\n"
                                + "\nYou arrive and the CEO seems furious. \"Your interview cost us a 30% drop in our stocks and a loss of $120 thousand in profits."
                                + "\nMost of our customers have switched over to our competitor—Mark's Market. For us to stay afloat, we need to redirect the customer back.\""
                                + "\n"
                                + "\nAs you are dismissed, the director outside whispers quietly:\"Find or if you have to, make something up to damage the other company.\"");

                        //Displayings lines to prompt user's input
                        System.out.println("");//Blank line to seperate context from decision
                        System.out.println("Do you agree to spread false information about the rival company?");//Giving the user the question for their decision
                        System.out.println("----------(Type \"Y\" for yes and \"N\" for no)--------------");//Prompting the user to enter "Y" or "N"

                        strResponse = input.next();//Reading and storing user's decision in strResponse variable

                        if(strResponse.equals("Y"))//This is the fifth if 
                        {
                            //Line break to seperate text, easier to read
                            System.out.println("-----------------------------------------------------------------------------------------------");

                            //Displaying story lines about fifth choice
                            System.out.println("You agree to create or spread information against the rival company—Mark's Market."
                                    + "\nHowever, after researching for a couple days, you realize that there is no need to make stuff up."
                                    + "\nThe exploitation of low paid workers was already a prominent issue in Mark's Market."
                                    + "\nYou start to wonder if that interview question was…\n"                                 
                                    + "\nSuddenly, you receive a phone call from Mark's Market's own PR team."
                                    + "\n\"Hello there, we would like to offer you a position in our team with a 15% higher wage than currently.\"");

                            //Displayings lines to prompt user's input
                            System.out.println("");//Blank line to seperate context from decision
                            System.out.println("Do you sign with Mark's Market and leave Joe's Mart?");//Giving the user the question for their decision
                            System.out.println("----------(Type \"Y\" for yes and \"N\" for no)--------------");//Prompting the user to enter "Y" or "N"

                            strResponse = input.next();//Reading and storing user's decision in strResponse variable
                            if(strResponse.equals("Y"))//This is the sixth if 
                            {
                                //Line break to seperate text, easier to read
                                System.out.println("-----------------------------------------------------------------------------------------------");
                
                                //Displaying story lines about seventh ending
                                System.out.println("You accept their offer, sign a new contract and send an email to quit your job at Joe's Mart."
                                        + "\nOn your first day at Mark's Market (as public relations manager) you are told to \"make something up about\" Joe's Market."
                                        + "\nIt should be easy right? Afterall, you used to work there."
                                        + "\n\nWhile preparing, a young co-workers overheard and interprupted: \"Do you need maggots? We still have some spare I think.\""
                                        + "\nThey are told to keep quiet and you wonder what that was about"
                                        + "\n\nFor the next few years, you continue working at Mark's market");
                            }

                            else//This is the else for the sixth if
                            {    
                                //Line break to seperate text, easier to read
                                System.out.println("-----------------------------------------------------------------------------------------------");
                
                                //Displaying story lines about the sixth ending
                                System.out.println("You decline their offer."
                                        + "\nBut right before the call ends, you hear them say sarcastically:"
                                        + "\n\"By the way, well done during the interview. I'm surprised you're so willing to talk badly about"
                                        + "\nyour own company. It worked better than planned for us :)\""
                                        + "\nYou continue to stay loyal toward Joe's Mart and as time goes on, you become promoted as public relations director.");
                            }                        
                        }

                        else//This is the else for the fifth if
                        {
                            //Line break to seperate text, easier to read
                            System.out.println("-----------------------------------------------------------------------------------------------");
                
                            //Displaying story lines about the fifth
                            System.out.println("You stop in your path and turn around. This is not right, making up nonsense for more profit."
                                    + "\n You ask what the director means, but they have already gone inside to talk with the CEO."
                                    + "\nSeveral days pass and you have already forgotten about everything."
                                    + "\nOut of the blue, you receive an email informing you of your employment termination next week."
                                    + "\nIt became difficult to find another job related to PR after this incident, so you settled to work in retail.");
                        }
                    }

                    else//This is the else for the forth if
                    {
                        //Line break to seperate text, easier to read
                        System.out.println("-----------------------------------------------------------------------------------------------");
                
                        //Displaying story lines about the forth
                        System.out.println("\"Unfortunately, it is not my place to say that,\" you calmly reply and shift the topic to an upcoming holiday special."
                                + "\nAfter the interview, many customers no longer shop at Joe's Mart after feelings of deceit."
                                + "\nHowever, the vast majority are unaware and business continues like normal."
                                + "\nLooking back, it was a small hiccup in your career in PR");
                    }
                }

                else//This is the else for the third if
                {
                    //Line break to seperate text, easier to read
                    System.out.println("-----------------------------------------------------------------------------------------------");
                
                    //Displaying the lines for the third ending
                    System.out.println("You decline the request for an interview."
                            + "\nThe report on TV lacks new material and does not garner much attention."
                            + "\nHowever, damage is dealt and the bad press makes your everyday tasks harder than necessary."
                            + "\nThough, as time passes, the maggot video becomes lost to time.");
                }
            }

            else//This is the else for the second if
            {
                //Line break to seperate text, easier to read
                System.out.println("-----------------------------------------------------------------------------------------------");
            
                //Displaying story lines for second ending
                System.out.println("You decide to report the video and it is taken down in the next couple days."
                        + "\nAfter a while, there is no trace of the original video nor its impacts."
                        + "\n\"Good job. keep up the good work,\" the director compliments your decision.");//
            }
        }
        
        else//This is the else for the first if
        {
            //Line break to seperate text, easier to read
            System.out.println("-----------------------------------------------------------------------------------------------");
            
            //Displaying story lines for first ending
            System.out.println("Oh... goodbye then!");//Result of your choice
        }
        
        //Displaying final message for playing the game
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");//Line break to seperate text
        System.out.println("~~ Congrats on completing Amy's adventure game, hope you are satisfied with your results.~~"); //Congradulations message
        System.out.println("                 ~~If not, try some different option next time!~~");//Message for user to play again
    }
}
