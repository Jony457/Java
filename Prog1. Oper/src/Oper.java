public class Oper {

    private static Read in = new Read();

    public static void main(String[] args){
        utro();
    }

    public static void utro(){
        System.out.println("Утро. Ты проснулся! Посмотри на часы: ты вовремя встал?");
        if (in.Read()) {
            System.out.println("Молодец! Иди покушай.");
            car();
        }
        else {
            System.out.println("Быстро одевайся!");
            car();
        }
    }
    public static void car(){
        System.out.println("Машина на ходу?");
        if (in.Read()){
            System.out.println("Не забудь ключи и иди прогревать машину");
            benz();
        }
        else{
            System.out.println("Печалька. Попытайся добраться общественным транспортом.");
            delo();
        }
    }
    public static void benz() {
        System.out.println("Стоп! А бензин то есть?");
        if (in.Read()){
            System.out.println("Можешь спокойно ехать на работу.");
            delo();
        }
        else{
            System.out.println("Придётся аехать на заправку, а затем быстро на работу.");
            delo();
        }
    }
    public static void delo(){
        System.out.println("Есть дело?");
        if (in.Read()){
            System.out.println("Ознакомся с ним, или,если уже знаком, вспомни что было.");
            pokaz();
        }
        else{
            System.out.println("Выпить кофе\n Попил? Молодец =)) А теперь пора взяться за работу и найти себе дело");
            delo();
        }
    }
   public static void pokaz(){
       System.out.println("Нужны ли показания?");
       if (in.Read()){
           System.out.println("Свяжись со свидетелями.");
           call();
       }
       else{
           obed();
       }
   }
    public static void obed(){
        System.out.println("Пора обедать!");
        zaс();
    }
    public static void call() {
        System.out.println("Есть ли у них время?");
        if (in.Read()){
            System.out.println("Выехать к ним и взять показания");
            obed();
        }
        else{
            System.out.println("Договориться о встрече с ними в другое время, либо чтобы они сами пришли и дали показания.");
            obed();
        }
    }
    public static void zaс(){
        System.out.println("Есть зацепки?");
        if (in.Read()){
            System.out.println("Едь на место проишествия");
            mesto();
        }
        else{
            System.out.println("Ищи пока не найдешь!");
            zaс();
        }
    }
    public static void mesto(){
        System.out.println("Есть ли люди?");
        if (in.Read()){
            System.out.println("Опросить их");
            osmotr();
        }
        else {
            osmotr();
        }
    }
    public static void osmotr(){
        System.out.println("Произвести детальный осмотр проишествия");
        podoz();
    }
    public static void podoz(){
        System.out.println("Есть ли подазреваемые?");
        if (in.Read()){
            System.out.println("Осталось дооформить дело и передать его следователю.\nВот и рабочий день закончился!");
            dom();
        }
        else{
            day();
        }
    }
    public static void day(){
        System.out.println("Конец рабего дня?");
        if (in.Read()){
            dom();
        }
        else {
            zaс();
        }
    }
    public static void dom(){
        System.out.println("Поезжай домой\nСделай домашние дела\nИди отдыхать.");
        utro();
    }
}
