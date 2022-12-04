public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Samsung", 2, 2.0F);
        perangkat.informasi();
        System.out.println(" ");

        Laptop laptop = new Laptop("V-Gen", 10, 2.30F, true);
        laptop.webcam = true;
        laptop.informasi();
        laptop.bukaGame("F1 22, F1 Manager 2022");
        laptop.kirimEmail("gmail@sarasamhita.com");
        laptop.kirimEmail("keren@sarasamhita.com", "ayamgoreng@enak.com");
        System.out.println(" ");

        Handphone handphone = new Handphone("Huawei", 8, 3.40F, false);
        handphone.informasi();
        handphone.telfon(628123456);
        handphone.kirimSMS(628123456);
        handphone.kirimSMS(628098765, 621029387);
}
}
