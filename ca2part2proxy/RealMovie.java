//RealMovie keeps link to Movie
public class RealMovie implements MovieIF {

    String linkToFile;

    public RealMovie(String linkToFile) {
        this.linkToFile = linkToFile;
        loadMovie();//loading in constructor
    }

    public void loadMovie() {
        System.out.println("Loading Movie... " + linkToFile);

    }

    @Override
    public void play() {
        System.out.println("Watching Movie " + linkToFile);

    }

}
