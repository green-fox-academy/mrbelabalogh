

package Week3.BlogPost;


import java.util.ArrayList;


public class BlogPost {

  public static void main(String[] args) {

    System.out.println("This is the main method!");


    Author JohnDoeAuthor = new Author("John Doe", "Lorem Ipsum", "Lorem Ipsum dolor",
         "2000.05.04.");

    /*
    JohnDoeAuthor.AuthorName = "JohnDoeAuthor";
    JohnDoeAuthor.Title = "Lorem Ipsum";
    JohnDoeAuthor.Text = "Lorem Ipsum dolor sit amet";
    JohnDoeAuthor.PublicationDate = "2000.05.04.";
    System.out.println(JohnDoeAuthor);
     */

    Author TimUrban = new Author("Tim Urban", "Wait but why", "A popular long-form", "2010.10.10");

    Author WilliamTurton = new Author("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28");


    ArrayList<Author> authorsList = new ArrayList<>();
    authorsList.add(JohnDoeAuthor);
    authorsList.add(TimUrban);

    System.out.println(JohnDoeAuthor.AuthorName + " " + JohnDoeAuthor.Title + JohnDoeAuthor.PublicationDate + " " + JohnDoeAuthor.Text);
    System.out.println(TimUrban);
    System.out.println(WilliamTurton.AuthorName + WilliamTurton.Title + WilliamTurton.Text + WilliamTurton.PublicationDate);



    }

  }