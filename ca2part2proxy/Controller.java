public class Controller {

    public static void main(String[] args) {
        System.out.println("Select Movie");

//        MovieIF m1 = new RealMovie("C:/movie/terminator2.avi");
//        m1.play();//comment this line. Even if not watching this movie, the movie still is loading...
        MovieIF m1 = new ProxyMovie("C:/movie/terminator2.avi");
        m1.play();//comment this line. If not watching this movie, the movie Will NOT be loaded

    }

}
