/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mattafire
 */
public class Journal {
    public static void main(String[] args) throws InterruptedException{
        String journal= "Through the course of this class I have learned many different things.  First, I like to delay until the time to act is almost due.  Meaning that I like to procrastinate but also, I like to get things done before due date.  For example, with this class many of my deadlines I have worked on for a little bit but when my deadlines approached I had some of my topics where I wanted them but most of the ones that were due on the given date I needed to crack down and finish in a weekend or two.  But because I already had some of the topics done I didn’t have to worry about those, and the other topics I had in progress but just not finished.  The next thing that I learned was that I have a large number of ideas without the complete understanding on how to do them.  I can break apart a problem into the different sections and I understand that there are technologies that I am not aware of.  It is here that I find I struggle a little, which leads me into the next thing that I learned.  I have learned that the simple understanding of some things will sometimes get you the correct google search results but this may not benefit you because you might be looking at the exact results but walk away from them because you don’t know what it is you are looking at.  I had this happen many times as I was looking for different thing.  The major benefit from this class was I had topic names which helped me find what I was looking for.  With this help I generally can find what it is I am looking for.  The next thing I learned is as I know what I am looking for and a specific application I generally can find good code examples and then modify them to what I need them to do.  One of the biggest things I learned from this class is that if I signed up for a class and there is no real instruction I drag my feet a little more and get frustrated because youtube is great in all but it is no substitute for a real instructor.  I also learned from the internship I am in, that many times a job may be given to you with little to no instruction but there is generally someone to get good guidance from.  Through the semester, I learned a lot about a bunch of topics, but because of the way I learned there are many of these topics I will have to relearn and attempt to apply again.  I will also need to learn the best practices of these technologies somewhere else.  I believe I have only learned a way to do the topics but probably not the best.  Overall I have learned about the availability of example code out there and more topics that can help my future programs.  I have also come to realize that if someone holds my hand and shows me how to start and the basics I can excel and go far beyond what is required, I just need help starting.";
        for(int i = 0;i<journal.length();i++){
            System.out.print(journal.charAt(i));
            if(i%80==0&&i>1){
                System.out.println("");
            }
            Thread.sleep(200);
        }
    }
}
