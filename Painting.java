/**
 * Created by sing_ on 11/8/2016.
 */
    class Painting {
    protected String title;
    protected String artist;
    protected double value;

    public Painting(String t, String a){
        title = t;
        artist = a;
        value = 400;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Value: " + value);
    }

}
