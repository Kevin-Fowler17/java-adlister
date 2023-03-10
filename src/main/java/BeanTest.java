import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();
        Album thriller = new Album(1, "Michael Jackson", "Thriller", 1982, 50.2, "Pop, post-disco, funk, rock");
        Album backInBlack = new Album(2, "AC/DC", "Back in Black", 1980, 30.1, "Hard rock");

        albums.add(thriller);
        albums.add(backInBlack);

        for (Album album : albums){
            System.out.println(album.getId() + " " + album.getArtist() + " " + album.getAlbum_name() + " " + album.getRelease_date() + " " + album.getSales() + " " + album.getGenre());
        }


        ArrayList<Quote> quotes = new ArrayList<>();
        Author jkRowling = new Author(1001, "J.K.", "Rowling");
        Author danBrown = new Author(1002, "Dan", "Brown");

        Quote quote1 = new Quote(1001, jkRowling, "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.");
        Quote quote2 = new Quote(1002, danBrown, "Everything is possible. The impossible just takes longer.");

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name() + " said: " + quote.getContent() );
        }

    }
}
