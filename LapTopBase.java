public class LapTopBase {

    protected String mark;
    protected int ram;
    protected String operatingSystem;
    protected String color;
    protected int price;
    protected int number;



    public LapTopBase(String mark, int ram, String operatingSystem, String color, int price, int number){
        this.mark = mark;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public LapTopBase(){
    }


    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }

    public void setRam(int ram) {
        if (ram>0) {
            this.ram = ram;
        } else System.out.println("Значение ОЗУ должна быть положительным числом!");
    }
    public int getRam() {
        return ram;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        if (price>0) {
            this.price = price;
        } else System.out.println("Цена должна быть положительным числом!");
    }
    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("Number: %d; Mark: %s; RAM: %d; Operating System: %s; Color: %s; Price: %d",
                this.number, this.mark, this.ram, this.operatingSystem, this.color, this.price);
    }

}

