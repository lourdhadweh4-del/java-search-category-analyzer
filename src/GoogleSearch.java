import java.util.Scanner;

public class GoogleSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of searches: ");

        int nums = scanner.nextInt();
        scanner.nextLine();

        String [] searches = new String [nums];

        int tech = 0;
        int sports = 0;
        int news = 0;
        int music = 0;

        System.out.println("Enter search topics (Tech, Sports, News, Music): ");

        for(int i = 0; i < searches.length; i++) {
            System.out.println("Search " + (i + 1) + ":");
            searches[i] = scanner.nextLine().trim();

            if(searches[i].equalsIgnoreCase("Tech")) {
                tech++;

            } else if (searches[i].equalsIgnoreCase("Sports")) {
                sports++;

            } else if (searches[i].equalsIgnoreCase("News")) {
                news++;
            } else if (searches[i].equalsIgnoreCase("Music")) {
                music++;
            }
        }
        int total = searches.length;

        double techAverage = (double) tech / total;
        double sportsAverage = (double) sports / total;
        double newsAverage = (double) news / total;
        double musicAverage = (double) music / total;

        System.out.println("Search Summary");
        System.out.println("--------------------------");
        System.out.println("Technology searches: " + tech);
        System.out.println("Sports searches: " + sports);
        System.out.println("News searches: " + news);
        System.out.println("Music searches: " + music);

        System.out.println("=============================");

        System.out.println("Average Searches per Category");
        System.out.println("-----------------------------");
        System.out.printf("\nTechnology Average: %.2f %%", techAverage * 100);
        System.out.printf("\nSports Average:  %.2f %%", sportsAverage * 100);
        System.out.printf("\nNews Average: %.2f %%",  newsAverage * 100);
        System.out.printf("\nMusic Average: %.2f %%", musicAverage * 100);


        System.out.println("\n- Personalized results ");

        if (tech > sports && tech > news && tech > music) {
            System.out.println("- Main Interest: Technology 💻 ");
            System.out.println("- Search Recommendations: ");
            System.out.println("--------------------------");
            System.out.println("* Java Programming Tutorials 👩🏻‍💻 ");
            System.out.println("* Lastest Tech Gadgets 🧑🏻‍💻 ");
            System.out.println("* Artificial Intelligence News 🤖 ");
            System.out.println("^^ Tip: Explore New Programming Topics to Expand your Skills! 🧑🏻‍🔧 ");

        } else if (sports > tech && sports > news && sports > music ) {
            System.out.println("- Main Interest: Sports ⛹🏻 ");
            System.out.println("- Search Recommendations:  ");
            System.out.println("--------------------------");
            System.out.println("* Live Match Scores 🥅 ");
            System.out.println("* Team Schedules 📅 ");
            System.out.println("* Sports Highlights ⚡️ ");
            System.out.println("^^ Sports is your most searched category (" + sports + " searches ⚽️)! ");

        } else if (news > tech && news > sports && news > music) {
            System.out.println("- Main Interest: News 📰 ");
            System.out.println("- Search Recommendations: ");
            System.out.println("--------------------------");
            System.out.println("* Breaking World News 🚨 ");
            System.out.println("* Local News Updates 🗞️ ");
            System.out.println("* Politics and Economy 🌚 ");
            System.out.println("^^ Tip: Stay updated by checking news regularly ⬆️! ");

        } else if (music > tech && music > sports && music > news) {
            System.out.println("- Main Interest: Music 🎹 ");
            System.out.println("- Search Recommendations:  ");
            System.out.println("--------------------------");
            System.out.println("* New Album Release 💿 ");
            System.out.println("* Trending Artists 🧑🏻‍🎨 ");
            System.out.println("* Music Playlist ⏯️ ");
            System.out.println("^^ Tip: Try searching for your favorite artist or genre 😻! ");
        } else {
            System.out.println("- Your interests are balanced across multiple categories! ");
            System.out.println("- Search Recommendations: ");
            System.out.println("--------------------------");
            System.out.println("* Trending Topics Today 📊 ");
            System.out.println("* Popular Searches on Google 👀🔍 ");
        }
    }
}
