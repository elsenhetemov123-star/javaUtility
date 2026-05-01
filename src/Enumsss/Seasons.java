package Enumsss;

public enum Seasons {
    SUMMER(26),AUTUMN(13),SPRING(17),WINTER(-2);

    public int getCELCI() {
        return CELCI;
    }

    private  final int CELCI;

    Seasons(int CELCI) {
        this.CELCI = CELCI;
    }

    public String prognozWaither(Seasons seasons){
        switch (seasons){
            case SUMMER:
                return "YAY";
            case AUTUMN:
                return "payiz";
            case SPRING:
                return "Yaz";
            case WINTER:
                return "qis";
            default:
                return "namelum movsum";

        }
    }
}
