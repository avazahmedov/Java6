public class LapTopSet {
    LapTopBase lapTop1 = new LapTopBase();
    LapTopBase lapTop2 = new LapTopBase("Asus", 16, "Linux", "Black", 750, 2);
    LapTopBase lapTop3 = new LapTopBase();
    LapTopBase lapTop4 = new LapTopBase();
    LapTopBase lapTop5 = new LapTopBase("Acer", 12, "Linux", "Black", 1200, 5);
    LapTopBase lapTop6 = new LapTopBase("HP", 8, "Windows", "Grey", 750, 6);
    int ltcount = 6;
    LapTopBase[] lapTops = new LapTopBase[ltcount];
    public LapTopSet() {

        lapTop1.setMark("Lenovo");
        lapTop1.setRam(8);
        lapTop1.setPrice(600);
        lapTop1.setColor("Grey");
        lapTop1.setOperatingSystem("Windows");
        lapTop1.setNumber(1);

        lapTop3.setMark("Macbook");
        lapTop3.setRam(12);
        lapTop3.setPrice(1200);
        lapTop3.setColor("DarkGrey");
        lapTop3.setOperatingSystem("MacOS");
        lapTop3.setNumber(3);

        lapTop4.setMark("HP");
        lapTop4.setRam(4);
        lapTop4.setPrice(400);
        lapTop4.setColor("Black");
        lapTop4.setOperatingSystem("Linux");
        lapTop4.setNumber(4);


        lapTops[0] = lapTop1;
        lapTops[1] = lapTop2;
        lapTops[2] = lapTop3;
        lapTops[3] = lapTop4;
        lapTops[4] = lapTop5;
        lapTops[5] = lapTop6;
    }
}
